package Lesson2;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    /*
    5.	Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
    например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
    Предложить хотя бы одно решение или сообщить, что его нет.
    */
    public static void main(String[] args) {
        String inputData = "2? + ?5 = 69";
        String result = findTrueNumber(inputData);
        System.out.println(result);

    }

    public static String findTrueNumber(String inputData) {
        String[] arrayInputData = inputData.split(" ");
        char searchingSymbol = '?';
        ArrayList<int[]> indexOfSymbols = findSymbolIndex(arrayInputData, searchingSymbol);

        int finalResult = Integer.parseInt(arrayInputData[arrayInputData.length-1]);
        int secondNum = (finalResult % 10) - Integer.parseInt(String.valueOf(arrayInputData[2].charAt(1)));
        finalResult /= 10;
        int firstNUm = finalResult - Integer.parseInt(String.valueOf(arrayInputData[0].charAt(0)));
        return String.format("%s%s + %s%s = %s", arrayInputData[0].charAt(0), firstNUm, arrayInputData[2].charAt(1), secondNum, arrayInputData[arrayInputData.length-1]);
    }


    public static ArrayList<int[]> findSymbolIndex(String[] array, char symbol) {
        ArrayList<int[]> result = new ArrayList<>();
        int count = 0;
        for (String el : array) {
            if (el.equals("=")) {
                break;
            }
            for (int i = 0; i < el.length(); i++) {
                if (el.charAt(i) == symbol) {
                    result.add(new int[]{count, i});
                }
            }
            count++;
        }
        return result;
    }
}
