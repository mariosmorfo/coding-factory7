package gr.aueb.cf.ch16.function;

public class AdditionCalculator implements ICalculator {
    @Override
    public int operator(int a, int b) {
    return a + b;
    }
}
