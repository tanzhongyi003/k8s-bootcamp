package com.baidu.codemaster.dal.dao;


import com.baidu.codemaster.dal.model.HouseInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouseDao {

    HouseInfo getHouseById(@Param("id") String id);

    List<HouseInfo> getHouseList(@Param("house") HouseInfo house);
}
