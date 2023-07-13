package com.example.hwl7;

public class Plate {
    private static int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food>=0 &&food<=10){
            food+=50;
            System.out.printf("Тарелка пополнена, теперь в ней %s еды\n\n", food);
        }
        if (n <= food) {
            food -= n;
            return true;
        } else {
            return false;
        }
    }

    public static void info() {
        System.out.println("plate: " + food+'\n');
    }
}
