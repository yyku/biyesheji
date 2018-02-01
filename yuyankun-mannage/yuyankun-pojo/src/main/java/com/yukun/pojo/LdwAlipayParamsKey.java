package com.yukun.pojo;

import java.io.Serializable;

public class LdwAlipayParamsKey implements Serializable{
    private Long id;

    private String outTradeNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }
}