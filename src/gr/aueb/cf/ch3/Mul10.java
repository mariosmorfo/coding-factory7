package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Mul10 {
    public static void main(String[] args) {
        int i = 1;
        int result = 1;
        int n = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Please insert n");
        n= in.nextInt();

        while(i <= n){
            result *= i;
            i++;
        }
        System.out.println("Result = " + result);
    }
}
