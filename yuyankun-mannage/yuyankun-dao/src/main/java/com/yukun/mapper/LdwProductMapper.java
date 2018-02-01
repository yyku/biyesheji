package com.yukun.mapper;

import com.yukun.pojo.LdwProduct;
import com.yukun.pojo.LdwProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LdwProductMapper {
    int countByExample(LdwProductExample example);

    int deleteByExample(LdwProductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LdwProduct record);

    int insertSelective(LdwProduct record);

    List<LdwProduct> selectByExample(LdwProductExample example);

    LdwProduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LdwProduct record, @Param("example") LdwProductExample example);

    int updateByExample(@Param("record") LdwProduct record, @Param("example") LdwProductExample example);

    int updateByPrimaryKeySelective(LdwProduct record);

    int updateByPrimaryKey(LdwProduct record);
    List<LdwProduct> getProductByThreeLevel();
}