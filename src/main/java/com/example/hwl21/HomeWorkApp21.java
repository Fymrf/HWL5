package com.example.hwl21;

public class HomeWorkApp21 {
    public static void main(String[] args) {
        Person p1 = new Person(100, 11, "P1");
        Person p2 = new Person(1001, 15, "P2");
        Person p3 = new Person(1010, 9, "P3");
        Cat c1 = new Cat(100, 11, "C1");
        Cat c2 = new Cat(1001, 15, "C2");
        Cat c3 = new Cat(1010, 9, "C3");
        Robot r1 = new Robot(100, 11, "R1");
        Robot r2 = new Robot(1001, 15, "R2");
        Robot r3 = new Robot(1010, 9, "R3");

        RunTrack rt1 = new RunTrack(1000, "rt1");
        RunTrack rt2 = new RunTrack(100, "rt2");
        RunTrack rt3 = new RunTrack(10, "rt3");
        RunTrack rt4 = new RunTrack(500, "rt4");
        RunTrack rt5 = new RunTrack(200, "rt5");
        Wall w1 = new Wall(1, "w1");
        Wall w2 = new Wall(10, "w2");
        Wall w3 = new Wall(14, "w3");
        Wall w4 = new Wall(8, "w4");
        Wall w5 = new Wall(10, "w5");

        Players[] players = {p1, p2, p3, c1, c2, c3, r1, r2, r3};
        Barriers[] barriers = {rt1, rt2, rt3, rt4, rt5, w1, w2, w3, w4, w5};

        for (Players player : players) {
            for (Barriers barrier : barriers) {
                if (!barrier.success(player, barrier)) {
                    break;
                }
            }
        }
    }
}