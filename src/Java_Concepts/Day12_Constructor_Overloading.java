package java_Concepts;

public class Day12_Constructor_Overloading {

	
	double width, height, depth;
	//Constructor- same rules is applicable like method overloading
	Day12_Constructor_Overloading()//-Default 
	
	{
		width=height=depth=0;
	}
	
	Day12_Constructor_Overloading(double w, double h, double d)//constructor2
	{
		w=width;
		h=height;
		d=depth;
	
	}
	
	Day12_Constructor_Overloading(double len)//constructor3
	{
		
		width=height=depth=len;
	}
	
	double volumne()//Method1
	{
		
		return(width*height*depth);
	}
}
