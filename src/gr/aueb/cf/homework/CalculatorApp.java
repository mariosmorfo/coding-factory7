package gr.aueb.cf.homework;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please enter the first number");
            int num1 = getNumber(scanner);

            System.out.println("Please enter the second number");
            int num2 = getNumber(scanner);

            System.out.println("Please insert the operation: +, -, *, or /");
            char operation = getOperation(scanner);

            int result = calculate (num1, num2, operation);
            System.out.println("The result: "+ result);


        } catch (ArithmeticException e) {
            System.out.println("Math error" + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid error" + e.getMessage());
        }
    }

    public static int getNumber(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine());
    }

    public static char getOperation(Scanner scanner) throws IllegalArgumentException {

        String input = scanner.nextLine();

        if (input.length() != 1 || "+-*/".indexOf(input.charAt(0)) == -1)
        {
            throw new IllegalArgumentException();

        }
        return input.charAt(0);
    }

    public static int calculate(int num1, int num2, char operation)throws IllegalArgumentException{
        switch (operation) {
            case '+' :
                return num1 + num2;

            case '-' :
                return num1 - num2;

            case'/':
                if (num2 == 0) {
                    throw new IllegalArgumentException("Division by zero is not allowed");
                }
                    return num1 / num2;

            case'*' :
                return num1 * num2;


           default:
                throw new IllegalArgumentException("Invalid Operation");
        }
    }
}