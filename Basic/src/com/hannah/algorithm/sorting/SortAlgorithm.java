package com.hannah.algorithm.sorting;

import java.util.Arrays;

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
    // the maximum number will be bubble up every outer round
        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < input.length - i; j++) {
                if (input[j] > input[j + 1]) {
                    ans = swap(input, j, j + 1);
                }
            }
            System.out.println("sorting: " + Arrays.toString(ans));
        }
        return ans;
    }

    public static int[] swap(int[] arr, int x, int y) {
        int temp = arr[y];
        arr[y] = arr[x];
        arr[x] = temp;
        return arr;
    }

    public static int[] InsertionSort(int[] arr) {
        // previous i-th elements already sorted
        for (int outer = 1; outer < arr.length; outer++) {
            int temp = arr[outer];
            int hole = 0;
            for (int inner = outer; inner > 0; inner--) {
                if (temp < arr[inner - 1]) {
                    // shift num greater than temp to right, in order to make room for insert
                    // shift
                    arr[inner] = arr[inner - 1];
                } else {
                    // temp is greater than elements before the inner-1
                    // so record the index which temp should be insert
                    hole = inner;
                    break;

                }

            }
            // insert
            arr[hole] = temp;
            System.out.println("sorting: " + Arrays.toString(arr));
        }

        return arr;
    }
}
