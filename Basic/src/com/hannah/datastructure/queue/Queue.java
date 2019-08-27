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
        System.out.println("Insert: " + num);
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = num;
        nElement++;
    }

    public long remove() {
        long temp = queueArray[front++];
        System.out.println("Remove: " + temp);
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

    /**
     * Programming Project 4-1
     */
    public void display() {
        if (nElement == 0) {
            System.out.println("The queue is empty now.");
        } else {
            System.out.print("[front -> rear]:");
            int i = front;
            while (i != rear) {
                System.out.print(queueArray[i] + " ");
                i++;
                if (i == maxSize) {
                    i = 0;
                    if (i == rear) {
                        System.out.print(queueArray[rear] + " ");
                        break;
                    }
                }
                if (i == rear) {
                    System.out.print(queueArray[rear] + " ");
                    break;
                }


            }

            System.out.println("[end]");
        }
    }

}
