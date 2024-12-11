package gr.aueb.cf.ch5;
/*
* Εμφανιζει ενα μενου επιλογων και ο χρηστης επιλεγει
* ενα ιτεμ και στην συνεχεια με την επιλογη εκτελειται καποια ενεργεια
 */
import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        do{
            printMenu();
            choice = in.nextInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Error. Choice not valid");
                continue;
            }

            doOnChoice(choice);

        } while (choice!=5);
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα απο τα παρακάωτω");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Αναζήτηση");
        System.out.println("4. Ενημέρωση");
        System.out.println("5. Έξοδος");
    }
        public static boolean isChoiceValid (int choice){
        return choice >=1 && choice <= 5;
        }
        public static void doOnChoice (int choice) {
        switch (choice) {
            case 1:
                System.out.println("Εισαγωγή process");
                break;

            case 2:
                System.out.println("Διαγραφή process");
                break;

            case 3:
                System.out.println("Αναζήτηση process");
                break;

            case 4:
                System.out.println("Ενημέρωση process");
                break;

            case 5:
                System.out.println("Εξοδος process");
                break;

            default:
                System.out.println("Λάθος επιλογή");
                break;

        }
        }

    }

