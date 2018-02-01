package com.yukun.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yukun.pojo.Goods;
import com.yukun.service.findSixProduct;

@Controller
public class HomePageDisplay {
@Autowired
private findSixProduct findSixGreen;
@RequestMapping("/harmlessGoodes")
public String getFindSixHarml(ModelMap modelMap){
	try{
	List<Goods> greenProductLists = findSixGreen.findGreenProduct();
	if(null != greenProductLists && greenProductLists.size() > 0){
		modelMap.put("greenGoods", greenProductLists);
		
	}
	/**
	 * organic  有机
	 */
	List<Goods> harmlessProductLists = findSixGreen.findHarmlessProduct();
	if(null != harmlessProductLists && harmlessProductLists.size() > 0){
		modelMap.put("organicGoods", harmlessProductLists);
		
	}
	/**
	 * pollution  无公害
	 */
	
	List<Goods> pollutionProductLists = findSixGreen.findOrganicProduct();
	if(null != pollutionProductLists && pollutionProductLists.size() > 0){
		modelMap.put("pollutionGoods", pollutionProductLists);
		
	}
	}catch(Exception e){
		modelMap.put("mages", "查询失败");
	}
	return "/HomePage";
} 

}
