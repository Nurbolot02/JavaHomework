package Lesson2;

import Lesson1.Task2;

public class smallTask1 {
    public static void main(String[] args) {
        /* Разминка:
        1) Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение)
        2) Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd, результат - a4b3cd2
         */
        String str = "585";
        boolean result = isPolindrom(str);
        if (result) {
            System.out.println(str + " полиндром");
        } else {
            System.out.println(str + " не полиндром");
        }
        System.out.println("Task2");
        System.out.println();

        String str2 = "aaaabbbcdd";
        System.out.println(str2);
        System.out.println(zipper(str2));

    }

    public static String zipper(String str){
        int strLength = str.length(), counter = 0;;
        char selectedStr = str.charAt(0);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strLength; i++) {
            if (selectedStr == str.charAt(i)){
                counter++;
            }else {
                stringBuilder.append(selectedStr);
                if (counter > 1){
                    stringBuilder.append(counter);
                }
                counter = 1;
                selectedStr = str.charAt(i);
            }
        }
        stringBuilder.append(selectedStr);
        stringBuilder.append(counter);

        return String.valueOf(stringBuilder);
    }

    public static boolean isPolindrom(String str) {
        int strLength = str.length();
        int countOfWays = strLength / 2;
        for (int i = 0; i < countOfWays; i++) {
            if (str.charAt(i) != str.charAt(strLength - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
