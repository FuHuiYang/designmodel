package com.yang.prototype.simple;

public class Client {
    private Prototype prototype;

    public Client(Prototype prototype){
        this.prototype=prototype;
    }
    public Prototype starClone(Prototype concreatePrototype){
        return concreatePrototype.clone();
    }
}
