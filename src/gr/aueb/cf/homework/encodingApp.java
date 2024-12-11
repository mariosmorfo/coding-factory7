package gr.aueb.cf.homework;

import java.util.Scanner;

public class encodingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder encoded = new StringBuilder();
        StringBuilder secondEncoded = new StringBuilder();

        System.out.println("Please enter the string");
        String input = sc.nextLine();


        for(char c : input.toCharArray()) {
            encoded.append((char) (c + 1));
        }

        System.out.println("Decrypted string: " + encoded);


        System.out.println("Please enter the string");
        String theSecondInput = sc.nextLine();

        for(char c : theSecondInput.toCharArray()) {
            secondEncoded.append((char) (c -1));
        }

        System.out.println("Decrypted string: " + secondEncoded);

        }
    }
