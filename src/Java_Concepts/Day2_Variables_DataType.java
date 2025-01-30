package java_Concepts;

public class Day2_Variables_DataType {

	
	//Variables- container which holds and represents the data and should be declared with data type


	public static void main(String[] args) {
	int a=10;//declaration and assignments
	System.out.println(a);
	
	//values of variables can be updated
	double y=20.222;
	System.out.println(y);
	
	int d,b,c;// if all variables belongs to same data type
	d=1;
	b=2;
	c=3;
	
	int e=2, f=3,g=6;// if all variables belongs to same data type
System.out.println(e);//prints individual values
System.out.println(f);
System.out.println(g);

System.out.println(e+f+g);//prints sum of e, f and g

System.out.println(e+" "+f+" "+g);// prints values of e, f and g in single line

//data types- represents types of data

/////////////////////Premitive data types////////////////
//can store only one value at a time
//byte -128 to 127(1 byte), long- 4 bytes(added with literal), short-2 bytes 32768 to 32767 and long-8 bytes represents number without decimals
//float-7 (4 bytes) decimal digits and double-15(8 bytes) decimal digits represents number with decimals
//char represents single characters (single quotes)- E.g char c='A'- 1 bit
//boolean- represents true or false- 2 bytes
//int-4 bytes

long l=12345677890L;
System.out.println(l);

byte by= 123;
System.out.println(by);

short sh=3535;
System.out.println(sh);

float item=12.5F;
System.out.println(item);

double db=1234.1234567;
System.out.println(db);

boolean boo= true;//false
System.out.println(boo);

char grade='A';
System.out.println(grade);

//char in='abc'; invalid


/////////////////////Non-Premitive/derived/collections data types////////////////
//can store multiple values in a variable E.g int a[]=new int[100]
//String Eg- String s="Testing"
//Arraylist
//HashMap
//HashSet etc..

String s= "test";
System.out.println(s);

//String ch='A';//Invalid
String ch="A";
System.out.println(ch);

final int u=a;

//java is statically typed programming language-- > int x= 10; x="test" ( Not allowed- data type update to same varibale is not allowed)
//python is dynamically typed programming language-- > int x= 10; x="test" (allowed- data type is updated from int to String)
	}

}
