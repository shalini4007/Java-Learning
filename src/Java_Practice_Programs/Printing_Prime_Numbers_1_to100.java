package java_Practice_Programs;

public class Printing_Prime_Numbers_1_to100
{
	
	public static void main(String args[] )
	{
		
	for(int i=1; i<=100; i++)
	{
		int count=0;
		for(int j=1; j<=i; j++)
		{
			if(i%j==0)
			{
				count++;
			}
		}
		if(count==2)
		{
		System.out.println("It's a prime number " + i);
	}
	}	
	}
	}
