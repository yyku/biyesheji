package com.yukun.mapper;

import com.yukun.pojo.LdwAlipayParams;
import com.yukun.pojo.LdwAlipayParamsExample;
import com.yukun.pojo.LdwAlipayParamsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LdwAlipayParamsMapper {
    int countByExample(LdwAlipayParamsExample example);

    int deleteByExample(LdwAlipayParamsExample example);

    int deleteByPrimaryKey(LdwAlipayParamsKey key);

    int insert(LdwAlipayParams record);

    int insertSelective(LdwAlipayParams record);

    List<LdwAlipayParams> selectByExample(LdwAlipayParamsExample example);

    LdwAlipayParams selectByPrimaryKey(LdwAlipayParamsKey key);

    int updateByExampleSelective(@Param("record") LdwAlipayParams record, @Param("example") LdwAlipayParamsExample example);

    int updateByExample(@Param("record") LdwAlipayParams record, @Param("example") LdwAlipayParamsExample example);

    int updateByPrimaryKeySelective(LdwAlipayParams record);

    int updateByPrimaryKey(LdwAlipayParams record);
}