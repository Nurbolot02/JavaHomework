package Lesson4;

import static Lesson4.Task12.isParenthesesPlacement;

public class HomeWork {
    public static void main(String[] args) {
        /*
         *Реализовать алгоритм перевода из инфиксной записи в постфиксную для арифметического выражения.
         */
        //(1+2*3*4)*(10/5) - 20
        // 1 2 3 * 4 * + 10 5 / * 20 -

        //(1 + 2) * 4
        String str = "(1 + 2) * 4";
        Solve(str);
    }

    public static void Solve(String str){
        System.out.println(isParenthesesPlacement(str));
        if (!isParenthesesPlacement(str)){
            System.out.println("Wrong text, please check right");
            return;
        }
    }
}
