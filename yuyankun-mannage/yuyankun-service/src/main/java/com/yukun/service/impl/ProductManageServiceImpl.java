package com.yukun.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yukun.mapper.GoodsMapper;
import com.yukun.pojo.Goods;
import com.yukun.service.ProductManageService;

@Service
public class ProductManageServiceImpl implements ProductManageService{
	@Autowired
	private GoodsMapper goodsMapper;
	
/**
 * 销售中
 */
	@Override
	public List<Goods> selctInSale(String createId) {
		List<Goods> lists = goodsMapper.selctInSale(createId);
		if(null != lists && lists.size() > 0){
			return lists;
		}
		return null;
	}

	/**
	 * 停止销售
	 */
		
		public List<Goods> selctXiaJia(String createId) {
			List<Goods> lists = goodsMapper.selctXiaJia(createId);
			if(null != lists && lists.size() > 0){
				return lists;
			}
			return null;
		}
		
		
}
