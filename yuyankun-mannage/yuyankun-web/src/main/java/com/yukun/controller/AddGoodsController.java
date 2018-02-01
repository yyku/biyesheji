package com.yukun.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.velocity.VelocityEngineFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yukun.pojo.Goods;
import com.yukun.pojo.LdwArea;
import com.yukun.pojo.LdwProduct;
import com.yukun.pojo.LdwUnit;
import com.yukun.pojo.LdwUnitType;
import com.yukun.pojo.Model;
import com.yukun.pojo.ModelType;
import com.yukun.pojo.ProductDesc;
import com.yukun.service.addProductService;
import com.yukun.utils.JsonUtil;
//import com.yukun.utils.JsonUtils;

@Controller
@RequestMapping("/addProduct")
public class AddGoodsController {
@Autowired
private addProductService productService;
/**
 * 产品等级
 * @return
 */
@RequestMapping("/ProductByThreeLevel")
@ResponseBody
public JsonUtil addGoods(){
	JsonUtil jsonUtil = new JsonUtil();
	List<LdwProduct> productList = null;
	try {
		productList = productService.getProductByThreeLevel();
		if(productList.size() > 0 && productList != null){
			jsonUtil.setObj(productList);
			jsonUtil.setSuccess(true);
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		jsonUtil.setMsg("服务器异常");
	}
	return jsonUtil;
}
/**
 * 地区
 * @return
 */
@RequestMapping(value = "/getYzsAreaByThreeLevels")
@ResponseBody
public JsonUtil getYzsAreaByThreeLevels() {
	JsonUtil jsonUtil = new JsonUtil();
    List<LdwArea> yzsAreaList=null;
    try {
        
            yzsAreaList= productService.getAreaLevel();
            if (null != yzsAreaList && yzsAreaList.size()>0) {
            	jsonUtil.setObj(yzsAreaList);
                jsonUtil.setSuccess(true);
            }  
    }catch (Exception e)
    {
    	jsonUtil.setMsg("服务器异常");
    }
    return jsonUtil;
}
/**
 * 获取产品产量
 *
 * @return
 */
@RequestMapping(value = "/getOutputUnits")
@ResponseBody
public JsonUtil getOutputUnits() {
	JsonUtil jsonUtil = new JsonUtil();
     LdwUnitType ldwUnitType = new LdwUnitType();
     ldwUnitType.setUnitTypeName("产品规格");
     ldwUnitType = productService.selectProductType(ldwUnitType);
    if (null != ldwUnitType) {
        List<LdwUnit> outputs = productService.selectProductLeverType(ldwUnitType.getId());
        if (0 != outputs.size()) {
        	jsonUtil.setObj(outputs);
        	jsonUtil.setSuccess(true);
        }
    }
    return jsonUtil;
}

/**
 * 获取产品等级
 *
 * @return
 */
@RequestMapping(value = "/getProductLevelUnits")
@ResponseBody
public JsonUtil getProductLevelUnits() {
	JsonUtil jsonUtil = new JsonUtil();
    LdwUnitType ldwUnitType = new LdwUnitType();
    ldwUnitType.setUnitTypeName("产品等级");
    ldwUnitType = productService.selectProductType(ldwUnitType);
    if (null != ldwUnitType) {
        List<LdwUnit> productLevels = productService.selectProductLeverType(ldwUnitType.getId());
        if (0 != productLevels.size()) {
        	jsonUtil.setObj(productLevels);
        	jsonUtil.setSuccess(true);
        
        }
    }
    return jsonUtil;
}

@RequestMapping("/ServiceModel")
@ResponseBody
public void ServiceModels(HttpServletRequest request,HttpServletResponse response){
//  服务方式
    List<Model> nmwModeList =productService.seleteAllNmwMode();
    List<ModelType> nmwModeTypeList =productService.selectAllNmwModeType();
    if(null != nmwModeList && 0 != nmwModeList.size()){
        request.setAttribute("nmwModeList",nmwModeList);
    }
    if(null != nmwModeTypeList && 0 != nmwModeTypeList.size()){
        request.setAttribute("nmwModeTypeList",nmwModeTypeList);
    }
}

@RequestMapping("/addGoods")
@ResponseBody
public JsonUtil addGoods(Goods goods,ProductDesc desc){
	JsonUtil jsonUtils = new JsonUtil();
	try {
		boolean boo=productService.addProduct(goods,desc);
		if(boo){
			jsonUtils.setMsg("添加成功");
			jsonUtils.setSuccess(true);
        }else{
        	jsonUtils.setMsg("添加失败");
        }
    } catch (Exception e) {
    	jsonUtils.setMsg("服务器异常");
    }
	return jsonUtils;
}


/*@Test
public static void main(String args[]){
	long aa = 123;
	String a = String.valueOf(aa);
	System.out.println(a);
	
}*/
}
