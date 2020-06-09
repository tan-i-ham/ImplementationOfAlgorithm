package com.hannah.datastructure.stack;

public class StackX {
    Deque deque;

    public StackX(int sizeOfStack) {
        deque = new Deque(sizeOfStack);
    }

    public void push(int num) {
        deque.insertRight(num);
    }

    public void pop() {
        deque.removeRight();
    }

    public long peek() {
        return deque.dequeArray[deque.rear];
    }

    public void display() {
        deque.display();
    }
}
