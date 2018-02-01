package com.yukun.mapper;

import com.yukun.pojo.LdwBasketMoney;
import com.yukun.pojo.LdwBasketMoneyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LdwBasketMoneyMapper {
    int countByExample(LdwBasketMoneyExample example);

    int deleteByExample(LdwBasketMoneyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LdwBasketMoney record);

    int insertSelective(LdwBasketMoney record);

    List<LdwBasketMoney> selectByExample(LdwBasketMoneyExample example);

    LdwBasketMoney selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LdwBasketMoney record, @Param("example") LdwBasketMoneyExample example);

    int updateByExample(@Param("record") LdwBasketMoney record, @Param("example") LdwBasketMoneyExample example);

    int updateByPrimaryKeySelective(LdwBasketMoney record);

    int updateByPrimaryKey(LdwBasketMoney record);
}