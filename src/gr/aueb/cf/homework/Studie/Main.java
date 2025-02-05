package gr.aueb.cf.homework.Studie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(List.of("Athens", "Paris", "London"));
        Iterator<String> it = cities.iterator();

//        while(it.hasNext()){
//            String s = it.next();
//            System.out.println(s);
//        }

        while(it.hasNext()){
            if(it.next().equals("London")){
                it.remove();
            }
        }

        cities.forEach(System.out::println);
    }


}
