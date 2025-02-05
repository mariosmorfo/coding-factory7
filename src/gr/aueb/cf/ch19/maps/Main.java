package gr.aueb.cf.ch19.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
//        ADD
        countries.put("GR", "Greece");
        countries.put("EN", "England");
        countries.put("US", "United States");

//        UPDATE

        countries.put("US", "U. States");

//        GET

        String value =  countries.get("GR");
        System.out.println(value);

//        ITERATE

        Iterator<Map.Entry<String, String>> it = countries.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            System.out.println("Key: " + entry.getKey() +  "," +"Value: "+ entry.getValue());


        }
        for(Map.Entry<String, String> entry : countries.entrySet()){
        System.out.println("Key: " + entry.getKey() +  "," +"Value: "+ entry.getValue());}

       countries.forEach((k, v) -> System.out.println("Key: " + k + "value" + v));

    }
}
