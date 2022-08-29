package Lesson4;

import Lesson3.StackCalculator;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import static Lesson4.Task12.isParenthesesPlacement;

public class HomeWork {
    public static void main(String[] args) {
        /*
         *Реализовать алгоритм перевода из инфиксной записи в постфиксную для арифметического выражения.
         */
        //(1+2*3*4)*(10/5) - 20
        // 1 2 3 * 4 * + 10 5 / * 20 -

        //(1 + 2) * 4
        //1 2 + 4 *
        String str = " 5 * 6 + ( 2 - 9 ) ";
        String postfixText = Solve(str);
        StackCalculator.StackCalculator(postfixText);
    }

    public static String Solve(String str){
        if (!isParenthesesPlacement(str)){
            System.out.println("Wrong text, please check right");
            return null;
        }
        Stack<Character> stack = new Stack<>();
        List<Character> logSymbol = List.of('+', '-', '*', '/');
        Queue<Character> queue = new LinkedList<>();
        str = str.trim().replace(" ", "");


        for (int i = 0; i < str.length(); i++) {
            if (isDigit(str.charAt(i))){
                queue.add(str.charAt(i));
            } else if (isHaveLogSymbol(logSymbol, str.charAt(i))) {
                if (stack.isEmpty() || stack.peek() == '('){
                    stack.add(str.charAt(i));
                } else if (str.charAt(i) == '*' && stack.peek() == '+' || str.charAt(i) == '*' && stack.peek() == '-' || str.charAt(i) == '/' && stack.peek() == '+' || str.charAt(i) == '/' && stack.peek() == '-') {
                    stack.add(str.charAt(i));
                } else if (str.charAt(i) == '+' && stack.peek() != '+' || str.charAt(i) == '+' &&  stack.peek() != '-' || str.charAt(i) == '-' && stack.peek() != '+' || str.charAt(i) == '-' &&  stack.peek() != '-') {
                    while (!stack.isEmpty() && (stack.peek() != '+' || stack.peek() != '-' || stack.peek() != '(')){
                        queue.add(stack.pop());
                    }
                    stack.add(str.charAt(i));
                }
            } else if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                while (stack.peek() != '('){
                    queue.add(stack.pop());
                }
                stack.pop();
            }
        }
        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
        return queue.toString().replace("[", "").replace("]", "").replace(",", " ");

    }
    
    public static boolean isHaveLogSymbol(List<Character> logSym, char str){
        for (int i = 0; i < logSym.size(); i++) {
            if (logSym.get(i) == str){
                return true;
            }
        }
        return false;
    }

    public static boolean isDigit(char value){
        try {
            int n = Integer.parseInt(String.valueOf(value));
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public static int searchSymbolIndex(String str, char symbol1, char symbol2){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol1 || str.charAt(i) == symbol2){
                return i;
            }
        }
        return -1;
    }
}
