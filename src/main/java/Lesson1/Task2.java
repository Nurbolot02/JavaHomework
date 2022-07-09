package Lesson1;

import useFulFutires.FileN;
import useFulFutires.Parse;

import java.io.IOException;

public class Task2 {
    public static void main(String[] args) throws IOException {
        String path = "src/main/java/Lesson1/inputTask2.txt";
        String readingText = FileN.BufferedReader(path);

        if(readingText != null){
            int a = Parse.getNumber(readingText, 'a');
            int b = Parse.getNumber(readingText, 'b');


        }
    }

    static String GetMinimumCommand(int a, int b){
        int c = 2, d = 1, division;
        if (a > b){
            return "not decide it!";
        }

        if(a % 2 != 0){
            division = a / 2 - 1;
            a = addD(a, division);

        }
        return "";
    }
    static int addD(int a, int division){
        int d = 1;
        for (int i = 0; i < division; i++) {
            a += d;
        }
        return a;
    }
}
