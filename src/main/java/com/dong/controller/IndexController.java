package com.dong.controller;

import com.dong.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: hifdong
 * @Date: 16/1/17.
 */

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
     private UserServiceImpl userService;

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        int count = 0;
        try {
            count =   userService.getUserList(1).size();
            System.out.println("-----------" + count );
        } catch (Exception e) {
            e.printStackTrace();
        }
        mv.addObject("title", "Helloworld!");
        mv.addObject("content", "this is a test page!" + count);
        return mv;
    }

    public UserServiceImpl getUserService() {
        return userService;
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }
}
