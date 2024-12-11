package gr.aueb.cf.homework;

import java.util.Scanner;

public class enCodeKeyApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder encoded = new StringBuilder();

        System.out.println("Please enter the string");
        String input = sc.nextLine();

        System.out.println("Please enter the key");
        int key = sc.nextInt();

        for(char c :input.toCharArray()) {
            encoded.append((char) (c + key));
        }

        System.out.println("Decrypted string: " + encoded);
    }
}
