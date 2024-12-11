package gr.aueb.cf.ch7;
/*
* compare two strings for lessthan, greater than, equal
 */
public class StrCompareTwoApp {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "ATHENS";

        if (s1.compareTo(s2) > 0) {
            System.out.println("s1 > s2");
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("s1 < s2");
        } else // if (s1.compares(s2) == 0

            System.out.println("s1.equals(s2) == true");


        if (s1.compareToIgnoreCase(s2) > 0) {
            System.out.println("s1 > s2");
        } else if (s1.compareToIgnoreCase(s2) < 0) {
            System.out.println("s1 < s2");
        } else // if (s1.compares.ToIgnoreCase(s2) == 0

            System.out.println("s1.equals(s2) == true");
    }
}