/*
package com.springboot.agreement.controller;

import com.springboot.agreement.domain.User;
import com.springboot.agreement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller	//声明这是Controller层
public class UserController {
    //依赖注入
    @Autowired
    UserService userService;

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String login(User user) {
        //调用dao层
        System.out.println("前端"+user);
        User u = userService.getUser(user.getUsername());
        System.out.println("数据库"+u);
        if (u.getPassword().equals(user.getPassword())){
            return "success";
        }
        return "failed";
    }
}
*/
