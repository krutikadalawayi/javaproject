package jsp;

public interface Bank {
	void Deposit(int amount);
	void Withdraw(int amount);
	int getBalance();
	String displayErrorMessage();
}
// all the methods in interface are automatically public and abtract