package org.example.controller;

import org.example.domain.Student;
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
}
