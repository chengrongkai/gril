package com.crk.gril.handle;

import com.crk.gril.domain.Result;
import com.crk.gril.exception.GrilException;
import com.crk.gril.util.ResultUtil;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@ControllerAdvice
public class ExceptionHandle {
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if (e instanceof GrilException){
            GrilException grilException =  (GrilException)e;
            return ResultUtil.error(grilException.getCode(),grilException.getMessage());
        }
        logger.error("【系统异常】{}",e.getMessage());
        return ResultUtil.error(-1,"未知错误");
    }
}
