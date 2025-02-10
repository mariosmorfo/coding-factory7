package gr.aueb.cf.homework.Studie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainProduct {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(new Product("Apple", 3.5, 10), new Product("Oranges", 4.0, 20), new Product("Banana", 5.0, 11)));

//        Collections.sort(products);
//        products.forEach(System.out::println);

//        Collections.sort(products, Comparator.reverseOrder());
//        products.forEach(System.out::println);

        products.sort(Comparator.comparing(Product::getQuantity).thenComparing(Product::getName));
        products.forEach(System.out::println);
    }
}
