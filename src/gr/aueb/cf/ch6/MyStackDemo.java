package gr.aueb.cf.ch6;

//
//public class MyStackDemo {
//    static int[] stack = new int[50];
//    static int top = -1;
//
//    public static void main(String[] args) {
//
//
//    }
//
//    public static void push(int num) {
//        if (isFull()) {
//            System.out.println("Stack is full");
//            return;
//        }
//        stack[++top] = num;
//    }
//
//    private static int isFull() {
//        return top == stack.length - 1;
//    }
//
//    private static boolean isEmpty() {
//        return top == -1;
//    }
//
//    public static int pop() {
//        if (isEmpty()) {
//             new RuntimeException("Stack is empty");
//        }
//        return stack[top--];
//    }
//    private static intisFull() {
//        return top == stack.length -1;
//    }
//}