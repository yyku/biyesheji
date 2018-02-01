package com.yukun.mapper;

import com.yukun.pojo.LdwBasketUserInformation;
import com.yukun.pojo.LdwBasketUserInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LdwBasketUserInformationMapper {
    int countByExample(LdwBasketUserInformationExample example);

    int deleteByExample(LdwBasketUserInformationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LdwBasketUserInformation record);

    int insertSelective(LdwBasketUserInformation record);

    List<LdwBasketUserInformation> selectByExample(LdwBasketUserInformationExample example);

    LdwBasketUserInformation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LdwBasketUserInformation record, @Param("example") LdwBasketUserInformationExample example);

    int updateByExample(@Param("record") LdwBasketUserInformation record, @Param("example") LdwBasketUserInformationExample example);

    int updateByPrimaryKeySelective(LdwBasketUserInformation record);

    int updateByPrimaryKey(LdwBasketUserInformation record);
}