package com.javalec.oop;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        MainClass mainClass = new MainClass();
        System.out.println(mainClass);
        mainClass.gugudan(input);
    }

    public void gugudan(int i) {
        for (int j=1; j<10; j++) {
            System.out.println(i + " * " + j + " = " + i*j);
        }
    }
}
