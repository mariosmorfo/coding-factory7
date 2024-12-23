package gr.aueb.cf.ch11;

import gr.aueb.cf.ch11.model.*;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "MARIOS", "MORFO");
        User user = new User(1, "Kostas", "Ioannoy", "kost", "123", true);
        Customer customer = new Customer(1,"Andrew", "Dimitriou", "4590459059", "6945832951", "West Attica", "Attica", "Athens", "Patission", "76" ,"10434" );
        Point point = new Point(0, 10);
        Order order = new Order(1, 5.5,"Meat", "Ordered");


        System.out.println("Teacher full name: "+ teacher.getFirstname() + "," + teacher.getLastname());
        System.out.println("User username: "+user.getUsername());
        System.out.println("Customer Vat: "+ customer.getVatRegistrationNo());
        System.out.println("Order Timestamp: "+ order.getFormattedTimestamp());
        System.out.printf("Point: %d, %d\n", point.getX(), point.getY());
    }
}
