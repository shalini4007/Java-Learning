package Java_Concepts;

//final- can apply for variables/class/methods

class Test {
	final int x = 100;
}

final class Test1 {

	final void Me1() {
		System.out.println("This is method from Test1 class");
	}
}

/*
 * class Test2 extends Test1 --> cannot extend Test1 since it's final class	
 * { 
 * cannot override since the Me1 is final method
 * void Me1() 
 * { System.out.println("This is method from Test2 class");
 *  }
 * 
 * }
 */

public class Day15_final {

	public static void main(String[] args) {
		Test t = new Test();
		// t.x=200;// x value can be updated if final keyword is not used
		System.out.println(t.x);

	}

}
