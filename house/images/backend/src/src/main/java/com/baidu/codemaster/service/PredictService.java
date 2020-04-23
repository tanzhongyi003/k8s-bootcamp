package com.baidu.codemaster.service;

import com.baidu.codemaster.bean.DistrictArea;

import java.util.List;


public interface PredictService {
    List<DistrictArea> predictAreaAccordingToBudget(int budget);
}
