package gr.aueb.cf.ch13;

import gr.aueb.cf.ch13.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch13.exceptions.NegativeAmountException;
import gr.aueb.cf.ch13.exceptions.SsnNotValidException;

/**
  *  Defines an {@link Account} class.
 */
public class Account {
    private int id;
    private String iban;
    private String lastname;
    private String firstname;
    private String ssn;
    private double balance;

    public Account(){

    }

    public Account(int id, String iban, String lastname, String firstname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.lastname = lastname;
        this.firstname = firstname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     *  Public API
     */

    /**
     * Deposits a certain amount of money
     * @param amount
     * @throws Exception
     */

    public void deposit(double amount) throws NegativeAmountException {
        try {
            if(amount < 0) {
//                throw new Exception("The amount must not be negative");
                throw new NegativeAmountException(amount);
            }
            balance += amount;
            System.out.println("Amount: "+ amount + " successfully deposited");
        }catch (NegativeAmountException e) {
            System.err.println("Error. Amount " + amount + "can not be negative");
            //e.printStackTrace(); // Only for development
            throw e;
        }

    }
    /**
     *  Withdraws an amount of money from {@link Account}
     *  based on a valid ssn checked by {@link Account#isSsnValid(String)}
     * @param amount  
     *          the amount to be withdrawn.
     * @param ssn
     *          the given ssn.
     * @throws Exception
     *          if the ssn is not valid or the balance is not sufficient or
     *          the amount is negative.
     */
    
        public void withDraw(String ssn, double amount) throws SsnNotValidException, InsufficientBalanceException, NegativeAmountException {
            try{
                if(!isSsnValid(ssn)) {
//                    throw new Exception("Ssn " + ssn + " is not valid");
                    throw new SsnNotValidException(ssn);
                }
                
                if(amount > balance) {
//                    throw new Exception (""Insufficient balance "+ balance + " for amount" + amount);
                    throw new InsufficientBalanceException(balance, amount);
                }
              
                if(amount < 0) {
//                    throw new Exception("The amount must not be negative");
                    throw new NegativeAmountException(amount);
                }
                balance =- amount;
                System.out.println("Amount: "+ amount + " successfully withdrawn");
            
            }catch (SsnNotValidException | InsufficientBalanceException | NegativeAmountException e) {
                System.err.print("Error.");
                //e.printStackTrace();
                throw e;
            }
        }

    /**
     *  Return the balance of {@link Account}
     */


    public double getAccountBalance() {
        System.out.println("The account balance was returned");  //logging
        return getBalance();
    }
    /**
     * Returns a string representation of the {@link Account} state.
     *
     */

    public String accountToString() {
        return "(" + id + "," + iban + "," + firstname + "," + lastname + "," + ssn + "," + balance + ")";
    }
    

    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }


}
