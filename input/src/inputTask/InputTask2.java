package inputTask;

import java.util.Scanner;

public class InputTask2 {
//	3개의 정수를 한 번에 입력 받은 뒤, 
//	3개의 정수의 곱셈을 출력한다.
//	단, next()만 사용
	public static void main(String[] args) {
		int num1, num2, num3, resultNum;
		String message = "3개의 정수를 입력해주세요. ex) 10 20 30",
				resultMessage = "%d * %d * %d = %d";
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		
//		num1 = Integer.parseInt(sc.next());
//		num2 = Integer.parseInt(sc.next());
//		num3 = Integer.parseInt(sc.next());
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		resultNum = num1 * num2 * num3;
		
		System.out.printf(resultMessage, num1, num2, num3 ,resultNum);
	}
}
