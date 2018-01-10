package com.neweast.demo.web;

import com.neweast.demo.domain.User;
import com.neweast.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liwg2 on 2018/1/8.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getName/{id}")
    @ResponseBody
    public String getName(@PathVariable Long id){
        User user = userService.getUserById(id);
        if (user==null){
            return null;
        }
        return user.getUserName();
    }
}
