package basic;

public class UseVariable {
	//Variable:
	//Data type nameOfVariable = Value;
	//Local Variable:When you declare a variable inside a method is called local variable
	//Global Variable: when you declare a variable outside a method but inside the class is called global variable
	//whenever you want to use a non static global variable and you want to call it in the main method,you need to create an object
	int number = 10; //global variable
	
	
	static int x; // if you don't initialize a global variable right away and then initial in the next line it will give you error
	//x=29;
	
	String stName = "Malika";
	static String contactNumbes ="434328443";//class variable//global static variable: when you put static keyword 
	
	
	int age = 21; //declare and initialize variable value
	int salary = 8000; 
	
	public void display() {
		int tvSize = 65;
	}
	
	public void newDisplay() {
		int tvSize = 65;
	}
	
	public static void main(String[] args) {    //cntl+space helps you to get the suggestion
		int num = 15; //local variable
		x =14;
		System.out.println();//sout cntl+space
	}
}
