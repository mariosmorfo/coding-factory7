package gr.aueb.cf.ch6;

public class ArrayMinAndMax {
    public static void main(String[] args) {
        int [] arr = {1, 4, 5, 6, 20};

        int maxPosition = getMaxPosition(arr);

        System.out.println("Η θέση του μέγιστου αριθμού ειναι: " + maxPosition);
        System.out.println("Η τιμή του μέγιστου αριθμού ειναι: " + arr[maxPosition]);

        int minPosition = getMinPosition(arr);

        System.out.println("Η θέση του ελάχιστου αριθμού ειναι: " + minPosition);
        System.out.println("Η τιμή του ελάχιστου αριθμού ειναι: " + arr[minPosition]);
    }
    public static int getMinPosition (int[] arr) {
        if (arr == null || arr.length < 1 ) return -1;
        int minPosition = 0;
        int minValue = arr[minPosition];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;

    }

    public static int getMaxPosition (int[] arr) {

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        if(arr == null || arr.length < 1) return -1;

        for( int i = 1; i < arr.length; i++) {
            if(arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];

            }
        }
        return maxPosition;
    }
}