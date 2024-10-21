package Java_Concepts;

public class Day5_for_Looping_Statements {

	public static void main(String[] args) {
		// In while and do while loop - we will need to write three steps that is initialization, condition and increment/decrement/
		//Reduce number of lines or code///
		//syntax for(initialization; condition; increment/decrement){statements;}
		//In while and do while decrement/increment is part of loop body but in for loop it's in declaration instead of body
		//If number of iterations are aware in advance- we will go with for loop
		//if you want to execute the statement atleast once even if the condition is not satisfied- do while loop is suitable
		//if not aware of the number of iterations and loop termination is based on conditions- while loop is suitable
		//Traveling by Bike--> source, destination and fuel- prefer for loop
		//Traveling by bus--> do while -- without any conditions
		//Traveling by flight--> while-- Satisfy the condition first(buying ticket-- condition and later fly-statements execution)
		
		
		// example1 print 1 to 10///
		
		int i;
		for(i=0; i<=10;i++)
		{
			System.out.println(i);
		}
	
/// example2 print even numbers between 1 to 10////
		
		for(int j=2;j<=10;j+=2) {
			System.out.println(j);
			
		}
		
		////Example3 print every number from 1 to 10 along with even and odd///
		int k;
		for(k=1;k<=10;k++) {
			if (k%2==0) {
				System.out.println(k + "Even");
		}
			else {
				System.out.println(k + "Odd");
			}
		}
		
		//example4 10 to 1 in descending order////
		for(int m=10; m>=1;m--)
		{
			System.out.println(m);
		}
		
		
	}

}
