package Java_Practice_Programs;

public class Print_Factors_Number {

	public static void main(String[] args) {
	int n=10;
		int i;
		for(i=1;i<=n;i++)
		{
		if(n%i==0)
		{
			System.out.println(i);
		}
		}
	}
}
