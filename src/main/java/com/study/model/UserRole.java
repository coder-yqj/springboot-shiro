package com.study.model;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "user_role")
public class UserRole implements Serializable{
    private static final long serialVersionUID = -916411139749530670L;
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