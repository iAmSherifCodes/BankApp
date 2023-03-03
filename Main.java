package BankApp;

import javax.swing.*;

public class Main {


    private static final Bank gtBank = new Bank("GtBank");

    public static void main(String[] args) {
        print("Welcome to " + gtBank.getBankName());
        mainMenu();

    }

    private static String input(String prompt) {
       return JOptionPane.showInputDialog(prompt);
//        Scanner scanner = new Scanner(System.in);
//        print(prompt);
//        return scanner.nextLine();
    }

    private static void withdraw() {
        int amount = Integer.parseInt(input("Enter amount to withdraw:"));
        int accNo = Integer.parseInt(input("Enter account number"));
        String pin = input("Enter account pin");
        if (amount > gtBank.checkBalanceFor(accNo, pin)) print("Insufficient balance");
        else
        {
            gtBank.withdraw(amount, accNo, pin);
            print("Withdrawal successful");
        }
        mainMenu();
    }

    private static void deposit() {
        int amount = Integer.parseInt(input("Enter deposit amount: "));
        int accNo = Integer.parseInt(input("Enter account number : "));
        if (amount < 1) {
            print("Invalid amount") ;
            mainMenu();
        }
        else {
            gtBank.deposit(amount,accNo);
            print("Deposit successful");
        }
        mainMenu();
    }

    private static void print(String message) {
        JOptionPane.showMessageDialog(null,message);
    }

    private static void checkBalance() {
        int accNo = Integer.parseInt(input("Enter account number: "));
        String pin = input("Enter account pin : ");
        int balance = gtBank.checkBalanceFor(accNo, pin);
        print("Your balance is " + balance);
        mainMenu();
    }

    private static void mainMenu() {
        String message = input("""
                1 --> Create account
                2 --> Deposit
                3 --> Withdraw
                4 --> Check balance
                5 --> Main menu
                6 --> Exit""");
        JOptionPane.showMessageDialog(null, message);
        try{
            switch (Integer.parseInt(message)) {
                case 1 -> createAccount();
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> checkBalance();
                case 5 -> mainMenu();
                case 6 -> exit();
                default -> {
                    print("Wrong Input");
                    mainMenu();
                }
            }
        }catch (NumberFormatException err){
            print("Letter values are invalid Inputs\n"+ " ".repeat(15) + "Try Again");
            exit();
        }

    }

    private static void exit() {
        print("Thank you for choosing " + gtBank.getBankName());
        System.exit(1);
    }

    private static void createAccount() {
        String accName = input("What is your name ?");
        String pin = input("Create a new pin");
        gtBank.createAccountFor(accName, pin);
        print("Your account has been created");
        mainMenu();
    }
}
