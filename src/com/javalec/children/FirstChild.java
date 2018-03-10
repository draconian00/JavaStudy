package com.javalec.children;

import com.javalec.papa.PapaPouch;

public class FirstChild {

    public FirstChild() {

    }

    public void takeMoney(int money) {

        if (PapaPouch.MONEY - money < 0) {
            System.out.println("첫째는 돈이 없어 못 받았어요 ㅜㅜ");
        } else {
            PapaPouch.MONEY = PapaPouch.MONEY - money;
        }
    }
}
