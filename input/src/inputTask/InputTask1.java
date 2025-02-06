package inputTask;

import java.util.Scanner;

public class InputTask1 {
//	두 정수를 입력한 뒤 덧셈 결과를 출력한다.
//	단 sc.next() 사용한다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int inputnum1, inputnum2, result;
		String message1 = "첫 번째 정수를 입력해 주세요", 
				message2 = "두 번째 정수를 입력해 주세요", 
				resultMessage = "정답 : ";
		
		System.out.println(message1);
		System.out.print("첫 번쨰 정수 : ");
		inputnum1 = Integer.parseInt(sc.next());
		
		System.out.println(message2);
		System.out.print("두 번쨰 정수 : ");
		inputnum2 = Integer.parseInt(sc.next());
		
		result = inputnum1 + inputnum2;
		
		System.out.println(resultMessage + result);
	}
}
