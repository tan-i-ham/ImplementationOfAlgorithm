package com.hannah.datastructure.queue;

public class QueueApp {
    public static void main(String[] args) {
//        Queue q = new Queue(5);
//        q.insert(20);
//        q.insert(12);
//        q.insert(34);
//        q.insert(99);
//        q.insert(71);
//
//        q.display();
//
//        q.remove();
//        q.remove();
//
//        q.display();
//
//        q.insert(66);
//        q.display();
//        q.insert(66);
//        q.display();
        QueueByLinkedList queue  = new QueueByLinkedList();
        queue.push(4);
        queue.push(21);
        queue.push(6);
        queue.printQueue();
        queue.pop();
        queue.printQueue();
        System.out.format("peek: %d", queue.peek());

    }

}
