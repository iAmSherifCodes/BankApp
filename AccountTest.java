package BankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account account;

    @BeforeEach
    public void setUp(){
        account = new Account(1, "Inem", "1234");
    }


    @Test
    public void depositTest(){
        account.deposit(1500);
        assertEquals(1500, account.checkBalance("1234"));
    }


    @Test public void checkBalanceWithWrongPinReturnsZero(){
        account.deposit(1500);
        assertEquals(0, account.checkBalance("1254"));
    }

    @Test
    public void withDrawMoneyTest(){
        account.deposit(8000);
        account.withdraw(4000, "1234");
        assertEquals(4000, account.checkBalance("1234"));
    }

    @Test
    public void withdrawWithWrongPinDoesNotWork(){
        account.deposit(8000);
        account.withdraw(4000, "1254");
        assertEquals(8000, account.checkBalance("1234"));

    }

    @Test
    void depositWithWrongAmountDoesNothing(){
        account.deposit(-233);
        assertEquals(0 , account.checkBalance("1234"));
    }

    @Test
    void withdrawAmountGreaterThanAmountDoesNothing(){
        account.deposit(1000);
        account.withdraw(1500, "1234");
        assertEquals(1000, account.checkBalance("1234"));
    }


}