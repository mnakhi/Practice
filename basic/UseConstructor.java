package basic;

public class UseConstructor {
	
	
	//Constructor: we create constructor To initial the value of an object (why do we create constructor(interview question))
	//Constructor has no return type;
	//Constructor name have to be same as classes
	//Access modifier constructorName(){  }		
	
	String stName;
	String stID;
	String admissionDate;
	int admissionFee;
	
	
	public UseConstructor() {
		//default constructor
		System.out.println("This is default constructor");
	}
	
	
	//parameterized constructor
	public UseConstructor(String sName) {     //signature(it means indicating the data type)
		this.stName = sName;				 //here "this" keyword points to the String stName and we are assigning the st.name a variable of sName
		System.out.println(stName);
	}
	
	public UseConstructor(String sName, String sID) {     //signature(it means indicating the data type)
		this.stName = sName;			
		this.stID = sID;  	//this keyword basically indicates to the global variable
		System.out.println(stName + " " + stID);
	}
	
	public UseConstructor(String sName, String sID, String sAdmission) {     //signature(it means indicating the data type)
		this.stName = sName;			
		this.stID = sID;  	
		this.admissionDate = sAdmission;//this keyword basically indicates to the global variable
		System.out.println(stName + " " + stID + " "+admissionDate);
	}
	
	public UseConstructor(String sName, String sID, String sAdmission, int adFee) {     //signature(it means indicating the data type)
		this.stName = sName;			
		this.stID = sID;  	
		this.admissionDate = sAdmission;//this keyword basically indicates to the global variable
		this.admissionFee =adFee;
		System.out.println(stName + " " + stID + " "+admissionDate+ " "+adFee);
	}
	public void studentInfo() {
		System.out.println("This is Studenet Information Method");
	}
	
	
	
	public static void main(String[] args) {
		UseConstructor myObj= new UseConstructor();	
		UseConstructor myObj1 = new UseConstructor("PNT");
		UseConstructor myObj2 = new UseConstructor("PNT", "111");
		UseConstructor myObj3 = new UseConstructor("PNT", "222", "November 16th,2019");
		UseConstructor myObj4 = new UseConstructor("PNT1", "332", "July 5th,2019", 5000);
		
	}

}
