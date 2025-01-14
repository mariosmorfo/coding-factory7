package gr.aueb.cf.homework.bankapp.model;



public class OverdraftAccount {
    private double balance;
    private double overdraftLimit;

    public OverdraftAccount(){

    }

    public OverdraftAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

        public void withdraw(double amount) throws IllegalArgumentException{
            try{
                if(amount > balance + overdraftLimit ){
                    throw new IllegalArgumentException("The amount must not be bigger than the limit");
                }
                balance -= amount;
                System.out.println("Amount: " + amount + " successfully draw" + "the new balance is: " + balance);
            }catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
                throw e;
            }
        }

        public void OverdraftLimit(double limit) throws IllegalArgumentException {
            try{
                if(limit < 0){
                    throw new IllegalArgumentException("Overdraft limit must be a positive number");
                }
                this.overdraftLimit = limit;

                System.out.println("The limit now is: "+ overdraftLimit);
            }catch (IllegalArgumentException e){
                System.err.println(e.getMessage());
                throw e;
            }
        }

    }


