package gr.aueb.cf.homework.Studie;

import java.util.HashSet;
import java.util.Set;

public class BagOfCoins {
    public static void main(String[] args) {
        Set<String> bag = new HashSet<>();

        bag.add("Apple");
        bag.add("Oranges");
        bag.add("Watermelon");

        bag.remove("Oranges");

        bag.forEach(System.out::println);
    }
}
