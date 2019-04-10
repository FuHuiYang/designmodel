package com.yang.adapter.loginadapter.v1.service;

import com.yang.adapter.loginadapter.ResultMsg;

public class SigninForThirdService extends SiginService {
    public ResultMsg loginForQQ(String openId){
        return loginForRegist(openId,null);
    }
    public ResultMsg loginForWechat(String openId){
        return null;
    }
    public ResultMsg loginForToken(String openId){
        return  null;
    }
    public ResultMsg loginForTelphone(String openId){
        return  null;
    }
    private ResultMsg loginForRegist(String userName, String o) {
        super.regist(userName,null);
        return super.login(userName,null);
    }
}
