package gr.aueb.cf.ch19.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMain {
    public static void main(String[] args) {
        List<Product> product = List.of(new Product("Apples", 10.5, 45),
                new Product("Oranges", 8.5, 20),
                new Product("Mango", 7.5, 30),
                new Product("Watermelon", 4, 8),
                new Product("Oranges", 8.5, 20));

        ArrayList<String> listOfFruits = product.stream().map(Product::getName).collect(Collectors.toCollection(ArrayList::new));

        Double totalQuantities = product.stream()
                .filter(p -> p.getName().equals("Oranges"))
                .mapToDouble(Product::getPrice)
                .sum();
    }
}
