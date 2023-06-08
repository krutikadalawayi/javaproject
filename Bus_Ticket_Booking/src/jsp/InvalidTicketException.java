package jsp;

public class InvalidTicketException extends RuntimeException{
private String message;

public InvalidTicketException(String message) {
	
	this.message = message;
}

public String getMessage() {
	return message;
}

}
