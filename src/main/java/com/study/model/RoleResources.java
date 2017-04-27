package com.study.model;

import javax.persistence.*;

@Table(name = "role_resources")
public class RoleResources {
    @Id
    @Column(name = "roleId")
    private Integer roleid;

    @Id
    @Column(name = "resourcesId")
    private String resourcesid;

    /**
     * @return roleId
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * @param roleid
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getResourcesid() {
        return resourcesid;
    }

    public void setResourcesid(String resourcesid) {
        this.resourcesid = resourcesid;
    }
}