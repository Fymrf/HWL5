package com.example.hwl6;

public class Cat extends Animal {
    private static int count = 0;

    public Cat() {
        super(200, 0);
        count++;
    }

    public static void getCount() {
        System.out.println("Кол-во созданных котов = " + count);
    }
}
