package operTask;

import java.util.Scanner;

public class OperTask1 {
	
	public static void main(String[] args) {
//		마스터
//		사용자에게 값을 입력받고
//		정수라면 정수입니다.
//		실수라면 실수입니다.
//		예) 183 -> 입력한 값은 정수입니다.
//		183.5 -> 입력한 값은 실수입니다.
//		삼항 연산자를 사용하기
		
		Scanner sc = new Scanner(System.in);
		String message = "값을 입력해 주세요.", result = null;
		
		double input;
		boolean checkInput;
		
		System.out.println(message);
		
		input = sc.nextDouble();
		checkInput = input % 1 == 0;
		
		result = checkInput ? "%.0f -> 입력한 값은 정수입니다." : "%.1f -> 입력한 값은 실수입니다.";
		
		System.out.printf(result,input);
	}
}
