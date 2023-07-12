package com.example.hwl5;

public class Person {
    private String FIO;
    private String POST;
    private String EMAIL;
    private String PHONE;
    private int SALARY;
    private int AGE;

    public Person(String FIO, String POST, String EMAIL, String PHONE, int SALARY, int AGE) {
        this.FIO = FIO;
        this.POST = POST;
        this.EMAIL = EMAIL;
        this.PHONE = PHONE;
        this.SALARY = SALARY;
        this.AGE = AGE;
        print();
    }

    public void print() {
        System.out.println(FIO + " " + POST + " " + " " + EMAIL + " " + PHONE + " " + SALARY + " " + AGE);
    }

    public int getAGE() {
        return AGE;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FIO='" + FIO + '\'' +
                ", POST='" + POST + '\'' +
                ", EMAIL='" + EMAIL + '\'' +
                ", PHONE='" + PHONE + '\'' +
                ", SALARY=" + SALARY +
                ", AGE=" + AGE +
                '}';
    }
}