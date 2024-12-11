package gr.aueb.cf.ch5;

import java.util.Scanner;

public class RightTriangleApp {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter b, c, a");

        b = in.nextDouble();
        c = in.nextDouble();
        a = in.nextDouble();

        if (Math.abs( a*a - b*b - c*c) <= EPSILON) {
            System.out.println("Triangle is right");
        }else{
            System.out.println("Triangle is not right");

        }
    }
}

