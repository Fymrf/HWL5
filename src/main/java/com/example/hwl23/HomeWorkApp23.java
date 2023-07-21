package com.example.hwl23;

/*
1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
вывести список  уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.

2 Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
телефонных номеров. В этот телефонный справочник с помощью метода add() можно
добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять
лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем
через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного
справочника.
*/

import java.util.HashMap;
import java.util.Map;

public class HomeWorkApp23 {
    public static void main(String[] array) {
        String[] arrayList = {"slovo1", "slovo2", "slovo2", "slovo3", "slovo5", "slovo4", "slovo6", "slovo2", "slovo8", "slovo9", "slovo10", "slovo11", "slovo12", "slovo3", "slovo14", "slovo15"};
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        countingWords(arrayList, wordCountMap);

        TelephoneList.main();
    }

    public static void countingWords(String[] arrayList, HashMap<String, Integer> wordCountMap) {
        for (String word : arrayList) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }
        uniqueWords(wordCountMap);
        countOfRepeats(wordCountMap);
    }

    public static void uniqueWords(HashMap<String, Integer> wordCountMap) {
        System.out.println("Уникальные слова:");
        for (Map.Entry<String, Integer> word : wordCountMap.entrySet()) {
            if (word.getValue().equals(1)) {
                System.out.println(word.getKey());
            }
        }
    }

    public static void countOfRepeats(HashMap<String, Integer> wordCountMap) {
        System.out.println("\nКоличество встреч слов:");
        for (Map.Entry<String, Integer> word : wordCountMap.entrySet()) {
            System.out.println(word.getKey() + " - " + word.getValue());
        }
    }
}
