package com.hannah.datastructure;

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



    }
}
