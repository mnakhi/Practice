package basic;

public class UserNonReturnMethod {
	
	/** 
	 * Non Return Type Method
	 * It will not return anything
	 * void
	 * 
	 */
	static public void doDivision() {
		int number1 = 60;
		int number2 = 20;
		int div = number1/number2;
		System.out.println(div);
	}
	
	public void doDivisionNewly() {
		int number1 =20;
		int number2 = 6;
		int division = number1/number2;
		System.out.println(division);
	}
	
	
	public void doDivisionNewly(int num1,int num2) {
		int number1 = num1;
		int number2 = num2;
		int division = number1/number2;
		System.out.println(division);
	}
		
	
	public static void main(String[] args) {
		
		UserNonReturnMethod.doDivision();
		UserNonReturnMethod objDiv = new UserNonReturnMethod();
		objDiv.doDivisionNewly();
		objDiv.doDivisionNewly(500, 25);
	}
	

}
