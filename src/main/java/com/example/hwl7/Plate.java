package com.example.hwl7;

public class Plate {
    private static int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
        //addFood();
    }

    public void addFood() {
        food += 50;
        System.out.printf("Тарелка пополнена, теперь в ней %s еды\n\n", food);
    }

    public boolean checkFood(int app) {
        if (food >= 0 && food <= 10)
        {
            addFood();
        }
        if (app <= food) {
            return true;
        } else {
            return false;
        }
    }

    public static void info() {
        System.out.println("plate: " + food + '\n');
    }
}
