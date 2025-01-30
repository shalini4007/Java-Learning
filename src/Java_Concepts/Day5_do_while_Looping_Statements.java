package java_Concepts;

public class Day5_do_while_Looping_Statements {

	public static void main(String[] args) {
		//do{statements; increment/decrement;} while(condition)////
		// without checking condition -statements would be executed///
		
		////Example printing 1 to 10///
 int i=1;
 do {
	 System.out.println(i);
	 i++;
 }while(i<=10);
 

	////Example printing 10 to 1///
 
 int j=10;
 do {
	 System.out.println(j);
	 j--;
 }
 while(j>=1);
	}

}
