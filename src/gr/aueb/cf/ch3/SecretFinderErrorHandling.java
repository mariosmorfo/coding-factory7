package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SecretFinderErrorHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;
        boolean success = false;

        while (true) {
            System.out.println("Please insert a number");
            num = scanner.nextInt();

            if (num !=SECRET) {
                System.out.println("Please try again");
                continue;
            }
            System.out.println("Found!");
            break;
        }
    }
}