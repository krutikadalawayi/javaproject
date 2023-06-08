package jsp;

public class BankImpl implements Bank{
	private  int balance;

	public BankImpl(int balance) {

		this.balance = balance;
	}

	@Override
	public void Deposit(int amount) {
		System.out.println(" Depositing RS. "+amount);
		balance=balance+amount;
		System.out.println("amount deposited successfully");
	}

	@Override
	public void Withdraw(int amount) {
		if(amount<=balance) {

			System.out.println(" withdrawing Rs. "+amount);	
			balance=balance-amount;
			System.out.println("amount withdrawn is successfully");
		}else {
			try {
				throw new InsuffiecientBalanceExption("Insufficient Balance!..");
			}catch(Exception  e) {
				System.out.println(e.getMessage());
			}

			//Invoke an Exception and handle it using try and catch block
			//InsuffiecientBalanceExption
		}
	}
	@Override
	public int getBalance() {
		return balance;
	}

	@Override
	public String displayErrorMessage() {
		
		return "Invalid Choice,Kindly Enter Valid Choice!";
	}

}
