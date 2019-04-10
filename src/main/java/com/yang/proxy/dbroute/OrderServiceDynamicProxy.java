package com.yang.proxy.dbroute;

import com.yang.proxy.dbroute.db.DynamicDataSourceEntry;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceDynamicProxy implements InvocationHandler {
    private Object target;
    private SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy");
    public Object getInstance(Object o){
        this.target=o;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            before(args[0]);
        Object o = method.invoke(target, args);
        after();
        return o;
    }

    private void after() {
        DynamicDataSourceEntry.restore();
        System.out.println("代理后置方法执行 改为默认数据源");
    }

    private void before(Object arg) {
        try {
            System.out.println("代理前置方法");
            long time = (Long) arg.getClass().getMethod("getCreate").invoke(arg);
            Integer year = Integer.valueOf(simpleDateFormat.format(new Date(time)));
            DynamicDataSourceEntry.set(year);
            System.out.println("前置方法设置数据源为DB_"+year);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
