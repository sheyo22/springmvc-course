package org.example.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

//拦截器类，拦截用户请求
public class MyInterceptor implements HandlerInterceptor {
    private long runtime;
    /**
     *preHandle:预处理方法
     * 参数：Object handler：拦截的控制器对象
     * 返回值:
     * 特点:在控制器方法前执行，用户请求首先到达此方法，可以获取并验证请求是否符合要求
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        runtime = System.currentTimeMillis();
        System.out.println("MyInterceptor.preHandle()");
        return true;
        /*request.getRequestDispatcher("index.jsp").forward(request,response);
        return false;*/
    }

    /*
        在处理器方法后执行，可以修改返回值中ModelAndView中的数据和视图，主要用来对原来的结果做修改，没有返回值
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("MyInterceptor.postHandle()");
        if(modelAndView!=null){
            modelAndView.addObject("date",new Date());
            modelAndView.setViewName("other");
        }
    }

    /*
        最后执行的方法
        Object handler:被拦截的Controller对象
        Exception ex：程序中发生的异常
        在处理完成后执行，当对视图执行forward后认为请求处理完成
        一般做资源回收，没有返回值
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("MyInterceptor.afterCompletion()");
        runtime = System.currentTimeMillis()-runtime;
        System.out.println("runtime:"+runtime);
    }
}
