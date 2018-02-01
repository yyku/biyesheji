package com.yukun.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.fabric.xmlrpc.base.Data;
import com.yukun.mapper.UserMapper;
import com.yukun.mapper.UserTypeLerveMapper;
import com.yukun.pojo.User;
import com.yukun.pojo.UserTypeLerve;
import com.yukun.service.RegisteredService;

@Service
public class RegisteredServiceImpl implements RegisteredService{
@Autowired
private UserTypeLerveMapper userTypeLerveMapper;

	@Override
	public List<UserTypeLerve> selectUserType() {
		List<UserTypeLerve> li = userTypeLerveMapper.selectUserType();
		return li;
	}
	
}
