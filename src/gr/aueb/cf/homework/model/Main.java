package gr.aueb.cf.homework.model;

public class Main {
    public static void main(String[] args) {
        User one = new User(5554, "Marios", "Lastname");

        System.out.println("Id: "+ one.getId());
        System.out.println("Firstname: "+ one.getFirstname());
        System.out.println("Lastname: "+ one.getLastname());

        System.out.println();

        UserCredentials credentials = new UserCredentials(1, "Marios.m", "password 123");

        System.out.println("Id: "+ credentials.getId());
        System.out.println("Firstname: "+ credentials.getFirstname());
        System.out.println("Lastname: "+ credentials.getLastname());
    }
}
