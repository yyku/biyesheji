package com.yukun.mapper;

import com.yukun.pojo.AppUrl;
import com.yukun.pojo.AppUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppUrlMapper {
    int countByExample(AppUrlExample example);

    int deleteByExample(AppUrlExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppUrl record);

    int insertSelective(AppUrl record);

    List<AppUrl> selectByExample(AppUrlExample example);

    AppUrl selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AppUrl record, @Param("example") AppUrlExample example);

    int updateByExample(@Param("record") AppUrl record, @Param("example") AppUrlExample example);

    int updateByPrimaryKeySelective(AppUrl record);

    int updateByPrimaryKey(AppUrl record);
}