package com.example.hwl7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        if (!satiety) {
            boolean isFoodEnough = p.checkFood(appetite);
            if (isFoodEnough) {
                satiety = true;
                p.decreaseFood(appetite);
            }
        }
        fullCat();
    }

    public void fullCat() {
        if (satiety) {
            System.out.println("Кот " + name + " сыт");
        } else {
            System.out.println("Для кота " + name + " еды не достаточно");
        }
        Plate.info();
    }
}
