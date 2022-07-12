package Lesson1;

import useFulFutires.FileN;
import useFulFutires.FindN;
import useFulFutires.Parse;

import java.io.IOException;

public class Task2 {
    public static void main(String[] args) throws IOException {
        String path = "src/main/java/Lesson1/inputTask2.txt";
        String readingText = FileN.BufferedReader(path);

        if(readingText != null){
            int a = Parse.getNumber(readingText, 'a');
            int b = Parse.getNumber(readingText, 'b');
            int add = 1, mult = 2;

            String[]  result = String.valueOf(FindN.FindMinimumCommand(a, b, add, mult, "a", new StringBuilder(""))).split("\n");
            String BestWay = result[0];

            for (int i = 1; i < result.length; i++) {
                if (result[i].length() < BestWay.length()){
                    BestWay = result[i];
                }
            }
            String outResultText = String.format("For %d - %d \nBest way: %s", a, b, BestWay);
            System.out.printf(outResultText);

            boolean flag = false;
            String pathWriter = "src/main/java/Lesson1/outputTask2.txt";
            FileN.Writer(outResultText, pathWriter, flag);
        }
    }


}
