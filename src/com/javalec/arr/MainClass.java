package com.javalec.arr;

public class MainClass {

    public static void main(String[] args) {

        int[] iArr = {10, 20, 30, 40, 50};
//        System.out.println(iArr);
//        System.out.println(iArr[4]);

        int[] jArr = new int[3];
        jArr[0] = 0;
        jArr[1] = 1;
        jArr[2] = 2;
//        System.out.println(jArr[1]);

        int[] iArr1 = {10, 20, 30, 40, 50};
        int[] iArr2 = iArr1;

//        for (int i=0; i < iArr1.length; i++) {
//            System.out.println(iArr1[i]);
//            System.out.println(iArr2[i]);
//        }

        iArr2[0] = 100;
        iArr2[1] = 200;
        iArr2[2] = 300;
        iArr2[3] = 400;
        iArr2[4] = 500;

//        for (int i=0; i < iArr1.length; i++) {
//            System.out.println(iArr1[i]);
//            System.out.println(iArr2[i]);
//        }

        int[][] iArr_matrix = new int[3][2];
        int[][] iArr_m = new int[3][];

        iArr_m[0] = new int[2];
        iArr_m[1] = new int[3];
        iArr_m[2] = new int[4];
    }
}
