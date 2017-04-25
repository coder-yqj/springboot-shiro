package com.study.service;

import com.github.pagehelper.PageInfo;
import com.study.model.Resources;

/**
 * Created by yangqj on 2017/4/25.
 */
public interface ResourcesService extends IService<Resources> {
    PageInfo<Resources> selectByPage(Resources resources, int start, int length);

}
