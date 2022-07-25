package Lesson2;

public class LeetCodeTask2 {
    /*
    You are given two strings word1 and word2.
    Merge the strings by adding letters in alternating order, starting with word1.
    If a string is longer than the other,
    append the additional letters onto the end of the merged string.
    Return the merged string.
     */
    public static void main(String[] args) {
        String word1 = "abcd", word2 = "pqct";
        String result = mergeAlternately(word1,word2);
        System.out.println(result);
    }

    public static String mergeAlternately(String word1, String word2) {
        int strLength = Math.min(word1.length(), word2.length());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strLength; i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }
        if (word1.length() > word2.length()){
            result.append(word1.substring(word2.length(), word1.length()));
        }else {
            result.append(word2.substring(word1.length(), word2.length()));
        }
        return String.valueOf(result);
    }
}
