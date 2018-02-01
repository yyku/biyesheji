package com.yukun.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yukun.mapper.GoodsMapper;
import com.yukun.pojo.Goods;
import com.yukun.service.findSixProduct;
@Service
public class findSixProductImpl implements findSixProduct {
@Autowired
private GoodsMapper goodsMapper;

@Override
public List<Goods> findGreenProduct() {
	
    Random rd = new Random();
    List<Goods> greenPurchaseGoodsList = goodsMapper.getAllgreenPurchaseGoods();
    
    return greenPurchaseGoodsList;
}

@Override
public List<Goods> findHarmlessProduct() {
	
    Random rd = new Random();
    List<Goods> harmlessPurchaseGoodsList = goodsMapper.getharmlessPurchaseGoods();
   
    return harmlessPurchaseGoodsList;
}

@Override
public List<Goods> findOrganicProduct() {
    Random rd = new Random();
    List<Goods> organicPurchaseGoodsList = goodsMapper.getorganicPurchaseGoods();
    
    return organicPurchaseGoodsList;
}


}
