package BankApp;

public class Account {
    private int balance;
    private String pin;
    private int accountNumber;
    private String accountName;

    public Account(int accountNumber, String accountName, String pin) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.pin = pin;

    }

    public void deposit(int amount) {
        if (amountGreaterThanZero(amount)) balance += amount;
    }


    public int checkBalance(String pin) {
        if (pinIsCorrect(pin)) return balance;
        return 0;
    }

    private boolean pinIsCorrect(String pin) {
        return  this.pin.equals(pin);
    }

    public void withdraw(int amount, String pin) {
        boolean amountIsValid = amountGreaterThanZero(amount) && withdrawalAmountIsValid(amount) ;
        if (pinIsCorrect(pin)){
            if (amountIsValid) balance -= amount;
        }
    }

    private boolean amountGreaterThanZero(int amount){
        return amount > 0 ;
    }
    private boolean withdrawalAmountIsValid(int amount){
        return this.balance > amount;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

}
