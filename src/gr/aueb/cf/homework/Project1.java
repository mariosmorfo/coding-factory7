package gr.aueb.cf.homework;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
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
            int startLimit;

            while(( num = in.nextInt()) != -1 && pivot <=48){
                pivot++;

                int[] numbers = Arrays.copyOfRange(inputNumbers, 0, pivot);
                Arrays.sort(numbers);

            }


        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
    public static boolean isEven(int[] arr) {
        long even = 0;

        for (int el : arr) {
            if (el %2 == 0);
            even ++;

        }
        return even >= 4;
    }
    public static boolean isOdd (int[] arr){
        long odd = 0;

        for (int el : arr){
            if (el % 2 !=0 );
            odd ++;
        }
        return odd >= 4;
    }
    public static boolean isConsecutive(int[] arr) {
        int cons = 0;
        for (int i = 0; i < arr.length -1; i++) {
            if((arr[i] == arr[i +1] + - 1)) {
                cons++;

            }

        }
        return cons > 2;
    }
    public static boolean isSameEnding(int[] arr) {
        int[] endings = new int[10];

        for(int el : arr) {
            endings[el % 10] ++;
        }
            for (int count : endings) {
                if(count >= 3) {
                    return true;
                }
            }
            return false;

    }
    public static boolean isTen(int[] arr) {
        int[] ten = new int[5];

        for (int el : arr) {
            ten[el / 10] ++;
        }
            for(int count : ten) {
                if (count >= 3) {
                    return true;
                }
            }

        return false;
    }
}
