package com.intuit.playground.clients;

public class Child extends Parent {
    int a=20;

    public void run(){
        System.out.println("Hello ia m child");
        super.run();
    }
    public static void main(String[] args) {
        Parent p=new Child();
        System.out.println(p.a);
        p.run();
        Child c=new Child();
        System.out.println(c.a);
    }
}
