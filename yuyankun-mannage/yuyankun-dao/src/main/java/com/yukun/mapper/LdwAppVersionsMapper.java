package com.yukun.mapper;

import com.yukun.pojo.LdwAppVersions;
import com.yukun.pojo.LdwAppVersionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LdwAppVersionsMapper {
    int countByExample(LdwAppVersionsExample example);

    int deleteByExample(LdwAppVersionsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LdwAppVersions record);

    int insertSelective(LdwAppVersions record);

    List<LdwAppVersions> selectByExample(LdwAppVersionsExample example);

    LdwAppVersions selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LdwAppVersions record, @Param("example") LdwAppVersionsExample example);

    int updateByExample(@Param("record") LdwAppVersions record, @Param("example") LdwAppVersionsExample example);

    int updateByPrimaryKeySelective(LdwAppVersions record);

    int updateByPrimaryKey(LdwAppVersions record);
}