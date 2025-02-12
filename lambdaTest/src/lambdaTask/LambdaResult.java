package lambdaTask;

public class LambdaResult {

	public static void main(String[] args) {
		
		PrintName printName = (lastName, firstName) -> lastName + firstName;
		
		System.out.println(printName.TotalName("양","진영"));
	}
}
