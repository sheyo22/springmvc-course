package org.example.handler;

import org.example.exception.AgeException;
import org.example.exception.NameException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ControllerAdvice : 控制器增强，位置：类的上面；特点：必须在springmvc配置文件中与组件扫描器配合使用
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    //处理异常的方法和控制器方法定义相同
    //通过形参获得发生的异常信息
    //@ExceptionHandle(异常的类):表示异常的类型
    @ExceptionHandler(NameException.class)
    public ModelAndView doNameException(Exception e){
        /*
            处理异常的逻辑：
            1.在数据库或日志文件中记录下异常（时间，方法，异常内容）
            2.发送通知，把异常信息发送给相关人员
            3.向用户返回信息
         */
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","姓名必须是zs");
        mv.addObject("ex",e);
        mv.setViewName("nameError");
        return mv;
    }
    @ExceptionHandler(AgeException.class)
    public ModelAndView doAgeException(Exception e){
        /*
            处理异常的逻辑：
            1.在数据库或日志文件中记录下异常（时间，方法，异常内容）
            2.发送通知，把异常信息发送给相关人员
            3.向用户返回信息
         */
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","年龄不能大于20");
        mv.addObject("ex",e);
        mv.setViewName("ageError");
        return mv;
    }
    //处理其他异常
    @ExceptionHandler
    public ModelAndView doException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","其他类型异常");
        mv.addObject("ex",e);
        mv.setViewName("defaultError");
        return mv;
    }
}
