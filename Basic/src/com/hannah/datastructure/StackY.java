package com.hannah.datastructure;

/**
 * @author yihan.a.chen
 */
public class StackY {
    private int maxSize;
    private int top;
    private long[] stackArray;

    public StackY(int sizeOfStack) {
        maxSize = sizeOfStack;
        stackArray = new long[maxSize];
        top = -1;
    }


    public void push(long newNum) {
        stackArray[++top] = newNum;
    }

    public long pop() {
        return stackArray[top--];
    }

    public void peek() {
        System.out.print("peek top element: ");
        System.out.println(stackArray[top]);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void display() {

        for (int index = 0; index <= top; index++) {
            System.out.println(stackArray[index]);
        }
//        while (top != -1) {
//            System.out.println(stackArray[top--]);
//        }
    }
}
