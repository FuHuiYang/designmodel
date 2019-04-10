package com.yang.adapter.objectadapter;

public class PowerAdapter implements DC5 {
    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5V() {
        int adapterInPut = ac220.outputAC220V();
        int adapterOutPut = adapterInPut / 44;
        System.out.println("使用adapter输入AC;"+adapterInPut+"输出"+adapterOutPut+"V");
        return adapterOutPut;
    }
}
