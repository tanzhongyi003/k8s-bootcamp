package com.baidu.codemaster.service.impl;

import com.baidu.codemaster.bean.DistrictArea;
import com.baidu.codemaster.service.PredictService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PredictServiceImpl implements PredictService {

    @Value("${a1}")
    private double a1;

    @Value("${b1}")
    private double b1;

    @Value("${a2}")
    private double a2;

    @Value("${b2}")
    private double b2;

    @Value("${a3}")
    private double a3;

    @Value("${b3}")
    private double b3;

    @Override
    public List<DistrictArea> predictAreaAccordingToBudget(int budget) {
        List<DistrictArea> result = new ArrayList<DistrictArea>();
        result.add(new DistrictArea("西二旗", (budget - b1) / a1));
        result.add(new DistrictArea("回龙观", (budget - b2) / a2));
        result.add(new DistrictArea("北苑", (budget - b3) / a3));
        return result;
    }
}
