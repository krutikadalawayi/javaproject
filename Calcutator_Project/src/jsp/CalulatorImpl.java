package jsp;

public class CalulatorImpl implements Calculator{

	@Override
	public String add(int a, int b) {
		int sum=a+b;
		return "sum of "+a+" &"+b+ "is "+sum;
	}

	@Override
	public String Mul(int a, int b) {
		
		return "Multiplication  of "+a+ " &"+b+" is"+(a*b);
	}

	@Override
	public String Sub(int a, int b) {
	return "difference of "+a+" &"+b+" is"+(a-b);
	}

	@Override
	public String div(int a, int b) {
		if(b!=0) {
		return "division of "+a+ " &"+b+" is"+(a/b);
	}else {
		return "invalid denominator";
	}
	}
	@Override
	public String displayErrorMessage() {
	return "Invalid choice, please enter Valid Choice!!!";
	}

}
