package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int leftDigit = 0;
        int rightDigit = 0;
        int inputNum;
        int sum = 0;

        System.out.println("Εισάγετε έναν ακέραιο");
        inputNum = in.nextInt();

        leftDigit = inputNum / 10;
        rightDigit = inputNum % 10;
        sum = rightDigit + leftDigit;

        System.out.printf("Input num: %d, left digit: %d, right digit: %d, sum: %d", inputNum, leftDigit, rightDigit);

    }

}
