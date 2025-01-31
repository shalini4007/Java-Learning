package java_Practice_Programs;

public class Perfect_Numbers {

	public static void main(String[] args) {
		int num=6;
		int a=0;
		System.out.println("Given Number is " + num);
		for (int i=1; i<=num;i++)
		{
			if(num%i==0)
			{
		
				a=a+i;
				
			}
			
			
		}
		System.out.println(a);
		if(a==2*num)
		{
			System.out.println("It's a Perfect Number");
		}
		else
		{
			System.out.println("It's not a Perfect Number");
		}

	}

}
