package com.yukun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class IndexController {
	
	@RequestMapping("/Agricultural")
	
	public String Agricultural(){
		return "AgriculturalService";
	}


	
	@RequestMapping("/registered")
	public String registered(){
		return "registered";
	}
	
	@RequestMapping("/bbb")
	public String bbb(){
		return "NewFile1";
	}
	@RequestMapping("/userManagement")
	public String userManage(){
		return "userManagement";
	}

	
	@RequestMapping("/InSale")
	public String InSale(){
		return "productManage";
	}
	@RequestMapping("/abb")
	public String saaa(){
		return "regi";
	}
	
	}
