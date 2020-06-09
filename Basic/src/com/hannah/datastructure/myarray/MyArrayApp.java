package com.hannah.datastructure.myarray;

public class MyArrayApp {

    public static void main(String[] args) {
        MyArray myArray = new MyArray(10);
        System.out.println(myArray.toString());
        myArray.push(2);
        myArray.push(12);
        myArray.push(3);
        System.out.println(myArray.toString());
        myArray.get(2);

    }
}
