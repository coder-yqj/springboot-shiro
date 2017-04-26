package com.study.model;

import javax.persistence.*;

@Table(name = "user_role")
public class UserRole {
    @Column(name = "userId")
    private Integer userid;

    @Column(name = "roleId")
    private String roleid;

    /**
     * @return userId
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }
}