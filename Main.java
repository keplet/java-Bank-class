public class Main {
	public static void main(String[] args){
		//instantiating a new bank account
		BankAccount myAccount = new BankAccount("TD Bank","MI",80,"Keplet Saintil",4000,567,487875);
		//print the account details
		//System.out.println(myAccount);
		myAccount.checkDetails();
		//Calling the getBalance() method
		myAccount.getBalance();
		//Calling the deposit method
		myAccount.deposit(800);
		//Calling the withdraw method
		myAccount.withdraw(150);
		
	}

}
