package gr.aueb.cf.homework;

import java.util.Scanner;

public class SixDigitApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[6]; // Πίνακας για 6 ακεραιους

        System.out.println("Εισάγετε 6 ακεραίους αριθμούς απο  1 - 49");

        for (int i = 0; i < 6; i++) {

            while (true) {                                      // Επαναληψη μεχρι ο χρηστης να δωσει εγκυρο αριθμο
                System.out.print("Αριθμός " + (i + 1) + ": ");
                int num = in.nextInt();

                if (num >= 1 && num <= 49) {       // Οριοθετει τον πινακα μεταξυ 1 και 49
                    numbers[i] = num;                   // Αποθηκευει την τιμη του num στο πινακα
                    break;                            // Τερματιζει την επαναληψη
                } else {
                    System.out.println("Παρακαλώ εισάγετε αριθμό μεταξυ 1 και 49");
                }

            }
        }
        boolean evensResult = moreThan3evens(numbers);  // Αποθηκευει τον boolean για evens στο evensResult

        if (evensResult) {

            System.out.println("Υπάρχουν 3 άρτιοι αριθμοί.");

        } else {

            System.out.println("Δεν υπάρχουν 3 άρτιοι αριθμοί.");
        }

        boolean oddResult = moreThanThreeOdds(numbers); // Αποθηκευει τον boolean για odd στο oddResult

        if (oddResult) {

            System.out.println("Υπάρχουν 3 περιττοί αριθμοί.");

        } else {

            System.out.println("Δεν υπάρχουν 3 περιττοί αριθμοί.");
        }

        boolean consecutiveResult = moreThanTwoConsecutive(numbers); // Αποθηκευει τον boolean για 2 Consecutive

        if (consecutiveResult) {
            System.out.println("Υπάρχουν 3 συνεχόμενοι αριθμοί.");
        } else {
            System.out.println("Δεν Υπάρχουν 3 συνεχόμενοι αριθμοί.");
        }
        boolean isSameEndings = moreThanTwoSameEndings(numbers);

        if(isSameEndings) {
            System.out.println("Υπάρχουν 3 συνεχόμενοι αριθμοί με τον ίδιο λήγοντα");
        } else {
            System.out.println("Δεν υπάρχουν 3 συνεχόμενοι αριθμοί με τον ίδιο λήγοντα");
        }
    }

    public static boolean moreThan3evens(int[] arr) {
        int evens = 0; // Αρχικοποιηση της τιμης even

        if (arr == null) return false; // Ελεγχει εαν ο πινακας ειναι κενος

        for (int el : arr) {
            if (el % 2 == 0) {  // Αρτιος εαν %2 == 0
                evens++;
            }
        }
        return evens > 3;
    }

    public static boolean moreThanThreeOdds(int[] arr) {
        int odds = 0; // Αρχικοποιηση της τιμης odd

        if (arr == null) return false;

        for (int el : arr) {
            if (el % 2 != 0) { // Περιττος εαν != 0
                odds++;
            }
        }
        return odds > 3;
    }

    public static boolean moreThanTwoConsecutive(int[] arr) {
        int cons = 0;

        if (arr == null) return false;

        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] == arr[i + 1] - 1) && (arr[i] == arr[i + 2] - 2)) {
                cons++;
            }
        }
        return cons >= 1;
    }

    public static boolean moreThanTwoSameEndings(int[] arr) {
        int[] endings = new int[10];
        boolean isSameEndings = false;

        for (int el : arr) {
            endings[el % 10]++;
        }
            for (int count : endings) {
                if(count > 3) {
                    isSameEndings = true;
                    break;
                }
            }
            return isSameEndings;
    }
}