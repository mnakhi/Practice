package basic;

public class UseCasting {

	//Casting:converting Data Type
	
	//you cannot convert primitive data type to non primitive, you cannot convert non primitive to primitive either
	
	double salary = 5000.500;
	int newSalary =(int)salary;
	
	public static void main(String[] args) {
		double salary = 5000.500;
		int newSalary =(int)salary;
		int number=(int)60.75;
		byte x=(byte) salary;
		
		System.out.println(newSalary);
		System.out.println(number);
		System.out.println(x);
	}
}
