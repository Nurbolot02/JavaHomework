package Lesson1;

public class findProductSumDigitOfNumbers {
    //Given an integer number n, return the difference between the product of its digits and the sum of its digits.
    public static void main(String[] args) {
        int n = 4421;
        System.out.println(subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n) {
        int productOfNumbers = 1, sumOfNumbers = 0, num = 10;
        while (n > 0){
            productOfNumbers *= n % num;
            sumOfNumbers += n % num;
            n /= num;
        }
        return productOfNumbers - sumOfNumbers;
    }
}
