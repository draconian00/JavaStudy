package com.javalec.makeClass;

public class MainClass {

    public static void main(String[] args) {


        ManClass mc = new ManClass();
        ManClass mc1 = new ManClass(27, 186, 68, "phoneNum");

        System.out.println(mc1.getAge() + " " + mc1.getHeight() + " " + mc1.getWeight() + " " + mc1.getPhoneNum());

        int h = mc1.getHeight();
        int w = mc1.getWeight();

        System.out.println(h + ", " + w);
        System.out.println(h*h + ", " + w);
        double result = w / (h*h);
        System.out.println(result);

        double d = mc1.calculateBMI();
        double d1 = mc1.calculateBMI();
        System.out.println(d + ", " + d1);
    }
}
