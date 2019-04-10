package com.yang.delegate;

public class Boss {
    public void command(String command,Leader leader){
        new Leader().doing(command);
    }
}
