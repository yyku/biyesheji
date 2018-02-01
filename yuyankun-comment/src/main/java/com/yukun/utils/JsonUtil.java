package com.yukun.utils;

import java.io.Serializable;

public class JsonUtil implements Serializable{
	private boolean success = false;
	private String msg = "";
	private Object obj = null;
	public JsonUtil(){
		
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}
