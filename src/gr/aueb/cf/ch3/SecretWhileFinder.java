package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SecretWhileFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET = 13;
        boolean success = false;

        do {
            System.out.println("Please insert a num");
            num = in.nextInt();

            if (num == SECRET) {
                System.out.println("Secret found !!!");
                success = true;
            } else {
                System.out.println("Please try again !!!");
            }
        } while (!success);

    }
}