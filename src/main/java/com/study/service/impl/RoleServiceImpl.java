package com.study.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.study.mapper.RoleMapper;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.study.model.Role;
import com.study.model.RoleResources;
import com.study.service.RoleService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

@Service("roleService")
public class RoleServiceImpl extends BaseService<Role> implements RoleService{

    @Resource
    private RoleMapper roleMapper;

    @Override
    public List<Role> queryRoleListWithSelected(Integer id) {
        return roleMapper.queryRoleListWithSelected(id);
    }

    @Override
    public PageInfo<Role> selectByPage(Role role, int start, int length) {
        int page = start/length+1;
        Example example = new Example(Role.class);
        //分页查询
        PageHelper.startPage(page, length);
        List<Role> rolesList = selectByExample(example);
        return new PageInfo<>(rolesList);
    }
}
