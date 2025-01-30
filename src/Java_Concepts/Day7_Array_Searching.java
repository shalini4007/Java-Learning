package java_Concepts;

public class Day7_Array_Searching {

	//////Example1- Search an element in a array- Linear Search////
	
	public static void main (String args[]) 
	{
		int a[]= {10, 20, 30, 40, 50, 30,30};// If Duplicates elements exists- Only one statement executes since the number is already found
		int search_element=30;
		
		boolean status =false;// False means not found-- true means found used since if element is found both the statements "Element Found" and "Element not found"
		
		////Normal for loop
		for(int i=0; i<a.length; i++)// If we use i<a.length if i<=a.length-1
		{
			//System.out.println(a[i]);
			if(a[i]==search_element) {
				System.out.println("Element Found");
				status=true;
				break;// Using break since once element is found rest of the number is not required to compare
			}
			
		}
		if(status==false) {
			System.out.println("Element Not Found"); 
		
		}
		/// For Each Loop
		for(int x:a)
		{
			//System.out.println(a[i]);
			if(x==search_element) {
				System.out.println("Element Found");
				status=true;
				break;// Using break since once element is found rest of the number is not required to compare
			}
			
		}
		if(status==false) {
			System.out.println("Element Not Found"); 
		
		}
		
		
	}
	
	
}
