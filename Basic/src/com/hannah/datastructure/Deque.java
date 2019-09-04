package com.hannah.datastructure;

/**
 * @author yihan.a.chen
 */
public class Deque {
    int maxSize;
    long[] dequeArray;
    int front;
    int rear;
    int nElement;


    public Deque(int s) {
        maxSize = s;
        dequeArray = new long[maxSize];
        front = 0;
        rear = 0;
        nElement = 0;
    }

    public void insertLeft(long num) {
        // deal with wraparound
//        if (rear == maxSize - 1) {
//            rear = -1;
//        }
//
//        if (nElement == 0) {
//            dequeArray[++rear] = num;
//        } else {
//            int oldRear = rear;
//            while (oldRear>0) {
//                dequeArray[oldRear+1]=dequeArray[oldRear];
//            }
//
//        }


        dequeArray[front--] = num;
        // deal with wraparound
        if (front < 0) {
            front = maxSize - 1;
        }

        nElement++;
    }

    public void removeLeft() {
        long numRemoved = dequeArray[++front];
        System.out.println(String.format("%d be removed.", numRemoved));
        // deal with wraparound
        if (front >= maxSize - 1) {
            front = -1;
        }
        nElement--;
    }

    public void insertRight(long num) {
        dequeArray[++rear] = num;
        // deal with wraparound
        if (rear == maxSize - 1) {
            rear = -1;
        }

        nElement++;
    }

    public void removeRight() {
        long numRemoved = dequeArray[rear--];
        System.out.println(String.format("%d be removed.", numRemoved));
        nElement--;
    }

    public String isEmpty() {
        return nElement == 0 ? "Deque is empty" : "Deque is not empty";
    }

    public String isFull() {
        return nElement >= maxSize ? "Deque is full" : "Deque is not full";
    }

    public void display() {
        if (nElement == 0) {
            System.out.println("The queue is empty now.");
        } else {
            System.out.print("[front -> rear]:");
            if (front < rear) {
                for (int i = front + 1; i <= nElement ; i++) {
                    System.out.print(dequeArray[i % maxSize]);
                    System.out.print(" ");
                }
            } else {
                for (int i = front + 1; i <= front + nElement; i++) {
                    System.out.print(dequeArray[i % maxSize]);
                    System.out.print(" ");
                }
            }


            System.out.println("[end]");
        }
    }
}
