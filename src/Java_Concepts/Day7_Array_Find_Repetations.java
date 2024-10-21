package Java_Concepts;

public class Day7_Array_Find_Repetations {

	
	
	public static void main (String args[]) 
	{
		int a[]= {100, 200, 100, 300, 100, 400, 100};
		int num=100;
		int count=0;
		
	/////For each loop///
		/*
		 * for(int value:a) { if(value==num) { count++;// whenever match happens the
		 * count value will increase by 1
		 * 
		 * } } System.out.println(count);
		 */
		
		/////Normal For loop///
		for(int i=0; i<=a.length-1; i++) {
		if( a[i]==num)	
		{
			count++;
		}
		}
		System.out.println(count);
	}
	
	
}
