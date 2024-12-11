package gr.aueb.cf.homework;
/**
 * Calculates the sum of two integers
 * and the result is printed at console
 * (standard output)
 */
public class AddApp {
    public static void main(String[] args){

        int num1 = 5;
        int num2 = 12;
        int result = 0 ;
        // Εντολες
        result= num1 + num2;

        // Εκτύπωση αποτελέσματος
        System.out.println("Το αποτέλεσμα είναι: " + result);
        System.out.println("Το άθροισμα των " + num1 +"," + num2 + " είναι ίσο με: " + result);
        System.out.println("To άθροισμα των %d, %d είναι ίσο με: %d/n, num1, num2, result");
    }
}