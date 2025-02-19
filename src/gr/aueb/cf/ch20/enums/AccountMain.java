package gr.aueb.cf.ch20.enums;

public class AccountMain {
    public static void main(String[] args) {
//        AccountType accountType = AccountType.CURRENT;
//
////        enum to string
//
//        String srtAccountType = accountType.name();
//        System.out.println(srtAccountType);
//
////        string to enum
//
//        AccountType accountType1 = AccountType.valueOf(srtAccountType);

        for(AccountType value : AccountType.values()){
            System.out.print(value.name() + " "); // String

            System.out.println(value.ordinal());
        }
    }
}
