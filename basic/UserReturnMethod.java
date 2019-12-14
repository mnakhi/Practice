package basic;

public class UserReturnMethod {
	
	
	
	//Non Parameterized Return Method	
	public int doSummation() { //this is less dynamic, because we assigned values for number1 and number2 inside doSummation
		
		//Method Body
		//Non Dynamic Method
		int number1 = 50;
		int number2 = 60;
		int sum = number1+number2;
		System.out.println(sum); // as we did the system.out.println(), we did not need to use System.out.println() in the main method
		return sum;				// the last line must be return if our method has a return type
	}
	
	
	
	//Parameterized Return Method
	public int doMultiply(int num1, int num2) { //this method is much more dynamic as we can change the parameters every time 
		
		int number1 = num1;
		int number2 = num2;
		int multiply = number1*number2;
		
		System.out.println(multiply);
		return multiply;

	}
	
	public static void main(String[] args) {
		
		UserReturnMethod objSum = new UserReturnMethod(); //constructor is also a type of a method
		objSum.doSummation();
		objSum.doMultiply(3, 9);
		
		
	}
	

}
