package com.example.hwl22;
/*
1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
подаче массива другого размера необходимо бросить исключение MyArraySizeException.

2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ
или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией,
в какой именно ячейке лежат неверные данные.

3 В методе main() вызвать полученный  метод,  обработать возможные исключения MyArraySizeException
и MyArrayDataException и вывести результат расчета (сумму элементов, при условии что подали
на вход корректный массив).
*/

public class HomeWorkApp22 {
    public static void main(String[] args) {
        try {
            String[][] array = {
                    {"1", "2", "3", "4"},
                    {"5", "6", "7", "8"},
                    {"9", "10", "11", "12"},
                    {"13", "14", "15", "16"}
            };

//            String[][] array = {
//                    {"1", "2", "3"},
//                    {"5", "6", "7"},
//                    {"13", "14", "15"}
//            };

//            String[][] array = {
//                    {"1", "2", "3", "4"},
//                    {"5", "й", "7", "8"},
//                    {"9", "10", "11", "12"},
//                    {"13", "14", "15", "16"}
//            };

            int sum = sum(array);
            System.out.println("Сумма элементов массива = " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int sum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Ошибка размерности массива");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int znach = Integer.parseInt(array[i][j]);
                    sum += znach;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Некорректное значение (" + array[i][j] + ") в ячейке " + (i + 1) + ":" + (j + 1) + "");
                }
            }
        }
        return sum;
    }
}
