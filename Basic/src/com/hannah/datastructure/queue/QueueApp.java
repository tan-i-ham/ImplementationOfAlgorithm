package com.hannah.datastructure.queue;

public class QueueApp {
    public void main(String[] args) {
        Queue q = new Queue(10);
        q.insert(20);
        q.insert(12);
        q.insert(34);
        q.insert(99);
        q.insert(71);

        q.remove();
        q.remove();

    }

}
