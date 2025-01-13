package gr.aueb.cf.ch12.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Order {
    private int id;
    private String uuid;
    private double amount;
    private String description;
    private String state;
    private LocalDateTime timeStamp;
    private String formattedTimestamp;

    public Order(){

    }

    public Order(int id,  double amount, String description, String state) {
        this.id = id;
        this.uuid = UUID.randomUUID().toString();
        this.amount = amount;
        this.description = description;
        this.state = state;
        this.timeStamp = LocalDateTime.now();
        this.formattedTimestamp = this.timeStamp.format(DateTimeFormatter.BASIC_ISO_DATE.ofPattern("dd-MM-yyyy"));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getFormattedTimestamp() {
        return formattedTimestamp;
    }

    public void setFormattedTimestamp(String formattedTimestamp) {
        this.formattedTimestamp = formattedTimestamp;
    }
}
