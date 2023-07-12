package com.example.hwl5;
/*1
Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2
Конструктор класса должен заполнять эти поля при создании объекта.
3
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в
консоль.
4
Создать массив из 5 сотрудников.
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",
30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
5
С помощью цикла вывести информацию только о сотрудниках старше 40 лет.*/
public class HomeWorkApp {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 10);
        persArray[1] = new Person("Petrov Petr", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 20);
        persArray[2] = new Person("Sidorov Vasja", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[3] = new Person("Alekseev Aleksej", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 45);
        persArray[4] = new Person("Afonov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 50);

        whoIsOlderThen40(persArray);

    }

    public static void whoIsOlderThen40(Person[] pers) {
        System.out.println("\nИз них старше 40 лет: ");
        for (Person p : pers) {
            if (p.getAGE() > 40) {
                p.print();
            }
        }
    }


}