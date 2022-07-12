package Lesson1;

import useFulFutires.Generate;

public class HWork2 {
    public static void main(String[] args) {
        /* 2. Попробовать сгенерировать все перестановки длины N из K чисел с повторениями.
        Пример: N = 2, K = 3 ответ "00 01 02 10 11 12 20 21 22" */
        int N = 2, K = 3;
        String result = Generate.GetKeys(N, K);
        System.out.println(result);
    }
}
