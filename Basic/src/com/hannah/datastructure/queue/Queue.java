package com.hannah.datastructure.queue;

public class Queue {
    private int maxSize;

    private long[] queueArray;
    private int front;
    private int rear;
    private int nElement;

    public Queue(int size) {
        this.maxSize = size;
        queueArray = new long[maxSize];
        front = 0;
        rear = -1;
        nElement = 0;
    }

    public void insert(long num) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = num;
        nElement++;
    }

    public long remove() {
        long temp = queueArray[front];
        if (front == maxSize) {
            front = 0;
        }
        nElement--;
        return temp;
    }

    public long peekFront() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return nElement == 0;
    }

    public boolean isFull() {
        return nElement == maxSize;
    }

    public int size() {
        return nElement;
    }

    public void display() {
        
    }

}
