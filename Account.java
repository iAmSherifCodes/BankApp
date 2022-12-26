package chapter2.BankApp;

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

    public void withdraw(double cash, int pin){
        if (passcode == pin){
            if (cash <= 0 ){
                System.out.println("Invalid withdrawal amount!");
            } else {
                if (cash > accountBalance){
                    System.out.println("Insufficient balance! ");
                } else {
                    accountBalance -= cash ;
                }
            }
        } else {
            System.out.println("Incorrect passcode!");
        }
    }


    public void setName(String name) {
        fullName = name ;
    }

    public void setPasscode(int passcode) {
        this.passcode = passcode;
    }

    public static void transfer(Account userAccount1, double amountToTransfer, Account userAccount2){

        if(userAccount1.getAccountBalance() > amountToTransfer){
            double user1Balance = userAccount1.getAccountBalance() - amountToTransfer;
            double user2Balance = userAccount2.getAccountBalance() + amountToTransfer;
            System.out.printf("%nAccount balance is: %.2f%nAccount1 balance is: %.2f %n", user1Balance, user2Balance);
        }
        else {
            System.out.println("Invalid transfer amount");
        }


    }

}
