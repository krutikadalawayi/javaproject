package jsp;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	Bus bus= new BusImpl(1); //UPCASTING -->ABTRACTION
		while(true) {
			System.out.println("1:Booking Tickets\n2:cancelling Tickets");
			System.out.println("3:View Tickets\n4:EXIT");
			System.out.println("ENTER YOUR CHOICE!!................");//1 2 3 4
			
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the number of ticket to be booked ");
				int bookingTickets=scan.nextInt();
				bus.bookTicket(bookingTickets);
				System.out.println("total count "+bus.viewTicket());
				break;
			case 2:
				System.out.println("Enter the numberof tickets to be cancelled");
				int cancelTicket=scan.nextInt();
				bus.cancelTicket(cancelTicket);
				System.out.println("total count "+bus.viewTicket());
				break;
			case 3:
				System.out.println("available tickets are "+bus.viewTicket());
				break;
			case 4:
				System.out.println("THANK YOU!.....");
				System.exit(0);
			default:
				System.out.println(bus.displayErrorMessage());//END OF THE PROGRAM 
			}
			System.out.println("====---------------=====");//END OF THE WHILE LOOP
		}

	}
}
