package gr.aueb.cf.ch13;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1, "GR849", "Wonderland", "Alice", "S123", 1000.0);
        try{
           account.deposit(900);
            System.out.println("The deposit was successful.");

            account.withDraw("R123", 400);

            account.withDraw("S123", 500);
            System.out.println("The deposit was successful");

            System.out.println("Balance: "+ account.getBalance());
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}