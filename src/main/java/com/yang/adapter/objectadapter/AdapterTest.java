package com.yang.adapter.objectadapter;

public class AdapterTest {
    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter(new AC220());
        powerAdapter.outputDC5V();
    }
}
