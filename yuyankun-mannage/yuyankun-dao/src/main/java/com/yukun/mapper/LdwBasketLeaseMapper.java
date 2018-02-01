package com.yukun.mapper;

import com.yukun.pojo.LdwBasketLease;
import com.yukun.pojo.LdwBasketLeaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LdwBasketLeaseMapper {
    int countByExample(LdwBasketLeaseExample example);

    int deleteByExample(LdwBasketLeaseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LdwBasketLease record);

    int insertSelective(LdwBasketLease record);

    List<LdwBasketLease> selectByExample(LdwBasketLeaseExample example);

    LdwBasketLease selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LdwBasketLease record, @Param("example") LdwBasketLeaseExample example);

    int updateByExample(@Param("record") LdwBasketLease record, @Param("example") LdwBasketLeaseExample example);

    int updateByPrimaryKeySelective(LdwBasketLease record);

    int updateByPrimaryKey(LdwBasketLease record);
}