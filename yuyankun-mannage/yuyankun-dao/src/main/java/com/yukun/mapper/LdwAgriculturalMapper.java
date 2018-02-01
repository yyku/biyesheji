package com.yukun.mapper;

import com.yukun.pojo.LdwAgricultural;
import com.yukun.pojo.LdwAgriculturalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LdwAgriculturalMapper {
    int countByExample(LdwAgriculturalExample example);

    int deleteByExample(LdwAgriculturalExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LdwAgricultural record);

    int insertSelective(LdwAgricultural record);

    List<LdwAgricultural> selectByExample(LdwAgriculturalExample example);

    LdwAgricultural selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LdwAgricultural record, @Param("example") LdwAgriculturalExample example);

    int updateByExample(@Param("record") LdwAgricultural record, @Param("example") LdwAgriculturalExample example);

    int updateByPrimaryKeySelective(LdwAgricultural record);

    int updateByPrimaryKey(LdwAgricultural record);
}