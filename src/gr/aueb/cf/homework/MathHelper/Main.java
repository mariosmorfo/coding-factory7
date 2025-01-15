package gr.aueb.cf.homework.MathHelper;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25, 30};

        System.out.println("Max: "+ MathHelper.getMax(numbers));
        System.out.println("Min: "+ MathHelper.getMin(numbers));
        System.out.println("Sum: " + MathHelper.getAverage(numbers));
    }
}
