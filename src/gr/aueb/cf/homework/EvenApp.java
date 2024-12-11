package gr.aueb.cf.homework;

public class EvenApp {
    public static void main(String[] args) {
        int [] arr = {2, 5, 6, 7, 8, 10};

       int[] evens = getEvens(arr);
        System.out.println("Τα ζυγά στοιχεία είναι");

        for (int el : evens) {
            System.out.print( el + " ");
        }

        System.out.println();

        int[] mapped = mapToDouble(arr);
        System.out.println("Τα στοιχεία είναι");
        for(int el : mapped) {
            System.out.println(el + " ");
        }
    }

    public static int[] getEvens(int[] arr) {

        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count ++;
        }

        int[] evens = new int[count];
        int pivot = 0;

        for (int el : arr) {
            if (el % 2 == 0) {

                evens [pivot] = el;
                pivot ++;
            }

        }
        return evens;
        }

        public static int[] mapToDouble (int [] arr) {
            int[] mapped = new int[arr.length];

            for(int i = 0; i < arr.length; i ++) {
                mapped[i] = arr[i] * 2;
            }

            return mapped;
        }

    }

