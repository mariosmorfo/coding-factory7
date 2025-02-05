package gr.aueb.cf.ch19.streams;

import java.util.List;

public class ReduceMain {
    public static void main(String[] args) {


            List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

            List<Product> product = List.of(new Product("Apples", 10.5, 45),
                    new Product("Oranges", 8.5, 20),
                    new Product("Mango", 7.5, 30),
                    new Product("Watermelon", 4, 8),
                    new Product("Oranges", 8.5, 20));

            int totalSum = numbers.stream().reduce(0, (sum, n) -> sum + n);
            int totalSum2 = numbers.stream().reduce(0, Integer::sum);

            int sumOfQuantities = product.stream().map(Product::getQuantity).reduce(0, Integer::sum);

            int totalSum3 = numbers.parallelStream().reduce(0, Integer::sum, Integer::sum);

    }
}
