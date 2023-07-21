package com.example.hwl23;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TelephoneList {
    private Map<String, Set<String>> telephoneList;

    public static void main() {
        TelephoneList telephoneList = new TelephoneList();

        telephoneList.add("Иванов", "123456789");
        telephoneList.add("Петров", "234567890");
        telephoneList.add("Иванов", "345678901");
        telephoneList.add("Свириденко", "456789012");

        System.out.println();
        System.out.println("Телефон Иванова: " + telephoneList.get("Иванов"));
        System.out.println("Телефон Петрова " + telephoneList.get("Петров"));
        System.out.println("Телефон Свириденко: " + telephoneList.get("Свириденко"));
    }

    public TelephoneList() {
        this.telephoneList = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (!telephoneList.containsKey(lastName)) {
            telephoneList.put(lastName, new HashSet<>());
        }
        telephoneList.get(lastName).add(phoneNumber);
    }

    public Set<String> get(String lastName) {
        return telephoneList.getOrDefault(lastName, new HashSet<>());
    }
}
