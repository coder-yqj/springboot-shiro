package com.study.model;

import javax.persistence.*;

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "roleKey")
    private String rolekey;

    @Column(name = "roleDesc")
    private String roledesc;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return roleKey
     */
    public String getRolekey() {
        return rolekey;
    }

    /**
     * @param rolekey
     */
    public void setRolekey(String rolekey) {
        this.rolekey = rolekey;
    }

    /**
     * @return roleDesc
     */
    public String getRoledesc() {
        return roledesc;
    }

    /**
     * @param roledesc
     */
    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc;
    }
}