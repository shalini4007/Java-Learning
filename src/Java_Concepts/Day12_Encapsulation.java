package java_Concepts;

public class Day12_Encapsulation {

	//Wrapping up of data and methods in a single units(class)
	//All variables should be private
	//for every variables there should be 2 methods- GET and SET
	//Variables can only be accessed through methods
	
	private int AccNo;// In order to generate getters and setters methods we can rgt click-source-Generate getters and setters
	private String name;
	private double amount;
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	void setAccNo(int AccNo) {
		this.AccNo=AccNo;
		
	}
	
	int  getAccNo() {
		return AccNo;
		
	}
	
	void setname(String name) {
		this.name=name;
		
	}
	
	String  getname() {
		return name;
		
	}
}
