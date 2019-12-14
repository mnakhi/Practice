package problemsandsolutions;

public class SmallestNumber {
	
	public static void main(String[] args) { //Driver method
		
		SmallestNumber sm= new SmallestNumber();
		System.out.println(sm.smallestNumber());
	}
	
	public int smallestNumber() {
		int number1=35;
		int number2=47;
		int number3=24;
		
		return Math.min(Math.min(number1, number2),number3);
	}

}
