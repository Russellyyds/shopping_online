package com.atguigu.common.test;


import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class RR {
    @ApiModelProperty(value = "是否成功")
    private Boolean success;
    @ApiModelProperty(value = "返回码")
    private Integer code;
    @ApiModelProperty(value = "返回消息")
    private String messgae;
    @ApiModelProperty(value = "返回数据")
    private Map<String,Object> data=new HashMap<String,Object>();

    private RR(){}

    public static RR ok(){
        RR rr=new RR();
        rr.setSuccess(true);
        rr.setCode(ResultCode.SUCCESS.getIndex());
        rr.setMessgae(ResultCode.SUCCESS.getName());
        return rr;
    }
    public static RR error(){
        RR rr=new RR();
        rr.setSuccess(false);
        rr.setCode(ResultCode.ERROR.getIndex());
        rr.setMessgae(ResultCode.ERROR.getName());
        return rr;
    }
    public RR success(Boolean success){
        this.setSuccess(success);
        return this;
    }
    public RR message(String messgae){
        this.setMessgae(messgae);
        return this;
    }
    public RR code(Integer code){
        this.setCode(code);
        return this;
    }
    public RR data(String key,Object value){
        this.data.put(key, value);
        return this;
    }
    public RR data(Map<String,Object> map){
        this.setData(map);
        return this;
    }
}
