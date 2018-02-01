package com.yukun.mapper;

import com.yukun.pojo.ProductDesc;
import com.yukun.pojo.ProductDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductDescMapper {
    int countByExample(ProductDescExample example);

    int deleteByExample(ProductDescExample example);

    int deleteByPrimaryKey(String itemId);

    int insert(ProductDesc record);

    int insertSelective(ProductDesc record);

    List<ProductDesc> selectByExampleWithBLOBs(ProductDescExample example);

    List<ProductDesc> selectByExample(ProductDescExample example);

    ProductDesc selectByPrimaryKey(String itemId);

    int updateByExampleSelective(@Param("record") ProductDesc record, @Param("example") ProductDescExample example);

    int updateByExampleWithBLOBs(@Param("record") ProductDesc record, @Param("example") ProductDescExample example);

    int updateByExample(@Param("record") ProductDesc record, @Param("example") ProductDescExample example);

    int updateByPrimaryKeySelective(ProductDesc record);

    int updateByPrimaryKeyWithBLOBs(ProductDesc record);

    int updateByPrimaryKey(ProductDesc record);
}