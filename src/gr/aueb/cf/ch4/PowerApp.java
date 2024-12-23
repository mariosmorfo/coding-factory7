package gr.aueb.cf.ch4;

import org.w3c.dom.ls.LSOutput;

import java.math.BigInteger;

public class PowerApp {
    public static void main(String[] args) {
        BigInteger bigResult = new BigInteger("1");
        int base = 2;
        int power = 100;
        int result = 1;

        for ( int i = 1; i <= power; i++) {
            result *= base;
            bigResult = bigResult.multiply(BigInteger.valueOf(base));
        }
        System.out.println("Result :" + result);
        System.out.println("Result: " + bigResult);
    }
}

