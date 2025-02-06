package inputTest;

import java.util.Scanner;

public class InputTest1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "이름을 입력하세요", lastName = null, firstName = null, name = null;
		
		System.out.println(message);
//		lastName = sc.next();
//		firstName = sc.next();
		name = sc.nextLine();
		System.out.println(name + " 님 환영합니다!😎");
	}
}
