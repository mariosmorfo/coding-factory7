package gr.aueb.cf.homework;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(new File("C:tmp/project1.txt"));
             PrintStream ps = new PrintStream("C:tmp/project1out.txt", StandardCharsets.UTF_8)) {

            final int NUMBER_SIZE = 6;
            int[] inputNumbers = new int [49];
            int[] result = new int[NUMBER_SIZE];

            int pivot = 0;
            int num;
            int window;

            while(( num = in.nextInt()) != -1 && pivot <=48  ){
                pivot++;

            }


        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
    public static boolean moreThanThreeEvens(int[] arr) {
        long even = 0;

        for (int el : arr) {
            if (el %2 == 0);
            even ++;

        }
        return even >= 4;
    }
    public static boolean moreThanThreeOdds (int[] arr){
        long odd = 0;

        for (int el : arr){
            if (el % 2 !=0 );
            odd ++;
        }
        return odd >= 4;
    }
}
