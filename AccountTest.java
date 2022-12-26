package chapter2.BankApp;


public class AccountTest{
	public static void main(String[] args) {
		Account account = new Account("Sherif");
		Account account1 = new Account("Adeola");

		account.setName("Sherif Ola");
		account1.setName("Adeola Adeniyi");

		String accountName = account.getName();

		double accountBalance;
		System.out.printf("My account name is %s%n", accountName);

		account.deposit(500.00);
		System.out.printf("%s deposit %n", accountName);

		account1.deposit(500);

		accountBalance = account.getAccountBalance();
		double accountBalance1 = account1.getAccountBalance();


		System.out.printf("%s Account balance is %.3f%n", accountName, accountBalance);

		Account.transfer(account, 300, account1);


	}

}
