package com.baidu.codemaster.web;

import com.baidu.codemaster.bean.DistrictArea;
import com.baidu.codemaster.bean.HealthCheck;
import com.baidu.codemaster.dal.model.HouseInfo;
import com.baidu.codemaster.service.HouseService;
import com.baidu.codemaster.service.PredictService;
import com.fasterxml.jackson.databind.JsonNode;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class IndexController {

    @Resource
    private PredictService predictService;

    @Resource
    private HouseService houseService;

    @RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
    public HealthCheck healthCheck() {
        return new HealthCheck();
    }

    @RequestMapping(value = "/predict/{budget}", method = RequestMethod.GET)
    @ResponseBody
    public List<DistrictArea> getPredictResult(@PathVariable("budget") int budget) {
        return predictService.predictAreaAccordingToBudget(budget);
    }

    @RequestMapping(value = "/house", method = RequestMethod.POST)
    @ResponseBody
    public List<HouseInfo> getHouseList1(@RequestBody JsonNode jsonpObject) {

        Integer budget = jsonpObject.get("budget").asInt();
        String district = jsonpObject.get("district").textValue();

        String residentialZone = jsonpObject.get("residentialZone") != null
                && !StringUtils.isBlank(jsonpObject.get("residentialZone").textValue())
                ? jsonpObject.get("residentialZone").textValue() : null;
        double area = jsonpObject.get("area") != null ? jsonpObject.get("area").asDouble() : 0;
        String houseType = jsonpObject.get("houseType") != null ? jsonpObject.get("houseType").textValue() : null;
        String orientation = jsonpObject.get("orientation") != null ? jsonpObject.get("orientation").textValue() : null;

        return houseService.getHouseList(district, budget, residentialZone, area, houseType, orientation);
    }

    @RequestMapping(value = "/house/{id}", method = RequestMethod.GET)
    @ResponseBody
    public HouseInfo getUser(@PathVariable("id") String id) {
        return houseService.getHouseById(id);
    }
}
