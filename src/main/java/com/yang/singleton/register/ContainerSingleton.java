package com.yang.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
    private ContainerSingleton(){}
    private static Map<String,Object> ioc =new ConcurrentHashMap<String,Object>();
    //类似懒加载 有线程安全问题
    public static Object getbean(String className){
        synchronized (ioc){
        if(!ioc.containsKey(className)){
            Object obj=null;
            try {
                obj=Class.forName(className).newInstance();
                ioc.put(className,obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return obj;
        }
        return  ioc.get(className);
        }
    }


}