package com.yukun.mapper;

import com.yukun.pojo.LdwBasket;
import com.yukun.pojo.LdwBasketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LdwBasketMapper {
    int countByExample(LdwBasketExample example);

    int deleteByExample(LdwBasketExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LdwBasket record);

    int insertSelective(LdwBasket record);

    List<LdwBasket> selectByExample(LdwBasketExample example);

    LdwBasket selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LdwBasket record, @Param("example") LdwBasketExample example);

    int updateByExample(@Param("record") LdwBasket record, @Param("example") LdwBasketExample example);

    int updateByPrimaryKeySelective(LdwBasket record);

    int updateByPrimaryKey(LdwBasket record);
}