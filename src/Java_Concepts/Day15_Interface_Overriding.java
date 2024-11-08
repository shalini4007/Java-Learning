package Java_Concepts;
//Method Overriding- Is possible only with Inheritance
// It should have two classes -one parent and one child class
// All the methods or variables present in parent class can be overridden 
// whatever methods created in parent class same methods are created in child class but implementation is unique



class bank
{
double InterestRate() {
	return 0;
}
}

class ICICI extends bank
{
	double InterestRate() {
		return 10.5;
	}
}

class SBI extends bank
{
	double InterestRate() {
		return 12.5;
	}
}
public class Day15_Interface_Overriding {
	
	public static void main(String[] args) {
	
ICICI ic= new ICICI();
System.out.println(ic.InterestRate());

SBI sb= new SBI();
System.out.println(sb.InterestRate());
	}

}
