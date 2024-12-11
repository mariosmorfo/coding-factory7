package gr.aueb.cf.homework;


import java.util.Scanner;

    public class StringExample {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter a string");
            String input = scanner.nextLine();

            System.out.println("The strings has letter: "+ input.length());


            System.out.println("Please enter a string");
            String s = scanner.nextLine();

            for(int i = s.length()- 1; i >=0 ; i --) {
                System.out.print("The string inverted: "+ s.charAt(i));
            }

            System.out.println("");
        }

    }