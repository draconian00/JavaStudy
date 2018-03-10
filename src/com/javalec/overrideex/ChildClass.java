package com.javalec.overrideex;

public class ChildClass extends ParentClass {

    public ChildClass() {

    }

    @Override
    public void method1() {
//        super.method1();
        System.out.println("ChildClass method1");
    }

    public void method3() {
        System.out.println("ChildClass method3");
    }
}
