package gr.aueb.cf.ch16.function;

public class Main {

    public static void main(String[] args) {


        ICalculator addition = new AdditionCalculator();

        int result = addition.operator(2, 10);
        System.out.println(result);


    ICalculator mul = (a , b) -> a * b;
        int result2 = mul.operator(2, 100);
        System.out.println(result2);

        ICalculator sub = (a , b) -> a - b;
        int result3 = sub.operator(2, 500);
        System.out.println(result3);

}
}