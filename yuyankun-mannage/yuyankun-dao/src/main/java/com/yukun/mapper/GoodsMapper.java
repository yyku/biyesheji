package com.yukun.mapper;

import com.yukun.pojo.Goods;
import com.yukun.pojo.GoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsMapper {
    int countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(String id);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsExample example);

    Goods selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
    public List<Goods> getAllgreenPurchaseGoods();
    public List<Goods> getharmlessPurchaseGoods();
    public List<Goods> getorganicPurchaseGoods();
  
    public List<Goods> selctInSale(String createId);
    public List<Goods> selctXiaJia(String createId);
    
}