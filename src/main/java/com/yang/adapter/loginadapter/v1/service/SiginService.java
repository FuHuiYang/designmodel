package com.yang.adapter.loginadapter.v1.service;

import com.yang.adapter.loginadapter.ResultMsg;
import com.yang.pattern.template.entity.Member;

public class SiginService {
    public ResultMsg regist(String userName,String userPass){
      return  new ResultMsg(200,"注册成功",new Member());
    }
    public ResultMsg login(String userName,String userPass){
        return null;
    }
}
