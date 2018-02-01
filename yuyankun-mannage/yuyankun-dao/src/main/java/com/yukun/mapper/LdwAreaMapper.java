package com.yukun.mapper;

import com.yukun.pojo.LdwArea;
import com.yukun.pojo.LdwAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LdwAreaMapper {
    int countByExample(LdwAreaExample example);

    int deleteByExample(LdwAreaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LdwArea record);

    int insertSelective(LdwArea record);

    List<LdwArea> selectByExample(LdwAreaExample example);

    LdwArea selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LdwArea record, @Param("example") LdwAreaExample example);

    int updateByExample(@Param("record") LdwArea record, @Param("example") LdwAreaExample example);

    int updateByPrimaryKeySelective(LdwArea record);

    int updateByPrimaryKey(LdwArea record);
    List<LdwArea> getAreaLever();
}