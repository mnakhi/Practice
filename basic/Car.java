package basic;

public class Car {
	String carName = "Toyota";
	String carPrice = "5000";
	static String carModel = "Camry";//the benefit of static is that you do not need to create an object in the main method, you can call using class name
	
	public static void main(String[] args) {
		/*Object;
		 * className objectName= new ConstructorOfClass();
		 * */
		Car myCar = new Car();//object created
		
		myCar.carName = "BMW";//here dot means trying to make a relation, we are trying to access information 
		
		myCar.carPrice = "7665.97";
		
		Car.carModel = "2019 S"; //as carModel was class variable(static global variable) we do not need to call the myCar object
		
		Car jakiirCar = new Car();
		
		jakiirCar.carModel = "2018 S";
		
		System.out.println(Car.carModel);
		
		System.out.println(myCar.carModel);
		
		System.out.println(jakiirCar.carPrice);
		
		
		
	}

}
