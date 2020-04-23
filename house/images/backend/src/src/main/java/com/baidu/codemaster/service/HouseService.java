package com.baidu.codemaster.service;

import com.baidu.codemaster.dal.model.HouseInfo;

import java.util.List;

public interface HouseService {
    HouseInfo getHouseById(String id);

    List<HouseInfo> getHouseList(String district, Integer totalPrice,
                                 String residentialZone, double area, String houseType, String orientation);

}
