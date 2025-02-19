package gr.aueb.cf.homework.model2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Product {

    private int id;
    private String title;
    private double price;
    private long quantity;

    public Product(){

    }

    public Product(int id, String title, double price, long quantity) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "id: " + getId() + " price: "+ getPrice() + " title: " + getTitle() + " quantity: " + getQuantity();
    }
}
