package jsp;

public class BusImpl implements Bus{
	private int ticketpresent;


	public BusImpl(int ticketpresent) {

		this.ticketpresent = ticketpresent;
	}

	@Override
	public void bookTicket(int ticket) {
		System.out.println("Ticket booking "+ticket);	
		ticketpresent=ticketpresent+ticket;
		System.out.println("Booking Completed Succeessfully");
	}

	@Override
	public void cancelTicket(int ticket) {
		if(ticketpresent>0) {
			System.out.println("Ticked Cancelling "+ticket);
			ticketpresent=ticketpresent-ticket;
			System.out.println("ticket cancelled suucceesfully");


		}	else {
			try {
				throw new InvalidTicketException("Insufficient tickets!..");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public int viewTicket() {

		return ticketpresent;
	}

	@Override
	public String displayErrorMessage() {

		return "Invalid Choice,Please Enter valid choice";
	}

}
