package gr.aueb.cf.ch5;

public class EvenOddApp {
    public static void main(String[] args) {
        int num =10;
        System.out.println( num +"Num is even: " + isEven(num));
        System.out.println( num +"Num is ood: " + isOod(num));
    }

    public static boolean isEven (int num) {
       return num % 2 == 0;
    }

    public static boolean isOod (int num) {
        return  !isEven(num);
    }
}
