package gr.aueb.cf.ch6;
/*
*Δηλωση και αρχικοποιηση ενος πινακα
*populate ενα πινακα
* -new
* unsized init
* array initializer
* print τα στοιχεια ενος πινακα
 */

public class ArrayInit {
    public static void main(String[] args) {
        int[] arr = new int[3]; // declare and init
        int [] arr2 = {1, 2, 3, 4, 5}; // unsized init
        int [] arr3;
        arr3 = new int[] {1, 2, 3, 4, 5}; // array initializer

        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        for ( int i = 0; i < arr.length; i++){
            System.out.print(arr[i ] +" ");
        }
        for ( int el : arr3) {
            System.out.println( el + ""); // to el einai paradeigma
        }
    }
}
