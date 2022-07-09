package Lesson1;
import useFulFutires.FileN;
import useFulFutires.MathN;
import useFulFutires.Parse;

public class Task1 {
    public static void main(String[] args) throws Exception {
        /* +
            Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму.
            Пример 1: а = 3, b = 2, ответ: 9
            Пример 2: а = 2, b = -2, ответ: 0.25
            Пример 3: а = 3, b = 0, ответ: 1
            Пример 4: а = 0, b = 0, ответ: не определено
            Пример 5
            входные данные находятся в файле input.txt в виде
            b = 3
            a = 10
            Результат нужно сохранить в файле output.txt
            1000
        */
        String pathInput = "src/main/java/Lesson1/input.txt";
        String str = FileN.BufferedReader(pathInput);

        if (str != null) {
            int a = Parse.getNumber(str, 'a');
            int b = Parse.getNumber(str, 'b');

            double result = 0;
            try {
                result = MathN.PowWithIterWhile(a, b);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                result = Math.pow(a, b);
            }
            System.out.println("привет");
            System.out.printf("%d в степени %d == %s \n", a, b, result);


            String pathOutput = "src/main/java/Lesson1/output.txt";
            boolean flag = false;
            FileN.Writer(String.valueOf(result), pathOutput, flag);
        }
    }
}



