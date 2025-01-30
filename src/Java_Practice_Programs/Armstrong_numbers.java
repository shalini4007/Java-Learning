package java_Practice_Programs;

public class Armstrong_numbers {

	public static void main(String[] args) {
		int num=10;
		int rev=0;
		int a=0;
		int temp=num;
		while(num!=0) {
			rev=num%10;
			System.out.println(rev);
			num=num/10;
			 a=a+(rev*rev*rev);
			
		}
		
		System.out.println(a);
		if(a==temp)
		{
			System.out.println("It's Armstrong numbers");
		}
		else
		{
			System.out.println("It's not Armstrong numbers");
		}
				

	}

}
