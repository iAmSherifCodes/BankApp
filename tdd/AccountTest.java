package tdd;

//import BankApp.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class AccountTest {

    @Test
    public void depositMoneyTest(){
        //given that Malik have an account
        Account malikAccount =  new Account();
        //when I want to deposit 2000
        malikAccount.deposit(2000);
        //check that the balance is 2000

    }

    @Test
    public void depositTwiceTest(){
        //given that Malik has an account
        Account malikAccount = new Account();

        //given that there is 300 in the account
        malikAccount.deposit(300);
        int balance = malikAccount.getBalance();
        assertEquals(300, balance);

        //when i try to deposit 200
        malikAccount.deposit(200);

        //check that his balance is 500
        balance = malikAccount.getBalance();
        assertEquals(500, balance);
    }


    @Test
    public void depositNegativeAmountCheck(){
        //given that Malik has an account with zero amount
        Account malikAccount = new Account();
        malikAccount.deposit(0);
        int balance = malikAccount.getBalance();
        assertEquals(0, balance);
        //when he try to deposit negative amount (-2300)
        malikAccount.deposit(-2300);

        //check that balance is zero
        balance = malikAccount.getBalance();
        assertEquals(0, balance);
    }

    @Test
    public void withdrawal(){
        //given that Malik has an account with 500 as balance
        Account malikAccount = new Account();
        malikAccount.deposit(500);
        int balance = malikAccount.getBalance();

        //when he withdrew 200
        malikAccount.withdraw(200);
        balance =malikAccount.getBalance();

        //check that the balance is 300
        assertEquals(300, balance);
    }

    @Test
    public void withdrawNegativeAmountCheck(){
        //given that malik has an account and has 1000 as balance
        Account malikAccount = new Account();
        malikAccount.deposit(1000);
        int balance = malikAccount.getBalance();
        //when he wants to withdraw a negative amount
        malikAccount.withdraw(-1000);
        balance = malikAccount.getBalance();
        // check that balance is still the same
        assertEquals(1000, balance);
    }

    @Test
    public void withdrawValidCheck(){
        //given malik has an account and he has 400 as balance
        Account malikAccount = new Account();
        malikAccount.deposit(400);
        int balance = malikAccount.getBalance();

        //when he tries to withdraw 500
        malikAccount.withdraw(500);
        balance = malikAccount.getBalance();


        //check that his balance is 400
        assertEquals(400, balance);

    }


}
