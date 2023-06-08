package jsp;

import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Bank bank=new BankImpl(5000);// UPCASTING-->ABTRACTION

		while(true) {
			//		Bank bank=new BankImpl(5000);// UPCASTING-->ABTRACTION
			System.out.println("1:Deposit Amount\n2:withdraw Amount");
			System.out.println("3:Check Balance\n4:EXIT");
			System.out.println("ENTER YOUR CHOICE!..........");
			int choice =scan.nextInt();//1 2 3 4
			switch(choice) {
			case 1:
				System.out.println("Enter the amount to be Deposited: ");
				int amountToDeposite=scan.nextInt();
				bank.Deposit(amountToDeposite);//bank.deposit(scan.nextInt());
				System.out.println("Total Amount "+bank.getBalance());
				break;
			case 2:
				System.out.println("Enter the amount to be withdrawn: ");
				int amountToWithdraw=scan.nextInt();
				bank.Withdraw(amountToWithdraw);;//bank.withdraw(scan.nextInt());
				System.out.println(" Total Amount is "+bank.getBalance());
				break;
			case 3:
				System.out.println("the  Available Balance  is "+bank.getBalance());
				break;
			case 4:
				System.out.println("Thank You!...");
				System.exit(0);
			default:
				System.out.println(bank.displayErrorMessage());
				//END OF THE SWITCH STATEMENT
			}
			System.out.println("------------");
		}//END OF THE WHILE LOOP
	}
}
