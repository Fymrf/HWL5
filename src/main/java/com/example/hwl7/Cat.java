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
        boolean full = p.decreaseFood(appetite);
        fullCat(full);
    }

    public void fullCat(boolean full) {
        if(!satiety){
            if(full){
                satiety=true;
                System.out.println("Кот " + name + " сыт");
            }else {
                System.out.println("Для кота " + name + " еды не достаточно");
            }
        }else {
            System.out.println("Кот " + name + " сыт");
        }
        Plate.info();
    }
}
