package gr.aueb.cf.homework;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 8};
         int minPosition= getMinPosition(arr, 1, arr.length-2);

        System.out.print("Η θέση του μικρότερου στοιχείου είναι: " + minPosition);
    }
    public static int getMinPosition (int[] arr, int low, int high) {
        int minPosition = low;
        int minValue = arr[low];

        if (arr == null || arr.length == 0) return -1;
        if (low < 0 || high > arr.length) return -1;
        if (low > high) return -1;

        for (int i = low + 1; i <= high; i++) {
            if(arr[i] < minValue)  {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }

}
