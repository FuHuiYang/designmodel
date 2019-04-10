package com.yang.adapter.loginadapter.v2;

import com.yang.adapter.loginadapter.ResultMsg;

public interface IPassportForThird {
    ResultMsg loginForQQ(String id);
    ResultMsg loginForTelphone(String telphone,String code);
    ResultMsg loginForToken(String token);
    ResultMsg loginForWechat(String id);
    ResultMsg loginForRegist(String username,String passport);

}
