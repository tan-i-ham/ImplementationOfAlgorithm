package com.hannah.datastructure;

/**
 * @author yihan.a.chen
 */
public class DequeApp {
    public static void main(String[] args) {
        Deque deque = new Deque(5);

        deque.insertLeft(123);
        deque.display();
//
        deque.insertRight(654);
        deque.display();

        deque.insertLeft(42);
        deque.display();

        deque.insertRight(9);
        deque.display();
        deque.insertLeft(1);


        deque.display();
//        System.out.println(deque.isFull());

        deque.removeLeft();
        deque.display();
        deque.removeLeft();
        deque.display();
        deque.removeLeft();
        deque.display();
        deque.removeLeft();
        deque.display();
        deque.removeLeft();
        deque.display();
//        deque.insertLeft(333);
//

//        deque.removeRight();
//        deque.display();
    }
}
