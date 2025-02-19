package gr.aueb.cf.homework.model2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    private static final List<Product> products = List.of(
            new Product(1, "Oranges", 10, 4),
            new Product(2, "Apple", 7.0, 5),
            new Product(3, "Banana", 12.5,10),
            new Product(4, "Watermelon", 4,10));

    public static void main(String[] args) {


            List<Product> products1 = getFilteredProduct(products, product -> product.getPrice() < 5);
            products1.forEach(System.out::println);
    }

    public static List<Product> getFilteredProduct(List<Product> products, Predicate<Product> filter){
        List<Product> productToReturn = new ArrayList<>();
        for(Product product : products){
            if(filter.test(product)){
                productToReturn.add(product);
            }
        }

        return productToReturn;

    }
}
