package gr.aueb.cf.homework;

public class PrintStars {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("*");
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 20; i++) {
            for (int j = i; j <= 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}