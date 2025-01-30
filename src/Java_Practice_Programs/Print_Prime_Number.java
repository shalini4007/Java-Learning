package java_Practice_Programs;

public class Print_Prime_Number
{
	
	public static void main(String args[] )
	{
		int num=12;
		int count=0;
		for (int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("It's a prime number");
		}
		else
		{
			System.out.println("It's not a prime number");
		}
		
	}
}