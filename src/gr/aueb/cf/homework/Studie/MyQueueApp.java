package gr.aueb.cf.homework.Studie;

public class MyQueueApp {
    public static void main(String[] args) {
        MyQueue <String> myQueue = new MyQueue<>();

        myQueue.enQueue("Red car");
        myQueue.enQueue("Blue car");
        myQueue.enQueue("Red car");

        myQueue.forEach(System.out::println);
    }
}
