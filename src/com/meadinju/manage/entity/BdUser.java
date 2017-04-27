package com.meadinju.manage.entity;

import java.util.Date;

public class BdUser {
    private Long id;

    private String username;

    private String password;

    private Integer type;

    private Date createtime;

    private Long linkid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Long getLinkid() {
        return linkid;
    }

    public void setLinkid(Long linkid) {
        this.linkid = linkid;
    }
}