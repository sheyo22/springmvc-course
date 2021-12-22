package org.example.controller;

import org.example.domain.Student;
import org.example.exception.AgeException;
import org.example.exception.MyUserException;
import org.example.exception.NameException;
import org.example.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentController {
    @Resource
    private StudentService service;
    @RequestMapping("student/addStudent.do")
    public ModelAndView register(Student student){
        ModelAndView mv = new ModelAndView();
        String tips="注册失败";
        int re=service.addStudent(student);
        if(re>0){
            tips="学生:["+student.getName()+"]注册成功";
        }
        mv.addObject("tips",tips);
        mv.setViewName("result");
        return mv;
    }
    @RequestMapping("student/listAll.do")
    @ResponseBody
    public List<Student> findAll(){
        List<Student> students = service.findAllStudents();
        return students;
    }
    @RequestMapping("some.do")
    @ResponseBody
    public ModelAndView doSome(String name,Integer age) throws MyUserException {
        ModelAndView mv =new ModelAndView();
        if(!"zs".equals(name))
            throw new NameException("姓名不正确");
        mv.addObject("name",name);
        if(age==null||age>20)
            throw new AgeException("年龄不正确");
        mv.addObject("age",age);
        mv.setViewName("forward:/show.jsp");
        return mv;
    }
}
