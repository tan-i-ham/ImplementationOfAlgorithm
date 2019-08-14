package com.hannah.datastructure;

/**
 * @author yihan.a.chen
 */
public class StackApp {
    public static void main(String[] args) {
        StackY firstStack = new StackY(10);

        firstStack.push(2);
        firstStack.push(14);
        firstStack.push(25);
        firstStack.push(9);

        firstStack.display();

        firstStack.peek();
        System.out.println("==== pop one element ====");

        firstStack.pop();
        firstStack.peek();
        firstStack.push(134);

        firstStack.display();

    }
}
