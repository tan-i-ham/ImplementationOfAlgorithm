package com.hannah.datastructure.queue;

import com.hannah.datastructure.common.ListNode;

public class QueueByLinkedList {

    ListNode head;
    ListNode tail;
    int size = 0;

    public void push(int value) {
        ListNode newNode = new ListNode(value);
        if (tail == null) {
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }

        size++;
    }

    public int pop() {
        int returnValue = head.value;
        head = head.next;
        size--;
        return returnValue;
    }

    public int peek() {
        return tail.value;
    }

    public void printQueue() {
        ListNode curr = head;
        while (curr != null) {
            System.out.format("%d ", curr.value);
            curr = curr.next;
        }
        System.out.println("<< end");
    }
}
