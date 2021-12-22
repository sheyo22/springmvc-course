package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
/**
 * 通过类上添加路径，通过method选择请求方式
 */
@RequestMapping(value = "/user")
public class MyController {
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(@RequestParam(value = "name",required = false) String name, Integer age){
        ModelAndView mv =new ModelAndView();
        mv.addObject("msg","欢迎使用springmvc做web开发   "+name+age);
        mv.addObject("fun","执行了doSome方法");
        //mv.setViewName("/WEB-INF/view/show.jsp");
        mv.setViewName("show");
        return mv;
    }
    @RequestMapping(value = "/other.do", method = RequestMethod.GET)
    public ModelAndView doOther(){
        ModelAndView mv =new ModelAndView();
        mv.addObject("msg","欢迎使用springmvc做web开发");
        mv.addObject("fun","执行了doOther方法");
        //mv.setViewName("/WEB-INF/view/show.jsp");
        mv.setViewName("other");
        return mv;
    }
    @RequestMapping(value = "/first.do")
    public ModelAndView doFirst(){
        ModelAndView mv =new ModelAndView();
        mv.addObject("msg","欢迎使用springmvc做web开发");
        mv.addObject("fun","执行了doOther方法");
        //mv.setViewName("/WEB-INF/view/show.jsp");
        mv.setViewName("forward:/index.jsp");
        //mv.setViewName("forward:/WEB-INF/view/first.jsp");
        return mv;
    }
    @RequestMapping(value = "/hello.do")
    public ModelAndView doHello(){
        ModelAndView mv =new ModelAndView();
        mv.addObject("msg","欢迎使用springmvc做web开发");
        mv.addObject("fun","执行了doOther方法");
        //mv.setViewName("/WEB-INF/view/show.jsp");
        mv.setViewName("redirect:/hello.jsp");
        //mv.setViewName("forward:/WEB-INF/view/first.jsp");
        return mv;
    }
}
