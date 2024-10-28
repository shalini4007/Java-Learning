package Java_Concepts;

public class Day11_OOPS_Methods {

	
		// Methods- block or group of statements which will perform certain tasks.
		//we will have to call the method through object
		//1) No Parameters-->> No return value
		//2) No Parameters-->>  return value
		//3) Takes Parameters-->> No return value
		//4) Takes Parameters-->>  return value
	
	//Methods- 
	//1) Methods name can be anything
	//2) Methods may or may not return the value
	//3) If method not returning any value specify void
	//4) Methods can take parameters or arguments
	//5) we have to invoke methods explicitly through objects
	//6) Used for specifying logic
		
	//1) No Parameters-->> No return value
	
	void M1() {
		System.out.println("Hello....");
	}
	
	//2) No Parameters-->>  return value
	
	String M2() {
		return("Hello");
	}
	
	//3) Takes Parameters-->> No return value
	
	void M3(String name) {
		System.out.println("Hello " + name);
	}
	
	//4) Takes Parameters-->>  return value
	
	String M4(String Name) {
		return ("Hello " +Name);
		
	}
	
}
