package com.yukun.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    private Integer id;

    private String username;

    private String password;

    private String realname;

    private Integer sex;

    private Integer age;

    private Date creattime;

    private Date updatetime;

    private String idcard;

    private String phone;

    private String usertype;

    private String usertypeId;

    private Integer userLerveStatue;

    private Integer statue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype == null ? null : usertype.trim();
    }

    public String getUsertypeId() {
        return usertypeId;
    }

    public void setUsertypeId(String usertypeId) {
        this.usertypeId = usertypeId == null ? null : usertypeId.trim();
    }

    public Integer getUserLerveStatue() {
        return userLerveStatue;
    }

    public void setUserLerveStatue(Integer userLerveStatue) {
        this.userLerveStatue = userLerveStatue;
    }

    public Integer getStatue() {
        return statue;
    }

    public void setStatue(Integer statue) {
        this.statue = statue;
    }
}