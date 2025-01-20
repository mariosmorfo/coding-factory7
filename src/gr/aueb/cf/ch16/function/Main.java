package gr.aueb.cf.ch16.function;

public class Main {

    public static void main(String[] args) {


    ICalculator addition = new AdditionCalculator();

    int result = addition.operator(1,2);
        System.out.println(result);

}
}