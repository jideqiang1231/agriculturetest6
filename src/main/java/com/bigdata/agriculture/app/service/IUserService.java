package com.bigdata.agriculture.app.service;

import com.bigdata.agriculture.app.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jdq
 * @since 2020-03-14
 */
public interface IUserService extends IService<User> {
    User login(String userName, String userPass);
}
