package com.yukun.service;

import java.util.List;

import com.yukun.pojo.Goods;

public interface ProductManageService {
	List<Goods> selctInSale(String createId);
	List<Goods> selctXiaJia(String createId);

}
