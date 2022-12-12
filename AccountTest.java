package BankApp;
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.println("Welcome to Awofiranye Bank.");
//        System.out.print("Enter your name: ");
//        String userName = scan.nextLine();

        Account account1 =  new Account("Sherif");
        Account account2 = new Account("Ola");

        account1.deposit(5000);
//        account1.withdraw(3000);

        //to transfer from account1 to account2
        account1.transfer(account1, account2, 1000);

        System.out.println(account1.getAccountBalance());
        System.out.println(account2.getAccountBalance());

//        System.out.println(account1.getAccountBalance());





    }
}
