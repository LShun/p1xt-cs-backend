package ui;

import model.Coin;

public class Main {
    public static void main(String[] args) {
        Coin c = new Coin();
        System.out.println(c.checkStatus());
        c.flip();
        System.out.println(c.checkStatus());
        c.flip();
        c.flip();
        System.out.println(c.checkStatus());
    }
}
