package com.hannah.datastructure;

/**
 * @author yihan.a.chen
 */
public class Deque {
    int mazSize;
    long[] dequeArray;
    int front;
    int rear;

    public Deque(int s) {
        mazSize = s;
        dequeArray = new long[mazSize];
        front = 0;
        rear = -1;
    }

    public void insertLeft(long num) {
        dequeArray[front++] = num;
        rear++;
    }

    public long removeLeft() {
        rear--;
        return dequeArray[front--];
    }

    public void insertRight(long num) {
        dequeArray[++rear] = num;

    }

    public long removeRight() {
        return dequeArray[rear--];
    }
}
