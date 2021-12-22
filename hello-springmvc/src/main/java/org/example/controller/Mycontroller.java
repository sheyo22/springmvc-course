package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Mycontroller {
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){
        ModelAndView mv =new ModelAndView();
        mv.addObject("msg","欢迎使用springmvc做web开发");
        mv.addObject("fun","执行了doSome方法");
        //mv.setViewName("/WEB-INF/view/show.jsp");
        mv.setViewName("show");
        return mv;
    }
}
