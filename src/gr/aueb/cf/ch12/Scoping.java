package gr.aueb.cf.ch12;

public class Scoping {
    static int result = 20;

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = 0;

        result = add(a,b);
        System.out.println(+ result);
    }
    public static int add(int a, int b) {
        return a + b;
    }

    }

