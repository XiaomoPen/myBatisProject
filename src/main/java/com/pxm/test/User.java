package com.pxm.test;

public class User implements Personal {
    @Override
    public void eat() {
        System.out.println("大陌陌吃饭了");
    }

    @Override
    public void sleep() {
        System.out.println("大陌陌睡觉了");
    }
}
