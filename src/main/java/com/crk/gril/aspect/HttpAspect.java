package com.crk.gril.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class HttpAspect {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Pointcut("execution(public * com.crk.gril.controller.GrilController.*(..))")
    public void log(){

    }
    @Before("log()")
    public void doBefore(0 joinPoint){
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        //url
        logger.info("url={}",request.getRequestURI());
        //ip
        logger.info("ip={}",request.getRemoteAddr());
        //method
        logger.info("method={}",request.getMethod());
        //类方法
        logger.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName()+joinPoint.getSignature().getName());
        //参数
        logger.info("params={}",joinPoint.getArgs());
    }
    @After("log()")
    public void doAfter(){
        logger.info("2222");
    }

    @AfterReturning(returning = "object",pointcut = "log()")
    public void doAfterReturning(Object object){
        logger.info("response={}"+object.toString());
    }
}
