package gr.aueb.cf.homework;

import java.util.Scanner;

public class PrintMenu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do{
            System.out.println("Παρακαλώ επιλέξτε ένα απο τα παρακάτω");
            System.out.println("1.Εισαγωγή");
            System.out.println("2.Διαγραφή");
            System.out.println("3.Ενημέρωση");
            System.out.println("4.Αναζήτηση");
            System.out.println("5 'Εξοδος");

            choice = in.nextInt();

            if( choice ==1 ) {
                System.out.println("Επιτυχής εισαγωγή");

            } else if ( choice == 2) {
                System.out.println("Επιτυχής διαγραφή");

            } else if ( choice == 3) {
                System.out.println("Επιτυχής ενημέρωση");

            } else if ( choice == 4) {
                System.out.println("Επιτυχής αναζήτηση");

            } else if (choice == 5 ){
                System.out.println("Επιλέξατε έξοδος");
            } else {
                System.out.println("Εrror");
            }

        }while (choice != 5);

        System.out.println("Goodbye");
    }
}
