package com.hannah.datastructure.stack;

/**
 * @author yihan.a.chen
 */
public class StackApp {
    public static void main(String[] args) {
        StackX firstStack = new StackX(10);

        firstStack.push(2);
        firstStack.push(14);
        firstStack.push(25);
        firstStack.push(9);

        firstStack.display();

        firstStack.peek();

        firstStack.pop();
        firstStack.display();
        firstStack.pop();
        firstStack.display();
        firstStack.peek();
        firstStack.push(134);

        firstStack.display();

        System.out.println("======== implement by linked list");
        StackByLinkedList stack = new StackByLinkedList();
        stack.push(12);
        stack.push(4);
        stack.push(99);
        System.out.println(stack.peek());
        stack.displayStack();
        stack.pop();
        stack.displayStack();
        stack.pop();
        stack.displayStack();
    }
}