package com.hannah.datastructure.stack;

import com.hannah.datastructure.common.ListNode;

import java.util.EmptyStackException;

public class StackByLinkedList {
    ListNode head;
    int size;

    public void push(int newVal) {
        ListNode node = new ListNode(newVal);
        node.next = head;
        head = node;
        size++;
    }

    public int pop() {
        if (head == null) {
            throw new EmptyStackException();
        }
        int returnVal = head.value;
        head = head.next;
        size--;
        return returnVal;
    }

    public int peek() {
        if (head == null) {
            throw new EmptyStackException();
        }
        return head.value;
    }

    public int size() {
        return size;
    }

    public void displayStack() {
        ListNode curr = head;
        System.out.print("top <<<< ");
        while (curr != null) {
            System.out.format("%d ", curr.value);
            curr = curr.next;
        }
        System.out.println(" <<<< bottom ");
    }
}
