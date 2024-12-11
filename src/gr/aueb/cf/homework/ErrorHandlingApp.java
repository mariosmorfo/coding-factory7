package gr.aueb.cf.homework;

import java.util.Scanner;

public class ErrorHandlingApp {
    public static void main(String[] args) {
        while (true) {

            try {
                printMenu();

                int choice = getChoice();

                if(choice == 5) {
                    System.out.println("Exit... Goodbye");
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void printMenu() {

        System.out.println("MENU:");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Αναζήτηση");
        System.out.println("4. Ενημέρωση");
        System.out.println("5. Έξοδος");
        System.out.println("Please choose an option: 1 - 5");
    }

    public static int getChoice() throws IllegalArgumentException  {
        int choice;
        Scanner in = new Scanner(System.in);



                if (!in.hasNextInt()) {
                    throw new IllegalArgumentException("Invalid input. Please insert a number;");

                }
                choice = in.nextInt();

                 if (choice < 1 || choice > 5) {
                     throw new IllegalArgumentException("Please make a choice between 1 and 5");

                 }
                return choice;
        }


        }


