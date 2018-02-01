package com.yukun.mapper;

import com.yukun.pojo.LdwCategory;
import com.yukun.pojo.LdwCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LdwCategoryMapper {
    int countByExample(LdwCategoryExample example);

    int deleteByExample(LdwCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LdwCategory record);

    int insertSelective(LdwCategory record);

    List<LdwCategory> selectByExample(LdwCategoryExample example);

    LdwCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LdwCategory record, @Param("example") LdwCategoryExample example);

    int updateByExample(@Param("record") LdwCategory record, @Param("example") LdwCategoryExample example);

    int updateByPrimaryKeySelective(LdwCategory record);

    int updateByPrimaryKey(LdwCategory record);
}