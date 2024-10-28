package Java_Concepts;

public class Day12_Encapsulation_MainClass {

	public static void main(String[] args) {
		
		Day12_Encapsulation acc= new Day12_Encapsulation();
		acc.setAccNo(100);
		System.out.println(acc.getAccNo());
		
		acc.setname("Testing");
		System.out.println(acc.getname());
		
		acc.setAmount(1000);
System.out.println(acc.getAmount());
	}

}
