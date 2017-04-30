package com.study.service;

import com.github.pagehelper.PageInfo;
import com.study.model.User;
import com.study.model.UserRole;

/**
 * Created by yangqj on 2017/4/21.
 */
public interface UserService extends IService<User>{
    PageInfo<User> selectByPage(User user, int start, int length);

    User selectByUsername(String username);

    void delUser(Integer userid);

}
