package gr.aueb.cf.ch5;

import java.util.Scanner;

public class AddApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int sum = 0;
        int sub = 0;

        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();

        sum = add(a, b);
        sub = sub(a ,b);

        System.out.println(sum);
        System.out.println(sub);
    }
    // adds two integers

    public static int add(int a, int b) {
//        int result = 0;
//        result = a +b;
//        return result;

        return  a + b;
    }
    // subtracts two integers

    public static int sub(int a, int b){
        return a - b;
    }
}
