package jsp;

public class InsuffiecientBalanceExption extends RuntimeException{

	private String massage;

	public InsuffiecientBalanceExption(String massage) {
		
		this.massage = massage;
	}
	
public String getMassage() {
		return massage;
	}

	

	
	
}
