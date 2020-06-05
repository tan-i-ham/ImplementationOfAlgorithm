package com.hannah.datastructure.myarray;


public class ReverseAStringApp {
    public static void main(String[] args) {
        String str = "Hi, How are you";
//        String str = "";

        System.out.println("original string: " + str);
        reverse(str);
    }

    public static void reverse(String str) {
        // edge case
        if (str.length() == 0 || str.length() == 1) {
            System.out.println(str);
            return;
        }
        char[] charArray = str.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = charArray.length - 1; i >= 0; i--) {
            stringBuilder.append(charArray[i]);
        }
        System.out.println("reversed string: " + stringBuilder.toString());

    }
}
