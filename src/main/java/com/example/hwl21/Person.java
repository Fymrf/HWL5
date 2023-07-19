package com.example.hwl21;

class Person implements Players {
    //public static final String ANSI_RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String NOCOLOR = "\u001B[0m";
    public int runLimit;
    public int jumpLimit;
    public String name;

    public Person(int runLimit, int jumpLimit, String name) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean run(int length, String nameOfBar) {
        if (length <= runLimit) {
            System.out.println(GREEN + name + " успешно пробежал дистанцию " + nameOfBar + NOCOLOR);
            return true;
        } else {
            System.out.println(RED + name + " не смог пробежать дистанцию " + nameOfBar + NOCOLOR);
            return false;
        }
    }

    public boolean jump(int height, String nameOfBar) {
        if (height <= jumpLimit) {
            System.out.println(GREEN + name + " успешно перепрыгнул препятствие " + nameOfBar + NOCOLOR);
            return true;
        } else {
            System.out.println(RED + name + " не смог перепрыгнуть препятствие " + nameOfBar + NOCOLOR);
            return false;
        }
    }
}
