package basic;

public class UseConcatenation {
	
	
	public static void main(String[] args) {
		String fName="James";
		String lName="William";
		
		System.out.println("My first name is "+fName);
		System.out.println("My last name is "+lName);
		System.out.println("My first name is "+fName + " "+ "Last name is "+lName);
		System.out.println(fName.concat(lName)); //here ".concat()" is a method for concatenation
		System.out.println(fName.concat(" ").concat(lName));
	}

}
