package com.crk.gril.dao;

import com.crk.gril.domain.TbArea;

public interface TbAreaMapper {
    int deleteByPrimaryKey(Integer areaId);

    int insert(TbArea record);

    int insertSelective(TbArea record);

    TbArea selectByPrimaryKey(Integer areaId);

    int updateByPrimaryKeySelective(TbArea record);

    int updateByPrimaryKey(TbArea record);
}