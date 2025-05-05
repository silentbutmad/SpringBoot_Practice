package com.silentbutmad.Spring_MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

    @RequestMapping("/welcome")
    public ModelAndView getWelcomeMsg(){
        ModelAndView mav =new ModelAndView();
        mav.addObject("msg","Welcome to my project");
        mav.setViewName("message");
        return mav;
    }

    @RequestMapping("/greet")
    public ModelAndView getGreetMsg()
    {
        ModelAndView mav=new ModelAndView();
        mav.addObject("msg","Good Morning..");
        mav.setViewName("message");

        return mav;
    }

}
