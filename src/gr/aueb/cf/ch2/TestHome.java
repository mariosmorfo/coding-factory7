package gr.aueb.cf.ch2;

public class TestHome {
    public static void main(String [] args){
     System.out.printf("integer size: %d, Min: %d, Max: %d\n",Integer.BYTES, Integer.MIN_VALUE, Integer.MAX_VALUE);
     System.out.printf("byte size: %d, Min: %d, Max: %d\n", Byte.BYTES, Byte.MIN_VALUE, Byte.MAX_VALUE);
     System.out.printf("short size: %d, Min: %d, Max: %d\n", Short.BYTES, Short.MIN_VALUE, Short.MAX_VALUE);
     System.out.printf("long size: %d, Min: %d, Max: %d\n", Long.BYTES, Long.MIN_VALUE, Long.MAX_VALUE);

    }
}
