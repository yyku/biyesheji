package com.yukun.mapper;

import com.yukun.pojo.LdwUnitType;
import com.yukun.pojo.LdwUnitTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LdwUnitTypeMapper {
    int countByExample(LdwUnitTypeExample example);

    int deleteByExample(LdwUnitTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LdwUnitType record);

    int insertSelective(LdwUnitType record);

    List<LdwUnitType> selectByExample(LdwUnitTypeExample example);

    LdwUnitType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LdwUnitType record, @Param("example") LdwUnitTypeExample example);

    int updateByExample(@Param("record") LdwUnitType record, @Param("example") LdwUnitTypeExample example);

    int updateByPrimaryKeySelective(LdwUnitType record);

    int updateByPrimaryKey(LdwUnitType record);
    LdwUnitType selectProductType(LdwUnitType unitType);
}