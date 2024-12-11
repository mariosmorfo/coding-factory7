package gr.aueb.cf.homework;

import java.util.Scanner;

public class HourPermission {
    public static void main(String[] args) {
        boolean isEmployee = false;
        boolean has_Permission = false;
        boolean hasNotPermission = false;
        boolean isExternal = false;
        int hour=0;

        Scanner in = new Scanner(System.in);

        System.out.println("Please insert if is employee (true/false)");
        isEmployee = in.nextBoolean();

        System.out.println("Please insert if is external (true/false)");
        isExternal = in.nextBoolean();

        System.out.println("Please insert the hour");
        hour = in.nextInt();

        has_Permission = isEmployee &&  hour>10;
        hasNotPermission = isExternal && hour<10;


        System.out.println("Has permission:" + has_Permission);
        System.out.println("Has not permission:" + hasNotPermission);
    }
}
