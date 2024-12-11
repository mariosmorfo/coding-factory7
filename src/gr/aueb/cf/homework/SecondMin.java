package gr.aueb.cf.homework;

public class SecondMin {
    public static void main(String[] args) {
        int arr[] = {3, 6, 7, 8, 7, 11, 19};

        int secMin;
        int secMin2;

        secMin = getSecondMinPosition(arr);
        secMin2 = findSecondPosition(arr);

        if(secMin == -1) System.exit(1);
        if(secMin2 == -1) System.exit(1);

        System.out.printf("SecMinPos: %d, SecMinValue: %d\n", (secMin + 1), arr[secMin]);
        System.out.printf("SecMinPos: %d, SecMinValue: %d\n", (secMin + 1), arr[secMin2]);


    }

    public static int getSecondMinPosition(int[] arr) {
        int min = 0;
        int minValue = 0;
        int secondMin = 0;
        int secondMinValue = 0;

        if (arr == null) return -1;
        if (arr.length < 2) return -1;

        minValue = Integer.MAX_VALUE;
        secondMinValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] < minValue) && (arr[i] < secondMinValue)) {
                secondMin = min;
                secondMinValue = minValue;
                min = i;
                minValue = arr[i];

            }
            else if((arr[i] > minValue) && (arr[i] < secondMinValue)){
                secondMin = i;
                secondMinValue = arr[i];
            }
        }
        return secondMin;
    }

    public static int findSecondPosition(int[] arr) {
        int min = arr[0];
        int secondMin = Integer.MAX_VALUE;
        int minPosition = 0;

        for( int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                minPosition = i;
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if((arr[i] < secondMin) && (arr[i] != min)) {
                minPosition = i;
                secondMin = arr[minPosition];
            }
        }
        return minPosition;

    }
}

