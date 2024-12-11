package gr.aueb.cf.ch6;

public class ArrayMinMax2 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 88, 84};

        int maxPosition = getMaxPosition(arr);

        System.out.println("H Θέση του μεγαλύτερου στοιχείου είναι :" + maxPosition);
        System.out.println("H τιμή του μεγαλύτερου στοιχείου είναι :" + arr[maxPosition]);
    }

    public static int getMinPosition(int[] arr) {
        int minPosition = 0;
        int minValue = Integer.MAX_VALUE;

        if (arr == null || arr.length < 1) return -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }

    public static int getMaxPosition(int[] arr) {
        int maxPosition = 0;
        int maxValue = Integer.MIN_VALUE;

        if (arr == null || arr.length < 1) return -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }

    public static int getMinPosition(int[] arr, int low, int high) {
        int minPosition = low;
        int minValue =arr[low];

        if (arr == null || arr.length < 1) return -1;
        if (low > 0 || high > arr.length- 1) return -1;
        if (low > high) return -1;

        for (int i = low; i <=high; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
            return minPosition;
    }
}