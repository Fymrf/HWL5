package com.example.hwl6;

public class Dog extends Animal {
    private static int count = 0;

    public Dog() {
        super(500, 10);
        count++;
    }

    public static void getCount() {
        System.out.println("Кол-во созданных собак = " + count);
    }
}
