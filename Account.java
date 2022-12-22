
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


    public void setName(String name) {
	  fullName = name ;
    }

}
