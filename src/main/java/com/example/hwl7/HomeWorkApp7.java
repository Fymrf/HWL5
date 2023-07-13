package com.example.hwl7;

public class HomeWorkApp7 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("A", 5, false);
        Cat cat2 = new Cat("B", 100, false);
        Cat cat3 = new Cat("C", 20, false);
        Cat cat4 = new Cat("D", 70, false);
        Cat cat5 = new Cat("E", 10, false);
        Plate plate = new Plate(100);

        cat1.eat(plate);
        cat2.eat(plate);
        cat3.eat(plate);
        cat4.eat(plate);
        cat5.eat(plate);
    }
}
