package gr.aueb.cf.homework;

public class Search {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 9};
        final int SECRET = 7;
        boolean found = false;

        for (int el : arr) {
            if (el == SECRET) {
                found = true;
                break;
            }
        }
            if (found) {
                System.out.println("Secret Found");
            } else {
                System.out.println("Secret not found");
            }
        }
    }



