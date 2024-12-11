package gr.aueb.cf.ch2;


import java.math.BigInteger;

public class BigIntApp {

    public static void main(String[] args) {
       BigInteger bigNum1 = new BigInteger("2958295824390582495842905840");
       BigInteger bigNum2 = new BigInteger("89588485534884358435843584545");
       BigInteger result = bigNum1.add(bigNum2);

        System.out.printf("%,d", result);


    }

    }