package com.yukun.mapper;

import com.yukun.pojo.User;
import com.yukun.pojo.UserTypeLerve;
import com.yukun.pojo.UserTypeLerveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTypeLerveMapper {
    int countByExample(UserTypeLerveExample example);

    int deleteByExample(UserTypeLerveExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserTypeLerve record);

    int insertSelective(UserTypeLerve record);

    List<UserTypeLerve> selectByExample(UserTypeLerveExample example);

    UserTypeLerve selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserTypeLerve record, @Param("example") UserTypeLerveExample example);

    int updateByExample(@Param("record") UserTypeLerve record, @Param("example") UserTypeLerveExample example);

    int updateByPrimaryKeySelective(UserTypeLerve record);

    int updateByPrimaryKey(UserTypeLerve record);
    List<UserTypeLerve> selectUserType();
    
}