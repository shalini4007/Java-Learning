package Java_Concepts;

public class Day4_Control_Statements_Conditional {

	public static void main(String[] args) {
		//Choose statements based on conditions in the pile of statements
		//set of statements to rum multiple times
		// three kinds of control statements
		//Types of control statements 
		//-->conditional statements --> looping statements--> jumping statements
		
		//conditional statements-->if --> if else--> nested if else-->>switch
		//if(condition){statements;}--> syntax
		
		//Person is eleigible for vote or not////
		int personAge=25;
		if(personAge>=18)
		{
			System.out.println("Person age is eligible for Voting");
		}
		
		//if (condition){statement1;} else{statement2;}--> syntax
		//Person is eligible for vote or not////
		if(personAge>=18)
		
			System.out.println("Person age is eligible for Voting");
			
		
		else
		
			System.out.println("Person age is not eligible for Voting");
		
		
		///Number is even or odd////
		int number=9;
		if(number%2==0)
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
		
		////// Number is positive/negative/zero/////
		
		int num=-1;
		
		if(num>0)
		{
			System.out.println("Number is positive");
		}
		else if(num<0) {
			System.out.println("Number is negative");
		}
		
		else
		{
			System.out.println("Number is Zero");
		}
		
		/////Largest of three numbers////
		int a=10, b=20, c=30;
		if(a>b && a>c)
		{
			System.out.println("a is largest number than b and c");
		}
		
		else if(b>c && b>a){
			System.out.println("b is  largest number than b and c");
		}
		
	else {
		System.out.println("c is largest nmber than b and c");
	} 
		
		if(1==2)
		{
			System.out.println(1);
		}
		else {
			System.out.println(2);
		}
		/////Nested If////
		if(false) {
			if(false) {
				System.out.println("abc");
			}
			else {
				System.out.println("xyz");
			}
		}
			else {
				System.out.println("123");
			}
		
		//////Week names based on week Number//////
		
		int weekno=10;
		
		if(weekno==1)
		{
			System.out.println("Sunday");
		}
		else if(weekno==2){
			System.out.println("Monday");
		}
		else if(weekno==3){
			System.out.println("Tuesday");
		}
		else if(weekno==4){
			System.out.println("Wednesday");
		}
		else if(weekno==5){
			System.out.println("Thursday");
		}
		else if(weekno==6){
			System.out.println("Friday");
		}
		else if(weekno==7){
			System.out.println("Saturday");
		}
		else {
			System.out.println("Invalid week number");
		}
		
		///////Switch-Number of lines get reduced///////
		
		int weekNum=2;
		switch(weekNum)
		{
		case 1: System.out.println("Sunday");// if break is not added the below statements are also executed 
		case 2: System.out.println("Monday");break;//once the condition is satisfied it breaks the block and come out of the block
		case 3: System.out.println("Tuesday");break;
		case 4: System.out.println("Wednesday");break;
		case 5: System.out.println("Thursday");break;
		case 6: System.out.println("Friday");break;
		case 7: System.out.println("saturday");break;
		default: System.out.println("Invalid Week Number");
		
		}
		}
	}


