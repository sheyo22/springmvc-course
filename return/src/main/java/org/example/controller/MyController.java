package org.example.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
    @RequestMapping(value = "/other.do", method = RequestMethod.POST)
    public String doOther(){
        return "show";
    }
    @RequestMapping(value = "/first.do")
    public ModelAndView doFirst(){
        ModelAndView mv =new ModelAndView();
        mv.addObject("msg","欢迎使用springmvc做web开发");
        mv.addObject("fun","执行了doOther方法");
        //mv.setViewName("/WEB-INF/view/show.jsp");
        mv.setViewName("first");
        return mv;
    }
    @RequestMapping(value = "/returnVoid-ajax.do")
    @ResponseBody
    public Student doReturnVoidAjax(String name,Integer age,HttpServletResponse res) throws IOException {
        System.out.println("ajax   "+name+age);
        Student stu = new Student();
        stu.setName(name);
        stu.setAge(age);
        return stu;
    }
    @RequestMapping(value = "/returnList-ajax.do")
    @ResponseBody
    public List<Student> doReturnVoidAjaxArray(String name, Integer age, HttpServletResponse res) throws IOException {
        List<Student> students = new ArrayList<>();
        System.out.println("ajax   "+name+age);
        Student stu = new Student();
        stu.setName(name);
        stu.setAge(age);
        students.add(stu);
        stu = new Student("lisi",200);
        students.add(stu);
        return students;
    }
    @RequestMapping(value = "/returnString-ajax.do",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String doReturnAjaxString(String name, Integer age, HttpServletResponse res) throws IOException {

        System.out.println("ajax   "+name+age);
        Student stu = new Student();
        stu.setName(name);
        stu.setAge(age);
        return stu.toString();
    }
}
