package com.yukun.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yukun.mapper.GoodsMapper;
import com.yukun.mapper.LdwAreaMapper;
import com.yukun.mapper.LdwProductMapper;
import com.yukun.mapper.LdwUnitMapper;
import com.yukun.mapper.LdwUnitTypeMapper;
import com.yukun.mapper.ModelMapper;
import com.yukun.mapper.ModelTypeMapper;
import com.yukun.mapper.ProductDescMapper;
import com.yukun.pojo.Goods;
import com.yukun.pojo.LdwArea;
import com.yukun.pojo.LdwProduct;
import com.yukun.pojo.LdwUnit;
import com.yukun.pojo.LdwUnitType;
import com.yukun.pojo.Model;
import com.yukun.pojo.ModelType;
import com.yukun.pojo.ProductDesc;
import com.yukun.service.addProductService;
import com.yukun.utils.E3Result;
import com.yukun.utils.IDUtils;
@Service
public class addProductServiceImpl implements addProductService{

	@Autowired
	private LdwProductMapper ldwProductMapper;
	@Autowired
	private LdwAreaMapper ldware;
	@Autowired
	private LdwUnitTypeMapper ldwUnitType;
	@Autowired
	private LdwUnitMapper ldwUtils;
	@Autowired
	private ModelMapper model;
	@Autowired
	private ModelTypeMapper modelType;
	@Autowired
	private GoodsMapper goodsMapper;
	@Autowired
	private ProductDescMapper productdesc;
	@Override
	public List<LdwProduct> getProductByThreeLevel() {
		List<LdwProduct> li = ldwProductMapper.getProductByThreeLevel();
		return li;
	}
	@Override
	public List<LdwArea> getAreaLevel() {
		List<LdwArea> area = ldware.getAreaLever();
		return area;
	}
	@Override
	public LdwUnitType selectProductType(LdwUnitType unitType) {
		return ldwUnitType.selectProductType(unitType);
		
	}
	@Override
	public List<LdwUnit> selectProductLeverType(Long typeId) {
		List<LdwUnit> li = ldwUtils.selectProductLeverType(typeId);
		return li;
	}
	@Override
	public List<Model> seleteAllNmwMode() {
		return model.seleteAllNmwMode();
	}
	@Override
	public List<ModelType> selectAllNmwModeType() {
		
		return modelType.selectAllNmwModeType();
	}
	
	public Boolean addProduct(Goods goods, ProductDesc productDesc) {
		Boolean boo =false;
		Long aLong = IDUtils.genItemId();
		try {
			goods.setId(String.valueOf(aLong));
		    goods.setCreateTime(new Date());
		    goods.setUpdateTime(new Date());
		    goods.setIsDelete(0);
		    goods.setState(1);
		    //发布者账号
		    //真实姓名
		    //发布者id   session
		    Integer integer1 =goodsMapper.insert(goods);
		    if(0 != integer1){
		    	boo =true;
		    }
		    ProductDesc productDe = new ProductDesc();
		    productDe.setItemId(goods.getId());
		    productDe.setItemDesc(productDesc.getItemDesc());
		    productDe.setCreated(new Date());
		    productDe.setUpdated(new Date());
		    Integer integer2 =productdesc.insert(productDe);
		    if(0 != integer2){
		    	boo =true;
		    }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return boo;
	}

}
