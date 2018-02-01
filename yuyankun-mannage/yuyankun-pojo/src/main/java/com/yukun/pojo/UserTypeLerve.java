package com.yukun.pojo;

import java.io.Serializable;

public class UserTypeLerve implements Serializable{
    private String id;

    private String usertypename;

    private String usertypenameid;

    private Integer userLerve;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsertypename() {
        return usertypename;
    }

    public void setUsertypename(String usertypename) {
        this.usertypename = usertypename == null ? null : usertypename.trim();
    }

    public String getUsertypenameid() {
        return usertypenameid;
    }

    public void setUsertypenameid(String usertypenameid) {
        this.usertypenameid = usertypenameid == null ? null : usertypenameid.trim();
    }

    public Integer getUserLerve() {
        return userLerve;
    }

    public void setUserLerve(Integer userLerve) {
        this.userLerve = userLerve;
    }
}