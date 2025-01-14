package gr.aueb.cf.homework.bankapp.model;

import java.io.IOException;

public class JointAccount {
    private String client1;
    private String client2;
    private OverdraftAccount overdraftAccount;

    public JointAccount(){


    }

    public JointAccount(String client1, String client2, OverdraftAccount overdraftAccount) {
        this.client1 = client1;
        this.client2 = client2;
        this.overdraftAccount = overdraftAccount;
    }

    public String getClient1() {
        return client1;
    }

    public void setClient1(String client1) {
        this.client1 = client1;
    }

    public String getClient2() {
        return client2;
    }

    public void setClient2(String client2) {
        this.client2 = client2;
    }

    public OverdraftAccount getOverdraftAccount() {
        return overdraftAccount;
    }

    public void setOverdraftAccount(OverdraftAccount overdraftAccount) {
        this.overdraftAccount = overdraftAccount;
    }

    public void withdraw(double amount, String clientName) throws IOException {

        try {
            if (!clientName.equals(client1) && clientName.equals(client2)) {
                throw new IOException("Unauthorized client " + clientName);
            }
            overdraftAccount.withdraw(amount);
            System.out.println(clientName + " successfully withdrew amount "+ amount);

        }catch (IOException e){
            System.err.println(e.getMessage());
            throw e;
        }
    }

    public void setOverdraftLimit(double limit, String clientName) throws IOException{
        try {
            if(!clientName.equals(client1)){
                throw new IOException(clientName + "not authorized to set the overdraft limit");
            }
            overdraftAccount.setOverdraftLimit(limit);

            System.out.println("The limit now is: "+ limit);
        }catch (IOException e){
            System.err.println(e.getMessage());
            throw e;
        }
    }

}

