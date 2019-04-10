package com.yang.singleton.register;

public enum  EnumSingleton {
    INSTANCE;
    private Object object;
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
