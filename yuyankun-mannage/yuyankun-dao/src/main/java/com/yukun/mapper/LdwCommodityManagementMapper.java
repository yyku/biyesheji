package com.yukun.mapper;

import com.yukun.pojo.LdwCommodityManagement;
import com.yukun.pojo.LdwCommodityManagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LdwCommodityManagementMapper {
    int countByExample(LdwCommodityManagementExample example);

    int deleteByExample(LdwCommodityManagementExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LdwCommodityManagement record);

    int insertSelective(LdwCommodityManagement record);

    List<LdwCommodityManagement> selectByExample(LdwCommodityManagementExample example);

    LdwCommodityManagement selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LdwCommodityManagement record, @Param("example") LdwCommodityManagementExample example);

    int updateByExample(@Param("record") LdwCommodityManagement record, @Param("example") LdwCommodityManagementExample example);

    int updateByPrimaryKeySelective(LdwCommodityManagement record);

    int updateByPrimaryKey(LdwCommodityManagement record);
}