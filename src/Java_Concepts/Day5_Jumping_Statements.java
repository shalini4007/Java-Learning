package Java_Concepts;

public class Day5_Jumping_Statements {

	public static void main(String[] args) {
		// break and continue
		
		///////// break-////////
		for(int i=1; i<=10; i++) {
			if(i==5) {
				break;// when i==5 condition satisfied/true so that it will jump/exit from for loop so 5 and next numbers are not printed
				//output- 1234
				//System.out.println(j);//Invalid statements since after break there should not be any statements
			}
			
				System.out.println(i);
			}
	
		for(int j=1; j<=10; j++) {
			if(j==5) {
				continue;//when j==5 condition is satisfied true, it goes back to for loop increase the j value and execute rest of the values
			///output- 1234678910
			}
			 
				System.out.println(j);
			}
		
		for(int k=1; k<=10; k++) {
			if(k==5 || k==8 || k==3) {
				continue;
			}
			 
				System.out.println(k);//skips 5, 8 and 3
			}
			
		}
	}

	///Assignments

//1) Reverse a number(use % / = operators) input 1234 and output should be 4321
//2) Palindrome 
//3) Count number if digits in a number
//4) Count Number of even and ood digits in a number
//5) find sum of digits in a number
//6) Largest of 2 numbers 7) smallest of 3 numbers 8) by week name to find week number
//9) swapping of two number- by operators 


