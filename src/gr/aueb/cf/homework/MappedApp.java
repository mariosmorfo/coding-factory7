package gr.aueb.cf.homework;


public class MappedApp {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 7, 10};

        int [] doubleArray = matToDouble(arr);

        boolean isEven = isEven(arr);

        System.out.print("Αρχικός πίνακας: ");
        printArray(arr);

        System.out.println();

        System.out.print ("Πίνακας με τα διπλάσια στοιχεία: ");
        printArray(doubleArray);

        System.out.println();

       if(isEven) {
           System.out.println("Ο πίνακας περιέχει έναν τουλάχιστον ζυγό αριθμό");
       } else {
           System.out.println("Ο πίνακας δεν περιέχει ζυγό αριθμό");
       }
    }

    public static int[] matToDouble(int[] arr) {
        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int el : arr) {
                mapped[i] = arr[i] * 2;
            }
        }
        return mapped;
    }
        public static void printArray(int[] array) {

        for( int el : array) {
            System.out.print( el   + " ");
        }
        }

        public static boolean isEven(int[] arr) {
        boolean isEven = false;

        for( int el : arr) {
            if( el % 2 == 0) {
                isEven = true;
                break;
            }
        }
        return isEven;
    }
}
