package com.yukun.mapper;

import com.yukun.pojo.LdwBasketNumber;
import com.yukun.pojo.LdwBasketNumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LdwBasketNumberMapper {
    int countByExample(LdwBasketNumberExample example);

    int deleteByExample(LdwBasketNumberExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LdwBasketNumber record);

    int insertSelective(LdwBasketNumber record);

    List<LdwBasketNumber> selectByExample(LdwBasketNumberExample example);

    LdwBasketNumber selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LdwBasketNumber record, @Param("example") LdwBasketNumberExample example);

    int updateByExample(@Param("record") LdwBasketNumber record, @Param("example") LdwBasketNumberExample example);

    int updateByPrimaryKeySelective(LdwBasketNumber record);

    int updateByPrimaryKey(LdwBasketNumber record);
}