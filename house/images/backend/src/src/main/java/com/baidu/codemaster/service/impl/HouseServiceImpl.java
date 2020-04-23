package com.baidu.codemaster.service.impl;

import com.baidu.codemaster.dal.dao.HouseDao;
import com.baidu.codemaster.dal.model.HouseInfo;
import com.baidu.codemaster.service.HouseService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class HouseServiceImpl implements HouseService {

    @Resource
    private HouseDao houseDao;

    @Override
    public HouseInfo getHouseById(String id) {
        return houseDao.getHouseById(id);
    }

    @Override
    public List<HouseInfo> getHouseList(String district, Integer totalPrice, String residentialZone, double area,
                                        String houseType, String orientation) {
        HouseInfo condition = new HouseInfo();
        condition.setDistrict(district);
        condition.setTotalPrice(totalPrice);
        condition.setResidentialZone(residentialZone);
        condition.setArea(area);
        condition.setHouseType(houseType);
        condition.setOrientation(orientation);

        return houseDao.getHouseList(condition);
    }
}
