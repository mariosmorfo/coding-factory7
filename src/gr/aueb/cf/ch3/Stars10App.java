package gr.aueb.cf.ch3;
/**
 * print 10 horizontal stars
 */

import java.util.Scanner;

public class Stars10App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = 1;
        int n = 0;

        System.out.println("Please insert number of iterations");
        n = in.nextInt();

        while (n >= i){
            System.out.print("*");
            i++;
        }
    }
}