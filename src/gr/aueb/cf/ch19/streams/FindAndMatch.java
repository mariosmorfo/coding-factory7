package gr.aueb.cf.ch19.streams;

import java.util.List;
import java.util.Optional;

public class FindAndMatch {
    public static void main(String[] args) throws Exception {
        List<String> names = List.of("Alice", "Bod", "Charlie", "David");

        Optional<String> query = names.stream().filter(name -> name.equals("Alice")).findFirst();

        if(query.isPresent()){
            System.out.println("First name:" + query.get());
        }

        query.ifPresent(first -> System.out.println("First name: " + first));

        String strFirst = names.stream().filter(name -> name.equals("Bob")).findFirst().orElse(null);

        String strFirst2 = names.stream().filter(name -> name.equals("Bob")).findFirst().orElseThrow(() -> new Exception("Alice not exists"));

        //Match

        boolean isBobExists = names.stream().anyMatch(name -> name.equals("Bob"));

        boolean noneIsBob = names.stream().noneMatch((name -> name.equals("Bob")));

    }
}
