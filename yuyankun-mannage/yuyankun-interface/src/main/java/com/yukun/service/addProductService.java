package com.yukun.service;

import java.util.List;

import com.yukun.pojo.Goods;
import com.yukun.pojo.LdwArea;
import com.yukun.pojo.LdwProduct;
import com.yukun.pojo.LdwUnit;
import com.yukun.pojo.LdwUnitType;
import com.yukun.pojo.Model;
import com.yukun.pojo.ModelType;
import com.yukun.pojo.ProductDesc;
import com.yukun.utils.E3Result;


public interface addProductService {
List<LdwProduct> getProductByThreeLevel();
List<LdwArea> getAreaLevel();
LdwUnitType selectProductType(LdwUnitType unitType);
List<LdwUnit> selectProductLeverType(Long typeId);
List<Model> seleteAllNmwMode();
List<ModelType> selectAllNmwModeType();

Boolean addProduct(Goods goods,ProductDesc desc);
}
