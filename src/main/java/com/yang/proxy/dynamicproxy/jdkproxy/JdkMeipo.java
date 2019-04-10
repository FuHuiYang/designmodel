package com.yang.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkMeipo implements InvocationHandler {
        private Object target;
        public Object getInstance(Object object){
            this.target=object;
            Class<?> clazz = target.getClass();
            return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
        }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            before();
            Object o = method.invoke(this.target, args);
            after();
            return o;
    }

    private void before() {
        System.out.println("动态代理前执行方法");
        }

    private void after() {
        System.out.println("动态代理后执行方法");
    }
}
