package com.yukun.mapper;

import com.yukun.pojo.LdwAdvertisement;
import com.yukun.pojo.LdwAdvertisementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LdwAdvertisementMapper {
    int countByExample(LdwAdvertisementExample example);

    int deleteByExample(LdwAdvertisementExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LdwAdvertisement record);

    int insertSelective(LdwAdvertisement record);

    List<LdwAdvertisement> selectByExample(LdwAdvertisementExample example);

    LdwAdvertisement selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LdwAdvertisement record, @Param("example") LdwAdvertisementExample example);

    int updateByExample(@Param("record") LdwAdvertisement record, @Param("example") LdwAdvertisementExample example);

    int updateByPrimaryKeySelective(LdwAdvertisement record);

    int updateByPrimaryKey(LdwAdvertisement record);
}