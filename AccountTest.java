
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


	accountBalance = account.getAccountBalance();
	double accountBalance1 = account1.getAccountBalance();



	System.out.printf("%s Account balance is %.3f%n",accountName, accountBalance);

	transfer(account, 200, account1);

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

//		System.out.printf("%n Account balance is: %.2f%n Account1 balance is: %.2f %n", userAccount1.getAccountBalance(), userAccount2.getAccountBalance());


	}




}