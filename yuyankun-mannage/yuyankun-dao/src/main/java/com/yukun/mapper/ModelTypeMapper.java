package com.yukun.mapper;

import com.yukun.pojo.ModelType;
import com.yukun.pojo.ModelTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelTypeMapper {
    int countByExample(ModelTypeExample example);

    int deleteByExample(ModelTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ModelType record);

    int insertSelective(ModelType record);

    List<ModelType> selectByExample(ModelTypeExample example);

    ModelType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ModelType record, @Param("example") ModelTypeExample example);

    int updateByExample(@Param("record") ModelType record, @Param("example") ModelTypeExample example);

    int updateByPrimaryKeySelective(ModelType record);

    int updateByPrimaryKey(ModelType record);
    public List<ModelType> selectAllNmwModeType();
}