package com.dong.controller;

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

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("title", "Helloworld!");
        mv.addObject("content", "this is a test page!");
        return mv;
    }
}
