package com.yukun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yukun.pojo.Goods;
import com.yukun.service.ProductManageService;

@Controller
public class productManage {
	
	@Autowired
	private ProductManageService productManageService;
	/**
	 * 正在销售中
	 * @return
	 */
   @RequestMapping("/inSale")
   public String productInsale(ModelMap modelMap){
	   String createId = null;
	   List<Goods> greenProductLists = productManageService.selctInSale(createId);
		if(null != greenProductLists && greenProductLists.size() > 0){
			modelMap.put("InGoodList", greenProductLists);
			System.out.println(greenProductLists);
		}
	   return"/inSale";
   }
   
   /**
	 * 销售停止
	 * @return
	 */
  @RequestMapping("/stop")
  public String productStop(ModelMap modelMap){
	   String createId = "";
	   List<Goods> productLists = productManageService.selctXiaJia(createId);
		if(null != productLists && productLists.size() > 0){
			modelMap.put("greenGoods", productLists);
			
		}
	   return"/productManage";
  }
}
