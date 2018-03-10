package com.javalec.storeex;

public class MainClass {

    public static void main(String[] args) {

        HeadQuarterClass hq = new HeadQuarterClass();
        System.out.println("HeadQuarter");
        hq.orderKimChijjige();
        hq.orderBuDaejjige();
        hq.orderBiBimbap();
        hq.orderSunDaeguk();
        hq.orderGongGibap();
        System.out.println("=========================");

        HeadQuarterClass store1 = new StoreNum1();
        System.out.println("주택가 1호점");
        store1.orderKimChijjige();
        store1.orderBuDaejjige();
        store1.orderBiBimbap();
        store1.orderSunDaeguk();
        store1.orderGongGibap();
        System.out.println("=========================");

        HeadQuarterClass store2 = new StoreNum2();
        System.out.println("대학가 2호점");
        store2.orderKimChijjige();
        store2.orderBuDaejjige();
        store2.orderBiBimbap();
        store2.orderSunDaeguk();
        store2.orderGongGibap();
        System.out.println("=========================");

        HeadQuarterClass store3 = new StoreNum3();
        System.out.println("증권가 3호점");
        store3.orderKimChijjige();
        store3.orderBuDaejjige();
        store3.orderBiBimbap();
        store3.orderSunDaeguk();
        store3.orderGongGibap();
        System.out.println("=========================");

    }
}
