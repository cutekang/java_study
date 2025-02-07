package methodTask;

import java.util.Scanner;

public class MethodTask3 {
// 	1번 세 정수를 뺄셈해서 결과값을 알려주는 메서드
	void subThreeInt(int num1, int num2, int num3) {
		int result = 0;
		String resultText = null;
		result = num1 - num2 - num3;
		resultText = "입력값 \n1) %d\n2) %d\n3) %d \n결과 : %d\n";
		
		System.out.printf(resultText, num1, num2, num3, result);
	}
//	2번 두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메서드(배열 사용)
	int[] devideTwoInt(int num1, int num2) {
		int resultDevision = 0;
		int resultRest = 0;
		String resultText = null;
		int[] resultArr = new int[2];
		
		resultDevision = num1 / num2;
		resultRest = num1 % num2;
		
		resultArr[0] = resultDevision;
		resultArr[1] = resultRest;
		
		return resultArr;
	}
//	3번 1~n가지의 합을 구해주는 메서드
	void sumFromTo(int sumCount) {
		int result = 0;
		String resultMessage = "1~%d까지의 합 : %d\n";
		for(int i = 0; i < sumCount; i++) {
			result += i + 1;
		}
		System.out.printf(resultMessage, sumCount, result);
	}
//	4번 홀수인지 짝수인지 알려주는 메서드
	void isOdd(int num) {
		boolean checkOdd = false;
		String result = null; 
		
		if(num % 2 != 0) {
			checkOdd = true;
		}
		
		result = checkOdd ? "홀수입니다." : "짝수입니다.";
		
		System.out.printf("입력 값 : %d\n결과 : %s\n",num, result);
	}
//	5번 문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메서드
	void changeLetter(String input) {
		char[] arrChar = input.toCharArray();
		int numA = (int)'A', numZ = (int)'Z', gap = (int)'a' - (int)'A';
		String result = "", resultText = "입력된 문자 : %s\n변경된 결과 : %s\n";
		
		for(int i = 0; i < arrChar.length; i++) {
			if(arrChar[i] >= numA && arrChar[i] <= numZ) { 
				arrChar[i] += gap; 
			}else if(arrChar[i] >= numA + gap && arrChar[i] <= numZ + gap) {
				arrChar[i] -= gap; 
			}
			
			result += arrChar[i];
		}
		System.out.printf(resultText, input, result);
	}
	
	public static void main(String[] args) {
		//메서드 사용을 위한 클래스 인스턴스
		MethodTask3 mt3 = new MethodTask3();
		
		//Scanner 사용을 위한 Scanner 선언
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		//전체적으로 결과를 확인하기 위한 구분(공통 사용 변수)
		String messageSeperate = "\n===============================\n";
		
		//1번 문제 변수 생성
		String message1 = "뺄셈을 할 3개의 정수를 입력해주세요.\nex)1 2 3";
		int subNumInput1 = 0, subNumInput2 = 0, subNumInput3 = 0;
		
		//2번 문제 변수 생성
		String message2 = "나눗셈을 할 2 정수를 입력해주세요. \nex)10 2", resultMessage = "결과\n몫 : %d\n나머지 : %d\n";
		int devNumInput1 = 0, devNumInput2 = 0;
		int [] devNumResult = new int[2];
		
		//3번 문제 변수 생성
		String message3 = "누적 합을 반복할 횟수를 정해주세요. ex) 10";
		int sumInput = 0;
		
		//4번 문제 변수 생성
		String message4 = "홀,짝을 판단할 수를 입력해주세요. ex) 10";
		int checkOddNum = 0;
		
		//5번 문제 변수 생성
		String message5 = "대소문자를 변환할 텍스트를 입력하세요.\nex)안녕하세요 Hello!", changeString = null;
		
		
		//1번 문제 실행
		System.out.println(message1);
		subNumInput1 = sc.nextInt();
		subNumInput2 = sc.nextInt();
		subNumInput3 = sc.nextInt();
		mt3.subThreeInt(subNumInput1, subNumInput2, subNumInput3);
		
		System.out.println(messageSeperate);
		
		//2번 문제 실행
		System.out.println(message2);
		devNumInput1 = sc.nextInt();
		devNumInput2 = sc.nextInt();
		devNumResult = mt3.devideTwoInt(devNumInput1, devNumInput2);
		System.out.printf(resultMessage,devNumResult[0],devNumResult[1]);
		
		System.out.println(messageSeperate);
		
		//3번 문제 실행
		System.out.println(message3);
		sumInput = sc.nextInt();
		mt3.sumFromTo(sumInput);
		
		System.out.println(messageSeperate);
		
		//4번 문제 실행
		System.out.println(message4);
		checkOddNum = sc.nextInt();
		mt3.isOdd(checkOddNum);
		
		System.out.println(messageSeperate);
		
		//5번 문제 실행
		System.out.println(message5);
		changeString = sc2.nextLine();
		mt3.changeLetter(changeString);
	}
}
