package gr.aueb.cf.ch6;

public class ArraySearch {
    public static void main(String[] args) {
    int[] arr = {1, 4, 5, 6, 8};
    int position;

    position = getPosition(arr, 6);
    if(position == -1) {
        System.out.println("Position not found");
    } else {
        System.out.printf("Value: %d  Position: %d" , arr[position], (position + 1));
    }


    }
    public static int getPosition(int[] arr, int value) {
    int positionToReturn = -1;

    for(int i = 0; i < arr.length; i++) {
        if (arr[i] == value) {
            positionToReturn = i;
            break;
        }
        }
        return positionToReturn;
    }
}
