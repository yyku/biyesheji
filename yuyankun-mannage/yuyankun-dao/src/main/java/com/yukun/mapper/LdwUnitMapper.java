package com.yukun.mapper;

import com.yukun.pojo.LdwUnit;
import com.yukun.pojo.LdwUnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LdwUnitMapper {
    int countByExample(LdwUnitExample example);

    int deleteByExample(LdwUnitExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LdwUnit record);

    int insertSelective(LdwUnit record);

    List<LdwUnit> selectByExample(LdwUnitExample example);

    LdwUnit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LdwUnit record, @Param("example") LdwUnitExample example);

    int updateByExample(@Param("record") LdwUnit record, @Param("example") LdwUnitExample example);

    int updateByPrimaryKeySelective(LdwUnit record);

    int updateByPrimaryKey(LdwUnit record);
    List<LdwUnit> selectProductLeverType(Long typeId);
}