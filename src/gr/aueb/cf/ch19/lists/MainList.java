package gr.aueb.cf.ch19.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        List<String> cities = new LinkedList<>();

        cities.add("Athens");
        cities.add("London");
        cities.add("NY");

        String city = cities.get(0);

        int nyPosition = cities.indexOf("NY");
        if(nyPosition != -1){
            cities.set(nyPosition, "New Work");
        }else {
            System.out.println("NY not exists");
        }

       if(cities.contains("Athens")){
           cities.remove("Athens");
       }else {
           System.out.println("Athens not exists");
       }
       cities.removeIf(c -> c.startsWith("A"));

       for(int i = 0; i < cities.size(); i++){
           System.out.println(cities.get(i));
       }

       for(String c : cities ){
           System.out.println(city);
       }

       Iterator<String> it = cities.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }

       cities.forEach(System.out::println);

        Iterator<String> iter = cities.iterator();



            }
        }


