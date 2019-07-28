package com.hannah.algorithm.sorting;

public class SortAlgorithm {

    public final static int[] SelectionSort(int[] input) {

        int[] ans = input;

        for (int i = 0; i < (input.length) - 1; i++) {
            int minIndex = i;
            // find the smallest number in the unsorted sub array
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }
            // put the i-th smallest number at the position i
            ans = swap(input, minIndex, i);
        }
        return ans;
    }

    public static int[] BubbleSort(int[] input) {
        int[] ans = input;

        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < input.length - i; j++) {
                if (input[j] > input[j + 1]) {
                    ans = swap(input, j, j + 1);
                }
            }

        }
        return ans;
    }

    public static int[] swap(int[] arr, int x, int y) {
        int temp = arr[y];
        arr[y] = arr[x];
        arr[x] = temp;
        return arr;
    }

    public static int[] InsertionSort(int[] input) {
        // previous i-th elements already sorted
        for (int i = 1; i < input.length; i++) {
            int pivot = input[i];
            int hole = 0;
            for (int j = i; j > 0; j--) {
                if (pivot < input[j - 1]) {
                    input[j] = input[j - 1];
                } else {
                    hole = j;
                    break;

                }

            }
            input[hole] = pivot;
        }

        return input;
    }
}
