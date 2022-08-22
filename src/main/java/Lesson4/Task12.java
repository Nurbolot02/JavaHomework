package Lesson4;

import java.util.Stack;

public class Task12 {
    /*
    12.	Написать программу, определяющую правильность расстановки скобок в выражении.
    Пример 1: a+(d*3) - истина
    Пример 2: [a+(1*3) - ложь
    Пример 3: [6+(3*3)] - истина
    Пример 4: {a}[+]{(d*3)} - истина
    Пример 5: <{a}+{(d*3)}> - истина
    Пример 6: {a+]}{(d*3)} - ложь
     */
    public static void main(String[] args) {
        String str = "a+(1*3)";
        System.out.println();
        System.out.println(isParenthesesPlacement(str));
    }

    /**
     * определяет правильность расстановки скобок в выражении.
     *
     * @param str
     * @return true or folse
     */
    public static boolean isParenthesesPlacement(String str) {
        Stack<Character> placement = new Stack<>();
        char[][] placements = {{'(', ')'}, {'{', '}'}, {'[', ']'}, {'<', '>'}};
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < placements.length; j++) {
                if (placement.isEmpty() && str.charAt(i) == placements[j][1]) {
                    return false;
                }
                if (str.charAt(i) == placements[j][0]) {
                    placement.add(placements[j][1]);
                } else if (!placement.empty() && str.charAt(i) == placements[j][1]) {
                    if (placement.pop() == str.charAt(i)) {
                    } else {
                        return false;
                    }
                }
            }
        }
        if (!placement.empty()) {
            return false;
        }
        return true;
    }
}
