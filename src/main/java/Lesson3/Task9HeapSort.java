package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task9HeapSort {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(0, 1000);
        }
        System.out.println(Arrays.toString(numbers));
        heapSort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(numbers));
        System.out.println(checkArray(numbers));
    }

    public static boolean checkArray(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) return false;
        }
        if (numbers[numbers.length - 2] > numbers[numbers.length - 1]) return false;
        return true;
    }

    public static void heapSort(int[] numbers, int minNumberIndex, int maxNumberIndex) {
        if (minNumberIndex >= maxNumberIndex) return;
        int pivotIndex = getPivotIndex(numbers, minNumberIndex, maxNumberIndex);
        heapSort(numbers, minNumberIndex, pivotIndex - 1);
        heapSort(numbers, pivotIndex + 1, maxNumberIndex);
    }

    public static int getPivotIndex(int[] numbers, int minNumberIndex, int maxNumberIndex) {
        int pivotIndex = minNumberIndex - 1;
        for (int i = minNumberIndex; i < maxNumberIndex; i++) {
            if (numbers[i] < numbers[maxNumberIndex]) {
                pivotIndex++;
                swap(numbers, i, pivotIndex);
            }
        }
        pivotIndex++;
        swap(numbers, pivotIndex, maxNumberIndex);
        return pivotIndex;
    }

    public static void swap(int[] numbers, int minNumberIndex, int maxNumberIndex) {
        int buffer = numbers[minNumberIndex];
        numbers[minNumberIndex] = numbers[maxNumberIndex];
        numbers[maxNumberIndex] = buffer;
    }
}
