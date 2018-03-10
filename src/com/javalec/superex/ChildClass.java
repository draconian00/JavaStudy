package com.javalec.superex;

public class ChildClass extends ParentClass {

    public ChildClass() {
        System.out.println("ChildClass");
//        super.method();
//        this.method();
    }

    @Override
    public void method() {
        super.method();
        System.out.println("execute parent's method and execute child's method");
    }
}
