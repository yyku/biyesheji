package com.yukun.mapper;

import com.yukun.pojo.LdwAlipayOrder;
import com.yukun.pojo.LdwAlipayOrderExample;
import com.yukun.pojo.LdwAlipayOrderKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LdwAlipayOrderMapper {
    int countByExample(LdwAlipayOrderExample example);

    int deleteByExample(LdwAlipayOrderExample example);

    int deleteByPrimaryKey(LdwAlipayOrderKey key);

    int insert(LdwAlipayOrder record);

    int insertSelective(LdwAlipayOrder record);

    List<LdwAlipayOrder> selectByExample(LdwAlipayOrderExample example);

    LdwAlipayOrder selectByPrimaryKey(LdwAlipayOrderKey key);

    int updateByExampleSelective(@Param("record") LdwAlipayOrder record, @Param("example") LdwAlipayOrderExample example);

    int updateByExample(@Param("record") LdwAlipayOrder record, @Param("example") LdwAlipayOrderExample example);

    int updateByPrimaryKeySelective(LdwAlipayOrder record);

    int updateByPrimaryKey(LdwAlipayOrder record);
}