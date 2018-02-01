package com.yukun.pojo;

import java.io.Serializable;
import java.util.Date;

public class AppUrl implements Serializable{
    private Long id;

    private String appurl;

    private String versionscode;

    private String versionsname;

    private Date updatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppurl() {
        return appurl;
    }

    public void setAppurl(String appurl) {
        this.appurl = appurl == null ? null : appurl.trim();
    }

    public String getVersionscode() {
        return versionscode;
    }

    public void setVersionscode(String versionscode) {
        this.versionscode = versionscode == null ? null : versionscode.trim();
    }

    public String getVersionsname() {
        return versionsname;
    }

    public void setVersionsname(String versionsname) {
        this.versionsname = versionsname == null ? null : versionsname.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}