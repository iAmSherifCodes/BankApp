
public class AccountTest{
	public static void main(String[] args){
	Account account = new Account("Sherif");
	Account account1 =  new Account("Adeola");

	account.setName("Sherif Ola");
	account1.setName("Adeola Adeniyi");

	String accountName = account.getName();

	double accountBalance;
	System.out.printf("My account name is %s%n", accountName);

	account.deposit(500.00);
	System.out.printf("%s deposit %n", accountName);

	account1.deposit(500);
//	account.withdraw(1000.00);
//	System.out.printf("%s withdrew %n", accountName);

	accountBalance = account.getAccountBalance();
	double accountBalance1 = account1.getAccountBalance();



	System.out.printf("%s Account balance is %.3f%n",accountName, accountBalance);

	transfer(account, 700, account1);

//	System.out.println(sum(accountBalance,accountBalance1));

//	System.out.println(account.getAccountBalance());
//	System.out.println(account1.getAccountBalance());
}
	public static void transfer(Account userAccount1, double amountToTransfer, Account userAccount2){
//		double user1Balance = userAccount1.getAccountBalance() ;
//		double user2Balance = userAccount2.getAccountBalance() ;

		if(userAccount1.getAccountBalance() > amountToTransfer){
			double user1Balance = userAccount1.getAccountBalance() - amountToTransfer;
			double user2Balance = userAccount2.getAccountBalance() + amountToTransfer;
			System.out.printf("%nAccount balance is: %.2f%nAccount1 balance is: %.2f %n", user1Balance, user2Balance);
		}
		else {
			System.out.println("Invalid transfer amount");
		}

//		System.out.printf("%n Account balance is: %.2f%n Account1 balance is: %.2f %n", userAccount1.getAccountBalance(), userAccount2.getAccountBalance());


	}

	public static double sum(double a, double b){
		double result = a + b;
//		System.out.println(result);
		return result;
	}


}