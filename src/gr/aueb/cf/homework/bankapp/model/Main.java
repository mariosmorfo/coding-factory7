package gr.aueb.cf.homework.bankapp.model;


import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            OverdraftAccount account = new OverdraftAccount(2000.0, 200.0);

            JointAccount client = new JointAccount("Marios", "Bod",account);

           client.withdraw(100.0, "Marios");

           client.setOverdraftLimit(5000, "Marios");

        }catch (IOException e) {
            System.err.println("Error: "+ e.getMessage());
        }

    }
}
