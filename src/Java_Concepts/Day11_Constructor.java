package java_Concepts;

public class Day11_Constructor {
	
	
	int sid;
	String sname;
	char grade;
	//1) Constructor name should be same as class name
	//2) It will not return any value not even void
	//3) no need to specify void
	//4) Constructor cane take parameters or arguements 
	//5) Automatically invoked during object creation
	//6) The purpose of a constructor is to construct an object and assign values to the object's members
	//7) using Constructor we can store data to the variables
	//8) Initializing the data into the variables no return value
	
	//Declaring constructor variables
	Day11_Constructor( int id, String name, char g){
		sid=id;
		sname=name;
		grade=g;
		
	}
	
	void setStudentData(int id, String name, char gr) {
		sid=id;
		sname=name;
		grade=gr;
	}
	
	void printStudentData() {
		System.out.println(sid +" " + sname + " " + grade);
	}
	

}
