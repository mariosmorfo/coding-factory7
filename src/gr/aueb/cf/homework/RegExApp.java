package gr.aueb.cf.homework;

import java.util.Scanner;

public class RegExApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String password;

        System.out.println("Παρακαλώ εισάγετε ένα κωδικό: ");
        password = in.next();

        if (isPasswordValid(password)){
            System.out.println("Ο κωδικός επαληθεύτηκε σωστα: " + password);
        }else {
            System.out.println("O κωδικός δεν καλύπτει τις απαιτήσεις");
        }

    }

    public static boolean isPasswordValid (String password) {
        return password.matches("\\w{8,}[A-Z]+[a-z]+");
    }
}
