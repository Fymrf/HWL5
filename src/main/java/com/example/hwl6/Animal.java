package com.example.hwl6;

public class Animal {
    protected int runLimit;
    protected int swimLimit;

    public Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }


    public void run(String anim, int distance) {
        if (distance <= runLimit) {
            System.out.println(anim + " пробежал " + distance + " м");
        } else {
            System.out.println(anim + " не может пробежать дистанцию в" + distance + " м");
        }
    }

    public void swim(String anim, int distance) {
        if (swimLimit == 0) {
            System.out.println(anim + " не умеет плавать");
        } else if (distance <= swimLimit) {
            System.out.println(anim + " проплыло " + distance + " м");
        } else {
            System.out.println(anim + " не может ппроплыть дистанцию в" + distance + " м");
        }
    }
}
