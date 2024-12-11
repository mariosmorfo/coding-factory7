package gr.aueb.cf.homework;

import java.util.Scanner;

public class Acces {
    public static void main(String[] args) {
        boolean isRegister = false;
        boolean hasCode = false;
        boolean hasActivePayment = false;
        boolean isWeekDay = false;
        boolean userAccess = false;

        Scanner in = new Scanner(System.in);

        System.out.println("Please insert if is register (true/false)");
        isRegister = in.nextBoolean();

        System.out.println("Please insert if has a code (true/false)");
        hasCode = in.nextBoolean();

        System.out.println("Please insert if has active payment (true/false)");
        hasActivePayment = in.nextBoolean();

        System.out.println("Please insert if is weekday (true/false)");
        isWeekDay = in.nextBoolean();

        userAccess = isRegister && isWeekDay && (hasCode || hasActivePayment);

        System.out.println("User Acces:" + userAccess);
    }
}
