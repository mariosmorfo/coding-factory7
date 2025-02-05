package gr.aueb.cf.ch19.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products1 = List.of(new Product("Apple", 12.5, 10),
                new Product("Apple", 12.5, 10)); // immutable list

        List<Product> products2 = Arrays.asList(new Product("Apple", 12.5, 10),
                new Product("Apple", 12.5, 10)); // Partially immutable list

        List<Product> products = new ArrayList<>(List.of(new Product("Apple", 12.5, 10),new Product("Oranges", 12.5, 10),new Product("Eggs", 10.5, 20),new Product("Apple", 32.5, 17)));

        products.sort(Comparator.naturalOrder()); // Sort base on comparable
        products.sort(Comparator.reverseOrder()); // based on comparable

        products.sort(Comparator.comparing(Product::getName));
        products.sort(Comparator.comparing(Product::getName)
                .thenComparing(Product::getQuantity)
                .thenComparing(Product::getPrice).reversed());

        products.sort(Comparator.comparing(Product::getName)
                .thenComparing(Product::getQuantity,Comparator.reverseOrder()));

        products.forEach(System.out::println);
    }
}
