package jsp;

import java.util.Scanner;

public class Solution {
	static Scanner scan =new Scanner(System.in);
	static int a;//0
	static int b;//0
	static void acceptInput() {
		System.out.println("Enter 1st number");
		a=scan.nextInt();
		System.out.println("Enter 2nd number");
		b=scan.nextInt();
	}
	public static void main(String[] args) {
		Calculator  calc =new CalulatorImpl();
		while(true) {
			System.out.println("1:Addition\n2:Subtraction\n3:Multiplication\n4:Division\n5:EXIT");
			System.out.println("Enter a choice!...");
			int choice= scan.nextInt();//1 2 3 4 
			if(choice>=1 && choice<=4) {
				acceptInput();
			}

			switch(choice) {
			case 1:
				System.out.println(calc.add(a,b));
				break;
			case 2:
				System.out.println(calc.Sub(a,b));
				break;
			case 3:
				System.out.println(calc.Mul(a,b));
				break;
			case 4:
				System.out.println(calc.div(a,b));
				break;
			case 5:
				System.out.println("thank you!");
				System.exit(0); //terminates the program 
				//which is an indication to the jvm and the user

			default:
				System.out.println(calc.displayErrorMessage());

			}
			System.out.println("----------------------------------");
		}
	}
}
