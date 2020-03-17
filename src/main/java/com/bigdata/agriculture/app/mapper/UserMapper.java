package com.bigdata.agriculture.app.mapper;

import com.bigdata.agriculture.app.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jdq
 * @since 2020-03-14
 */
public interface UserMapper extends BaseMapper<User> {
    //登录            的mapper映射地址
    User getuserbynameandpass(String userName,String userPass);
    //注册            的mapper映射地址
    void insertintouser(String userName, String userPass, String userPhone);
    //注册时按照手机号查询是否已经存在该用户
    User selectuserbyuerphone(String userPhone);
}
