package com.crk.gril.util;

import com.crk.gril.domain.Result;
import com.sun.net.httpserver.Authenticator;

public class ResultUtil {
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(1);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }
    public static Result success(){
        return success(null);
    }
    public static Result  failed(String msg){
        Result result = new Result();
        result.setCode(1);
        result.setMsg(msg);
        return result;
    }
    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
