package Java_Practice_Programs;

public class Print_Prime_Number {

	public static void main(String[] args) {
	int n=97;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			
		if(n%i==0)
		{
		count=count+1;
		
		}
		}
		if(count==2) {
			System.out.println("It is prime number");
		}
		else {
			System.out.println("Not a Prime number");
		}
	}

}
