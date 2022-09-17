package Lesson4;

import java.util.Arrays;

public class Task6MergeSort {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 1, 22, 2};
        System.out.println(Arrays.toString(numbers));
        mergeSort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static void mergeSort(int[] array) {
        if (array.length < 2) return;
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];
        for (int i = 0; i < left.length; i++) {
            left[i] = array[i];
        }
        for (int i = 0; i < array.length - mid; i++) {
            right[i] = array[mid + i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    public static void merge(int[] array, int[] array1, int[] array2) {
        if (array.length == 2) {
            array[0] = Math.min(array1[0], array2[0]);
            array[1] = Math.max(array1[0], array2[0]);
            return;
        }
        int arrayMinIndex = 0;
        int array1MinIndex = 0;
        int array2MinIndex = 0;
        while (array1MinIndex < array1.length && array2MinIndex < array2.length) {
            if (array1[array1MinIndex] <= array2[array2MinIndex]) {
                array[arrayMinIndex] = array1[array1MinIndex];
                array1MinIndex++;
            } else {
                array[arrayMinIndex] = array2[array2MinIndex];
                array2MinIndex++;
            }
            arrayMinIndex++;
        }
        while (arrayMinIndex <= array.length - 1 && array1MinIndex < array1.length) {
            array[arrayMinIndex] = array1[array1MinIndex];
            array1MinIndex++;
            arrayMinIndex++;
        }
        while (arrayMinIndex <= array.length - 1 && array2MinIndex < array2.length) {
            array[arrayMinIndex] = array2[array2MinIndex];
            array2MinIndex++;
            arrayMinIndex++;
        }

    }
}
