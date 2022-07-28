package Lesson2;

public class Task3 {
    public static void main(String[] args) {
        /*
        3.	Написать программу вычисления n-ого треугольного числа.
         */
        for (int i = -10; i < 5; i++) {
            System.out.println(getTriangularNumber(i));
        }

    }

    public static int getTriangularNumber (int n){
        return n * (n + 1) / 2;
    }
}
