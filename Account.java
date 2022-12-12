package BankApp;

public class Account {

    private int passcode;
    private String fullName;
    private double accountBalance;



    public Account(String userName){
        fullName = userName ;
    }


    public String getName() {
        return fullName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double cash){
        if (cash <= 0){
            System.out.println("Invalid deposit amount! ");
        }
        else {
            accountBalance += cash ;
        }
    }

    public void withdraw(double cash){
        if (cash <= 0 ){
            System.out.println("Invalid withdrawal amount!");
        }

        if (cash > accountBalance){
            System.out.println("Insufficient balance! ");
        }
        else {
            accountBalance -= cash ;
        }
    }

    public void transfer(Account userAccount1, Account userAccount2, double amountToTransfer){
        double user1Balance = userAccount1.getAccountBalance() ;
        double user2Balance = userAccount1.getAccountBalance() ;

        user1Balance = user1Balance - amountToTransfer;
        user2Balance = user2Balance + amountToTransfer;
    }


}
