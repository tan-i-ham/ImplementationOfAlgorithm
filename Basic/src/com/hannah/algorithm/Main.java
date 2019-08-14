package com.hannah.algorithm;

import com.hannah.algorithm.sorting.SortAlgorithm;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] input = {12, 59, 7, 9, 16};

        System.out.println("Before selection sorting: " + Arrays.toString(input));
        int[] output = SortAlgorithm.SelectionSort(input);
        System.out.println("After selection sorting: " + Arrays.toString(output));

        int[] input2 = {33, 9, 71, 29, 6};
        System.out.println("Before bubble sorting: " + Arrays.toString(input2));
        int[] output2 = SortAlgorithm.BubbleSort(input2);
        System.out.println("After bubble sorting: " + Arrays.toString(output2));

        int[] input3 = {5, 4, 2, 1, 3};
        System.out.println("Before insertion sorting: " + Arrays.toString(input3));
        int[] output3 = SortAlgorithm.InsertionSort(input3);
        System.out.println("After insertion sorting: " + Arrays.toString(output3));

    }
}
