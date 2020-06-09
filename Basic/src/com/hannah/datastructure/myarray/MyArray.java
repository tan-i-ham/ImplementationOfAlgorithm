package com.hannah.datastructure.myarray;

import java.util.Arrays;

public class MyArray {
    private int size;
    private int[] arr;
    private int currIndex;

    public MyArray(int size) {
        this.size = size;
        this.arr = new int[size];
        this.currIndex = 0;
    }

    public int get(int index) {
        System.out.format("get value in index %d, he value is %d\n", index, arr[index]);

        return arr[index];
    }

    public void push(int val) {
        arr[currIndex] = val;
        System.out.format("push %d to index %d\n", val, currIndex);
        this.currIndex++;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

}
