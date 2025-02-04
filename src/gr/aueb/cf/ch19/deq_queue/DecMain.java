package gr.aueb.cf.ch19.deq_queue;

import gr.aueb.cf.ch19.deq_stack.MyStack;

public class DecMain {
    public static void main(String[] args) {
    MyQueue<String> strQueue = new MyQueue<>();

    strQueue.enQueue("ABC23445");
    strQueue.enQueue("ABC123456");
    strQueue.enQueue("DEA567891");


    String firstOut = strQueue.deQueue();
        System.out.println(firstOut);
        System.out.println();

        strQueue.forEach(System.out::println);

    }
}
