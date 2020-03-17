package com.bigdata.agriculture.app.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bigdata.agriculture.app.entity.User;
import com.bigdata.agriculture.app.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jdq
 * @since 2020-03-14
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserServiceImpl userService;


    //注册接口
    @PostMapping("/register")
    Map<String,Object> registertest(@RequestParam String userName, @RequestParam String userPass, @RequestParam String userPhone){
        HashMap<String,Object> map = new HashMap<>();
        User user=userService.searchseemuser(userPhone);
        if (user!=null){
            map.put("registersuccess","用户已经存在");
        }else {
            userService.register(userName,userPass,userPhone);
            map.put("registersuccess","注册成功");
        }
        return  map;
    }



    @PostMapping("/login1")
    Map<String,Object> login1(@RequestParam String userName, @RequestParam String userPass){
//        QueryWrapper<User> wrapper = new QueryWrapper<User>()
//                .eq("user_name",userName)
//                .eq("user_pass",userPass);
//        User user = userService.getOne(wrapper);
        User user=userService.login(userName,userPass);
        Map<String,Object> map = new HashMap<>();
        if (user!=null)
        {
            //注意，这里返回给前端必须和loginbean里边的属性对应，不然出错
            map.put("code","200");
            map.put("msg","get请求成功");
            map.put("loginresult",user);
        }
        else{
            map.put("msg","登录失败");
        }
        return map;
    }



    //写一个getlogin的user信息，供前端界面homefragment测试使用
    @GetMapping("/login1")
    Map<String,Object> loginget(@RequestParam String userName, @RequestParam String userPass){
//        QueryWrapper<User> wrapper = new QueryWrapper<User>()
//                .eq("user_name",userName)
//                .eq("user_pass",userPass);
//        User user = userService.getOne(wrapper);
        User user=userService.login(userName,userPass);
        Map<String,Object> map = new HashMap<>();
        if (user!=null)
        {
            //注意，这里返回给前端必须和loginbean里边的属性对应，不然出错
            map.put("code","200");
            map.put("msg","get请求成功");
            map.put("loginresult",user);
        }
        else{
            map.put("msg","登录失败");
        }
        return map;
    }

    @PostMapping("/login2")
    Map<String,Object> login2(@RequestBody User loginuser){
//        new 的行为，都交给spring来控制
//        UserServiceImpl userService = new UserServiceImpl();
//        QueryWrapper<User> wrapper = new QueryWrapper<User>()
//                .eq("username",username)
//                .eq("psw",psw);
//                column 对应表字段
//                  property 对应Javabean属性
//        User user = userService.getOne(wrapper);
        User user = userService.login(loginuser.getUserName(),loginuser.getUserPass());
        Map<String,Object> map = new HashMap<>();
        if (user!=null){
            map.put("data","登录成功！");
            map.put("用户信息",user);
        }else {
            map.put("msg","用户名或密码错误！");
        }
        return map;
    }

    @PostMapping("/login3")
    Map<String,Object> login3(@RequestParam String userName,
                              @RequestParam String userPass){
        //new 的行为，都交给spring来控制
//        UserServiceImpl userService = new UserServiceImpl();
        QueryWrapper<User> wrapper = new QueryWrapper<User>()
                .eq("user_name",userName)
                .eq("user_pass",userPass);
//                column 对应表字段
//                property 对应Javabean属性
        User user = userService.getOne(wrapper);
        Map<String,Object> map = new HashMap<>();
        if (user!=null){
            map.put("code","200");
            map.put("msg","post请求成功");
            map.put("loginresult",user);
        }else {
            map.put("msg","用户名或密码错误！");
        }
        return map;
    }

    /*
     注册接口  post即可
     */
//    @PostMapping("/register")
//    Map<String,Object> register(@RequestParam String userName,
//                                @RequestParam String userPass,
//                                @RequestParam String userTell,
//                                @RequestParam String userType){
//
//        Map<String,Object> map=new HashMap<>();
//
//        return null;
//    }



}

