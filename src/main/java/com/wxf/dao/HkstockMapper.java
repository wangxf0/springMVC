package com.wxf.dao;

import com.wxf.domain.model.Hkstock;

public interface HkstockMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Hkstock record);

    int insertSelective(Hkstock record);

    Hkstock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Hkstock record);

    int updateByPrimaryKey(Hkstock record);
}