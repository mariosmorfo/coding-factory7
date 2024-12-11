package gr.aueb.cf.ch5;

public class JOME {
    public static void main(String[] args) {
        int result = 1;
        for (int i = 1; i <= 5; i = i + 2) {
            result = result * i;
        }

        System.out.println(result);
    }
}
