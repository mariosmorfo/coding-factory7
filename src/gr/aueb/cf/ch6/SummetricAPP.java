package gr.aueb.cf.ch6;

public class SummetricAPP {
    public static void main(String[] args) {

    }

    public static boolean isSymetric(int arr[]) {
        boolean isSymetric = true;

        for(int i = 0, j = arr.length -1; i < j; i++, j--) {
            if(arr[i] != arr[j]) {
                isSymetric = false;
                break;
            }
        }
        return isSymetric;
    }
}
