package gr.aueb.cf.homework.Studie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>(List.of("London", "Athens", "Berlin" ));

        Iterator<String> it = cities.iterator();


        while(it.hasNext()){
            if(it.next().equals("Athens")){
                it.remove();
            }

        }
        cities.forEach(System.out::println);

    }


}
