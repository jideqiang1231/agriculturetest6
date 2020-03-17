package com.bigdata.agriculture.app.service.impl;

import com.bigdata.agriculture.app.entity.User;
import com.bigdata.agriculture.app.mapper.UserMapper;
import com.bigdata.agriculture.app.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jdq
 * @since 2020-03-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User login(String userName, String userPass) {
        return userMapper.getuserbynameandpass(userName,userPass);
    }

    public void register(String userName, String userPass, String userPhone) {
        userMapper.insertintouser(userName,userPass,userPhone);
    }

    public User searchseemuser(String userPhone) {
        return userMapper.selectuserbyuerphone(userPhone);
    }
}
