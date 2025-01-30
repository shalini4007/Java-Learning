package java_Concepts;

public class Day14_PassingParamsToMainMethod {

	public static void main(String[] args) {
		System.out.println(args.length);//number of string values
		for(String value: args) //pass the parameters from run configurations// Arguments
		{
			System.out.println(value);
		}
		

	}

}
