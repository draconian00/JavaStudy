package com.javalec.inheritance;

public class MainClass {

    public static void main(String[] args) {

        ChildClass childClass = new ChildClass();
        System.out.print("PapaName : ");
        childClass.getPapaName();
        System.out.print("MamiName : ");
        childClass.getMamiName();

        System.out.println(childClass.cStr);
        System.out.println(childClass.pStr);
    }
}
