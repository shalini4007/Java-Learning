package java_Practice_Programs;

public class Largest_Smallest_Number_In_Array {

	public static void main(String[] args) {
		int a[]= {12, 15, 8, 9, 6};
		int largest=a[0];
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]>=largest)
			{
				largest=a[i];
			}
		
		}
 System.out.println("Print largest " + largest);
 int smallest=a[0];
	for(int i=0; i<=a.length-1; i++)
	{
		if(a[i]<=smallest)
		{
			smallest=a[i];
		}
	
	}
System.out.println("Print largest " + smallest);
	}

}
