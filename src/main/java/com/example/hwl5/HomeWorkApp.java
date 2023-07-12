package com.example.hwl5;

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