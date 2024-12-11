package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the price with vat
 */
public class PriceWithVat {
    public static void main(String[] args) {
        final double Vat_RATE = 0.24;
        double inputPrice = 0.0;
        double priceWithVat = 0.0;
        double vat = 0.0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert the price");
        inputPrice = in.nextDouble();
        vat = inputPrice * Vat_RATE;
        priceWithVat = inputPrice * Vat_RATE;

        System.out.printf("Price: %2f ,Vat: %2f" , inputPrice, priceWithVat, vat);
    }
}
