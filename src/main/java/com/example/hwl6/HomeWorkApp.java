/*1
Создать классы Собака и Кот с наследованием от класса Животное.
2
Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина
препятствия.
Результатом выполнения действия будет печать в консоль.
(Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3
У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание:
кот не умеет плавать, собака 10 м.).
4
* Добавить подсчет созданных котов, собак и животных.*/

package com.example.hwl6;

public class HomeWorkApp {

    public static void main(String[] args) {
        System.out.println(123);
        start();
    }

    public static void start() {


        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        cat1.run("cat1", 100);
        cat2.run("cat2", 250);
        dog1.run("dog1", 400);
        dog2.run("dog1", 600);
        cat1.swim("cat1", 50);
        dog1.swim("dog", 15);
        dog2.swim("dog2", 5);

        Cat.getCount();
        Dog.getCount();
    }
}
