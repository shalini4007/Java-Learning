package Java_Concepts;

public class Day3_Operators {

	public static void main(String[] args) {
		// Operators -which performs certain operations
		
		int a=30, b=20;//a and b are operands
		int result=a+b;// = and + are operators
		System.out.println(result);
		
		//Airthmatic Operators +-*/%
		System.out.println("Sum of a and b is:" + (a+b));
		System.out.println("Diff of a and b is:" + (a-b));
		System.out.println("Multiplication of a and b is:" + (a*b));
		System.out.println("Division of a and b is:" + (a/b));//quotient value
		System.out.println("Modulo division of a and b is:" + (a%b));//reminder value

		//Relational/comparison Operators <>=<<=!= == returns boolean values
		System.out.println(a>b);//true
		System.out.println(a<b);//false
		System.out.println(a>=b);//true
		System.out.println(a<=b);//false
		b=40;
		System.out.println(a>=b);//false
		System.out.println(a<=b);//true
		
		System.out.println(a!=b);//true
		System.out.println(a==b);//false
		
		boolean res=a>b;
		System.out.println(res);
		
		//Logical Operators &&  ||  !
		//always returns boolean values and works between boolean values
		boolean x=true,y=false;
		System.out.println(x && y);//false
		System.out.println(x || y);//true
		System.out.println(!x);//false
		System.out.println(!y);//true
		
		boolean b1=10>20;
		System.out.println(b1);//false
		 boolean b2=20>10;//true
		 System.out.println(b2);
		 
		 System.out.println(b1 && b2 ); //b1=false and b2=true result=false
		 System.out.println(b1 || b2 ); //b1=false and b2=true result=true
		 
		 System.out.println((10<20) && (20>20));//true && true result=true
		 
		//Increment and decrement Operators ++ --
		 int c=10;
		 System.out.println(c);
		  c++;//c=c+1;
		  System.out.println(c);
		  
		 int d=20;
		 int res1=d++;//post increment- first assignment and later increment
		 System.out.println(res1);//20
		 System.out.println(d);//21
		 
		 int e=10;
		 int res3=++e;//pre increment- incremented and later assignment
		 System.out.println(res3);//11
		 System.out.println(e);//11
		  
		 int f=10;
		 f--;//f=f-1--->10-1=9
		 System.out.println(f);//9
		 
		 int g=100;
		 int res4=g--;//post decrement- assignment and later decrement
		 System.out.println(res4);//100
		 System.out.println(g);//99
		 
		 int i=100;
		 int res5=--i;//pre increment- decrement and later assignment
		 System.out.println(res5);//99
		 System.out.println(i);//99
		 
		//Assignment Operators= += -= *= /= %=
		 
		 int t=10;
		 t+=5;//t=t+5=15
		 System.out.println(t);
		 
		 t-=5;//t=t-5--->15-5=10
		 System.out.println(t);
		 
		 int s=10;
		 s*=2;//s=s*2--->10*2=20
		 System.out.println(s);//20
		 
		 int s1=10;
		 s1/=2;//s1=s1/2--->10/2=5
		 System.out.println(s1);//5
		 
		 
		 int s2=10;
		 s2%=2;//s2=s2%2--->10%2=0
		 System.out.println(s2);//0
		 
		 //difference between = is assignment operator and == to compare logical operator
		 
		//conditional/ternary Operators ?:
		 //var=exp ? result1 :result2;
		 
		 int w=200,z=100;
		 int k=(w>z)? w:z;// w value is assigned to k since w>z
		 System.out.println(k);
		 
		 int w1=100,z1=200;
		 int k1=(w1>z1)? w1:z1;//z1 value is assigned to k1 since w1 is not greater than z1
		 System.out.println(k1);
		 
		 int o=(1==1)? 100:200;
		 System.out.println(o);
		 
		 int o1=(1==2)? 200:100;
		 System.out.println(o1);
		 
		 int person_age=30;
		 String vote=(person_age>=18)?"eligible":"not eligible";
		 System.out.println(vote);
		 
		 int person_age1=15;
		 String vote1=(person_age1>=18)?"eligible":"not eligible";
		 System.out.println(vote1);
		 
		 //unary operators ++ -- += -+ *= /= %= = !,
		 //binary operators + - * / % > < >= <= != == && ||
		 //ternary operators --
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
	}

}
