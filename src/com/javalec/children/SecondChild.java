package com.javalec.children;

import com.javalec.papa.PapaPouch;

public class SecondChild {

    public SecondChild() {

    }

    public void takeMoney(int money) {

        if (PapaPouch.MONEY - money < 0) {
            System.out.println("둘째는 돈이 없어 못 받았어요 ㅜㅜ");
        } else {
            PapaPouch.MONEY = PapaPouch.MONEY - money;
        }
    }
}
