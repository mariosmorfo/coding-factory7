package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SwitchCaseApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Επιλέξτε ένα απο τα παρακάτω");
            System.out.println("1. One-player game");
            System.out.println("2. Two -player game");
            System.out.println("3. Team game");
            System.out.println("4. Quit");

            choice = in.nextInt();

//            if ( choice < 1 || choice > 4) {
//                System.out.println("Joice must be between 1-4");
//                System.out.println("Try again");
//                continue;
//            }
//            if ( choice == 1) {
//                System.out.println("One- player game started");
//            } else if ( choice == 2){
//                System.out.println("Two-player game");
//            } else if ( choice == 3){
//                System.out.println("Team geam started");
//            } else {
//                System.out.println("Quiting");
//

            switch (choice) {
                case 1:
                    System.out.println("One- player game started");
                    break;
                case 2:
                    System.out.println("Two-player game");
                    break;
                case 3:
                    System.out.println("Team geam started");
                    break;
                case 4:
                    System.out.println("Quitng");
                    break;

                    default:
                    System.out.println("Error in choice");
                    break;
            }

        } while (choice != 4);
        System.out.println("Goodbye");
    }
}

