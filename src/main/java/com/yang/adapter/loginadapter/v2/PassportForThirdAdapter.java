package com.yang.adapter.loginadapter.v2;

import com.yang.adapter.loginadapter.ResultMsg;
import com.yang.adapter.loginadapter.v1.service.SiginService;

public class PassportForThirdAdapter extends SiginService implements IPassportForThird {
    @Override
    public ResultMsg loginForQQ(String id) {
        return processLogin(id,LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return processLogin(telphone,LoginForWechatAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token,LoginForTokenAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return  processLogin(id,LoginForWechatAdapter.class);
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        super.regist(username,null);
        return super.login(username,null);
    }
     public ResultMsg processLogin(String key,Class <? extends LoginAdapter> clazz){
         LoginAdapter loginAdapter = null;
         try {
             loginAdapter = clazz.newInstance();
             if (loginAdapter.support(loginAdapter)) {
                 return loginAdapter.login(key, loginAdapter);
             } else {
                 return null;
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
         return null;
     }
}
