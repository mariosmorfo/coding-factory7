package gr.aueb.cf.ch5;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
         int num = 0;
         int abs = 0;

        System.out.println("Please enter a num");
        num = in.nextInt();

//        if ( num >= 0) abs = num;
//        else abs = - num;

        abs = ( num >= 0) ? num : - num;
    }

}
