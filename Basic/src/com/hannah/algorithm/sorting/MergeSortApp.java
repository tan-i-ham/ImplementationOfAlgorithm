package com.hannah.algorithm.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSortApp {
    public static void main(String[] args) {
        mergeSortedArray(new int[]{3, 5, 56}, new int[]{4, 9, 13, 78, 88});
    }

    public static void mergeSortedArray(int[] A, int[] B) {
        int lenA = A.length;
        int lenB = B.length;

        int startA = 0;
        int startB = 0;

        List<Integer> ans = new ArrayList<>();
        while (startA < lenA || startB < lenB) {
            if (startA >= lenA) {
                ans.add(B[startB]);
                startB++;
                continue;
            }
            if (startB >= lenB) {
                ans.add(A[startA]);
                startA++;
                continue;
            }
            if (startB >= lenB || A[startA] < B[startB]) {
                ans.add(A[startA]);
                startA++;
            } else {
                ans.add(B[startB]);
                startB++;
            }
        }
        System.out.println(ans);
    }
}
