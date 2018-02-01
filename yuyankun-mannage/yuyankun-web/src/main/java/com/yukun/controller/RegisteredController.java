package com.yukun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yukun.pojo.User;
import com.yukun.pojo.UserTypeLerve;
import com.yukun.service.RegisteredService;
import com.yukun.utils.JsonUtil;

@Controller
@RequestMapping("/userRegistered")
public class RegisteredController {
@Autowired
private RegisteredService registeredService;
@RequestMapping("/registereds")
@ResponseBody
public JsonUtil registered(){
	JsonUtil jsonUtil = new JsonUtil();
	List<UserTypeLerve> registeredList = null;
	try {
		registeredList = registeredService.selectUserType();
		if(null != registeredList && registeredList.size()>0){
			jsonUtil.setSuccess(true);
			jsonUtil.setObj(registeredList);
		}
	} catch (Exception e) {
		jsonUtil.setMsg("服务器异常");
	}
	 
	return jsonUtil;
}

}
