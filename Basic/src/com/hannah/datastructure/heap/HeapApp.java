package com.hannah.datastructure.heap;

import java.util.Arrays;

public class HeapApp {
    public static void main(String[] args) {
        buildMaxHeap(new int[]{
                1, 5, 6, 9, 7, -12
        });
    }

    public static void buildMaxHeap(int[] arr) {
        int[] heap = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            heap[i] = arr[i];
            System.out.println(Arrays.toString(heap));
            heap = heapifyUp(heap, i);
            System.out.println(Arrays.toString(heap));
        }
    }

    public static int[] heapifyUp(int[] heap, int currentIndex) {
        while (true) {
            // root node
            if (currentIndex == 0) {
                break;
            }
            // get the parent node index
            int parentIndex = (currentIndex + 1) / 2 - 1;
            if (heap[parentIndex] < heap[currentIndex]) {
                // swap the value
                int temp = heap[parentIndex];
                heap[parentIndex] = heap[currentIndex];
                heap[currentIndex] = temp;
                currentIndex = parentIndex;
            } else {
                // if not, break here
                break;
            }
        }

        return heap;
    }
}
