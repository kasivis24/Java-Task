package com.interview.oopstest.repo;


public class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public void sound(int b) {
        System.out.println("Dog barks");
    }
}

abstract class CallBack {
    CallBack(){

    }

    void fun(){

    }

    abstract void error();
    abstract void success();
}
