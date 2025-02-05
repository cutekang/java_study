package variableTest;

public class FormatTest {
	
	public static void main(String[] args) {
		String name = "양진영";
		int age = 32;
		double height = 200;
		
		System.out.printf("이름 : %s\n",name);
		System.out.printf("나이 : %d\n",age);
		System.out.printf("키 : %.1fcm\n",height);
	}
}
