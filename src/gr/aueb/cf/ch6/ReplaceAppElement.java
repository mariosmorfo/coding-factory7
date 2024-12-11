package gr.aueb.cf.ch6;

public class ReplaceAppElement {
    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6};
    int oldVal = 5;
    int newVal = 99;

    replace(arr, oldVal, newVal);

    for (int el : arr) {
        System.out.println(el +" ");
    }

    }

    public static void replace (int[] arr, int oldVal, int newVal) {
        int positionToUpdate = getPosition(arr, oldVal);

        if (positionToUpdate == -1) {
            return;
        }
        arr[positionToUpdate] = newVal;

    }
    public static int getPosition (int[] arr, int value) {
        int positionToReturn = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}

