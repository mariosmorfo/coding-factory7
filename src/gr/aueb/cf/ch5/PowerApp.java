package gr.aueb.cf.ch5;

public class PowerApp {
    public static void main(String[] args) {

    for (int b = 1, p = 1; b <= 10; b++, p++) {
        System.out.printf("%,d\n", pow (b, p));
    }
    }

    public static long pow (long a, long n) {
//        long reslut = 1;
//
//
//        for (int i =1; i<= n; i++) {
//            reslut *= a;
//        }
        return (long) Math.pow(a, n);
    }
}
