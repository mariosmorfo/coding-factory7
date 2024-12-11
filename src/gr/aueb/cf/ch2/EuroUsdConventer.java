package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει τα EUROS σε USA και CENTS
 * Η ισοτημία 1 Euro= 99 cents
 */

public class EuroUsdConventer {
    public static void main(String[] args) {

    int inputEuros;
    int totalUsaCents;
    int usaDollars;
    int usaCents;
    final int PARITY = 99;
    Scanner in = new Scanner(System.in);

    System.out.println("Please insert Euros");

    inputEuros = in.nextInt();
    totalUsaCents = inputEuros * 99;
    usaDollars = totalUsaCents/100;
    usaCents = totalUsaCents %10;

        System.out.printf("%d euros = %d dollars, %d cents", inputEuros, usaDollars, usaCents);




    }
}