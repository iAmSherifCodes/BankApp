package BankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    private Bank gtBank;

    @BeforeEach
    public void startWithThis(){
        gtBank = new Bank("Guarantee Trust");
        gtBank.createAccountFor("Inem", "1234");

    }

    @Test
    public void createAccount(){
        assertEquals(1, gtBank.countNumberOfAccount());
    }

    @Test
    public void checkBalanceOfNewAccountIsZeroByDefaultTest(){
        assertEquals(0, gtBank.checkBalanceFor(1, "1234"));
    }

    @Test
    public void depositCheckBalanceTest(){
        gtBank.deposit(5000, 1);
        assertEquals(5000, gtBank.checkBalanceFor(1, "1234"));
    }

    @Test
    public void transferMoneyTest(){
        gtBank.createAccountFor("Inem", "receiverPin");
        gtBank.deposit(4500, 1);
        gtBank.transfer(2000, 1, 2, "1234");
        assertEquals(2500, gtBank.checkBalanceFor(1, "1234"));
        assertEquals(2000, gtBank.checkBalanceFor(2, "receiverPin"));
    }

    @Test
    void testingAccountNumberGenerator(){
        gtBank.createAccountFor("Sod", "1234");
        gtBank.createAccountFor("Sod", "1234");
        gtBank.createAccountFor("Sod", "1234");
        gtBank.createAccountFor("Sod", "1234");
        assertEquals(4, gtBank.generateAccountNumber());

    }







}