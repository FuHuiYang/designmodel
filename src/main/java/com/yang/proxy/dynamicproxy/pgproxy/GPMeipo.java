package com.yang.proxy.dynamicproxy.pgproxy;

import java.lang.reflect.Method;

public class GPMeipo implements GPInvocationHandler {
    private Object target;
    public  Object getInstance(Object o){
        this.target=o;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    };

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target,args);
    }
}
