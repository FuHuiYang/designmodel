package com.yang.proxy.dbroute.db;

public class DynamicDataSourceEntry {
    public static final String DEFULT_SOURCE=null;
    public static final ThreadLocal<String> local=new ThreadLocal<String>();
    private DynamicDataSourceEntry(){}

    /**
     * 清空数据源
     */
    public static void clear(){
        local.remove();
    }

    /**
     * 获取当前数据源使用名字
     * @return
     */
    public  static String get(){
        return local.get();
    }

    /**
     * 重置数据源
     */
    public static void restore(){
        local.set(DEFULT_SOURCE);
    }

    public static void set(int year){
        local.set("DB_"+year);
    }

}
