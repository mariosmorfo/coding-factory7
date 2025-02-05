package gr.aueb.cf.ch19.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterMain {
    public static void main(String[] args) {
        List<String> cities = List.of("Athens" , "London", "Toronto", "Tunis", "Athens");


        var tCities = cities.stream().filter(city -> city.startsWith("T")).collect(Collectors.toList()); // mutable list

        var tCities2 = cities.stream().filter(city -> city.length() > 6) .toList(); // immutable list

        tCities.forEach(System.out::println);

        Set<String> uniqueNames = cities.stream().collect(Collectors.toSet());
        uniqueNames.forEach(System.out::println);

        String strCities = cities.stream().collect(Collectors.joining(", "));

//        String strCities = String.join(" ," + cities);
    }
}
