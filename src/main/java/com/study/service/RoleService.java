package com.study.service;

import com.github.pagehelper.PageInfo;
import com.study.model.Role;

import java.util.List;

public interface RoleService extends IService<Role> {

    public List<Role> queryRoleListWithSelected(Integer uid);

    PageInfo<Role> selectByPage(Role role, int start, int length);


}
