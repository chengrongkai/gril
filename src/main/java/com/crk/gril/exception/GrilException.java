package com.crk.gril.exception;

import com.crk.gril.enums.ResultEnum;

public class GrilException extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public GrilException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }
    public GrilException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
