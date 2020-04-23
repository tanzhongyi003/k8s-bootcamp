package com.baidu.codemaster.bean;

public class HealthCheck {

    private Boolean success;
    private Integer code;

    public HealthCheck() {
        success = true;
        code = 200;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
