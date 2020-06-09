package com.hannah.algorithm.sorting;

import java.util.Arrays;

public class QuickSortApp {
//    public static int[] sampleArr;

    public static void main(String[] args) {
        int[] sampleArr = new int[]{4, 1, 9, 6, 3, 2};
        System.out.print("Before quick sorting: ");
        System.out.println(Arrays.toString(sampleArr));
        quicksort(sampleArr, 0, sampleArr.length - 1);
        System.out.print("After quick sorting: ");
        System.out.println(Arrays.toString(sampleArr));

    }

    public static void quicksort(int[] array, int start, int end) {
        if (start < end) {
            // default, get the last element in array as pivot
            int pivot = partition(array, start, end);
            quicksort(array, start, pivot - 1);
            quicksort(array, pivot + 1, end);
        }

    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];

        int leftPartBorder = start - 1;
        for (int rightPartBorder = start; rightPartBorder < end; rightPartBorder++) {
            if (pivot > array[rightPartBorder]) {
                // swap
                leftPartBorder++;
                int temp = array[leftPartBorder];
                array[leftPartBorder] = array[rightPartBorder];
                array[rightPartBorder] = temp;
            }
        }
        leftPartBorder++;
        int finalTemp = array[leftPartBorder];
        array[leftPartBorder] = array[end];
        array[end] = finalTemp;
        return leftPartBorder;
    }
}
