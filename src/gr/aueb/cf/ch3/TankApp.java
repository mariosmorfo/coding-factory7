package gr.aueb.cf.ch3;

import java.util.Scanner;

public class TankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEmptyTank1 = false;
        boolean isEmptyTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("Please insert tank status (true/false");
        System.out.print("Tank status: ");
        isEmptyTank1 = scanner.nextBoolean();

        System.out.println("Please insert tank status (true/false)");
        System.out.print("Tank status: ");
        isEmptyTank2 = scanner.nextBoolean();

        isOrange = isEmptyTank1 ^ isEmptyTank2;
        isRed = isEmptyTank1 && isEmptyTank2;

        System.out.println("Orange: "+ isOrange + "," + "red: " + isRed);
    }

}
