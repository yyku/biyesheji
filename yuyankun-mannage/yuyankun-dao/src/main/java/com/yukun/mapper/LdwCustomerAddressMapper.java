package com.yukun.mapper;

import com.yukun.pojo.LdwCustomerAddress;
import com.yukun.pojo.LdwCustomerAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LdwCustomerAddressMapper {
    int countByExample(LdwCustomerAddressExample example);

    int deleteByExample(LdwCustomerAddressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LdwCustomerAddress record);

    int insertSelective(LdwCustomerAddress record);

    List<LdwCustomerAddress> selectByExample(LdwCustomerAddressExample example);

    LdwCustomerAddress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LdwCustomerAddress record, @Param("example") LdwCustomerAddressExample example);

    int updateByExample(@Param("record") LdwCustomerAddress record, @Param("example") LdwCustomerAddressExample example);

    int updateByPrimaryKeySelective(LdwCustomerAddress record);

    int updateByPrimaryKey(LdwCustomerAddress record);
}