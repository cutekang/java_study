package methodTask;

import java.util.Scanner;

public class MethodTask4 {
//	1) 문자열을 입력받고 원하는 문자의 개수를 구해주는 메서드
	int getLetterCount(String input, String search) {
		char[] arrChar = null, searchArrChar = null;
		int searchCount = 0;
		
		arrChar = input.toCharArray();
		searchArrChar = search.toCharArray();
		for(int i = 0; i < arrChar.length; i++) {
			if(arrChar[i] == searchArrChar[0]) {
				searchCount++;
			}
		}
		return searchCount;
	}
	
//	2) 5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메서드
	int searchNumByIndex(int[] numArr, int searchIndex) {
		int [] arrInt = numArr;
		
		for(int i = 0; i < arrInt.length; i++) {
			if(i == searchIndex - 1) {
				return arrInt[i];
			}
		}
		
		return -1;
	}
	
//	3) 한글을 정수로 바꿔주는 메서드 (일공이사 -> 1024)
	String changeKoreanToNum(String input) {
		char[] charArr = input.toCharArray();
		String result = "";
		
		for(int i = 0; i < charArr.length; i++) {
			switch(charArr[i]) {
				case '공':
					charArr[i] = '0';
					break;
				case '일':
					charArr[i] = '1';
					break;
				case '이':
					charArr[i] = '2';
					break;
				case '삼':
					charArr[i] = '3';
					break;
				case '사':
					charArr[i] = '4';
					break;
				case '오':
					charArr[i] = '5';
					break;
				case '육':
					charArr[i] = '6';
					break;
				case '칠':
					charArr[i] = '7';
					break;
				case '팔':
					charArr[i] = '8';
					break;
				case '구':
					charArr[i] = '9';
					break;
				default:
					return "변환할 문자가 잘못되었습니다.";
			}
			
			result += charArr[i];
		}
		return result;
	}
	
//	4) 5개의 정수를 입력받고 최대값과 최소값을 구해 값을 반환해주는 메서드
	int[] getMinMaxValue(int[] inputArr) {
		int min = 0, max = 0;
		int [] arrResult = new int[2];
		min = inputArr[0];
		max = inputArr[0];
		for(int i = 1; i < inputArr.length; i++) {
			if(min < inputArr[i]) {
				min = inputArr[i];
			}
			
			if(max > inputArr[i]) {
				max = inputArr[i];
			}
		}
		arrResult[0] = min;
		arrResult[1] = max;
		return arrResult;
	}
	
//	5) 5개의 정수를 입력받고 최대값과 최소값을 구해주는 기능을 가진 메서드
//	매개변수 2개, 1: 최소값과 최대값을 구할 배열, 최소값과 최대값을 구한 결과를 담을 배열
	void getMinMax(int[] inputArr) {
		int min = 0, max = 0;
		int [] arrResult = new int[2];
		String resultMessage = "입력 값 : %d, %d, %d, %d, %d\n최대값 : %d\n최소값 : %d";
		
		min = inputArr[0];
		max = inputArr[0];
		
		
		for(int i = 1; i < inputArr.length; i++) {
			if(min > inputArr[i]) {
				min = inputArr[i];
			}
			
			if(max < inputArr[i]) {
				max = inputArr[i];
			}
		}
		
		arrResult[0] = min;
		arrResult[1] = max;
		
		System.out.printf(resultMessage,inputArr[0], inputArr[1], inputArr[2], inputArr[3], inputArr[4], max, min);
	}
	
//	6) String 클래스의 indexOf() 메서드 만들기, 문자열 전체와 검색할 문자를 전달 받는다.
	int myIndexOf(String input, char searchItem) {
		char [] charArr = null;
		
		charArr = input.toCharArray();
		
		for(int i = 0; i < charArr.length; i++) {
			if(charArr[i] == searchItem) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// 클래스 인스턴스
		MethodTask4 mt4 = new MethodTask4();
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 문제별 구분을 위한 구분 문자열 (공통 사용)
		String messageSeperate = "\n=======================\n";
		
		// 1) 변수 생성
		// 입력을 받기위한 출력 문자열 / 결과를 담을 문자열 / 입력받을 문자열 변수 / 문자열에서 찾아낼 문자 변수
		String message1_1 = "텍스트를 입력하세요.", message1_2 = "검색할 문자를 입력하세요.", resultText1 = "찾은 문자 : %s\n개수 : %d" ,input1_1 = null, input1_2 = null;
		// 결과 변수
		int result1 = 0;
		
		// 2) 변수 생성
		String message2_1 = "5개의 숫자를 입력하세요.\nex)1 2 3 4 5", message2_2 = "확인할 번호(1~5의 값)를 입력하세요\nex) 1", resultText2 = "찾는 번호 : %d\n찾은 번호의 값 : %d";
		int [] input2_1 = new int[5];
		int input2_2 = 0;
		int result2 = 0;
		
		// 3) 변수 생성
		String message3 = "변환할 텍스트를 입력해주세요.\nex)공일이삼사", input3 = "",resultText3 = "입력 값 : %s\n결과 값 : %s", result3 = "";
		
		// 4) 변수 생성
		String message4 = "5개의 숫자를 입력하세요.\nex)1 2 3 4 5", resultText4 = "최대 값 : %d\n최소 값 : %d";
		int [] input4 = new int[5], result4 = new int[2];
		
		// 5) 변수 생성
		String message5 = "5개의 숫자를 입력하세요.\nex)1 2 3 4 5";
		int [] input5 = new int[5];
		
		// 6) 변수 생성
		String message6_1 = "텍스트를 입력해주세요.", message6_2 = "인덱스 번호를 찾을 문자를 한개만 입력해주세요\nex) a", input6_1 = "", resultText6 = "찾는 문자 : %c\n찾은 문자의 인덱스 번호 : %d";
		char input6_2 = 0;
		int result6 = 0;
		
		
//		// 1) 실행
//		// 입력 문자열을 받는 부분
//		System.out.println(message1_1);
//		input1_1 = sc.nextLine();
//		// 검색할 문자를 받는 부분
//		System.out.println(message1_2);
//		input1_2 = sc.next();
//		// 결과 변수에 저장
//		result1 = mt4.getLetterCount(input1_1, input1_2);
//		// 결과 출력
//		System.out.printf(resultText1 + "\n",input1_2, result1);
//		
//		// 구분선
//		System.out.println(messageSeperate);
		
		
//		// 2) 실행
//		// 입력 수 배열을 받기 위한 출력
//		System.out.println(message2_1);
//		// 입력 수 배열을 변수에 저장
//		for(int i = 0; i < 5; i++) {
//			input2_1[i] = sc.nextInt();
//		}
//		// 검색할 인덱스 번호 받기 위한 출력
//		System.out.println(message2_2);
//		// 검색할 인덱스 번호 변수에 저장
//		input2_2 = sc.nextInt();
//		// 메서드 실행하여 결과 값 바인딩
//		result2 = mt4.searchNumByIndex(input2_1,input2_2);
//		// 결과 출력
//		System.out.printf(resultText2 + "\n",input2_2, result2);
//		
//		// 구분선
//		System.out.println(messageSeperate);
		
//		// 3) 실행
//		System.out.println(message3);
//		input3 = sc.nextLine();
//		result3 = mt4.changeKoreanToNum(input3);
//		System.out.printf(resultText3, input3, result3);
//		
//		System.out.println(messageSeperate);
		
//		// 4) 실행
//		System.out.println(message4);
//		for(int i = 0; i < 5; i++) {
//			input4[i] = sc.nextInt();
//		}
//		
//		result4 = mt4.getMinMaxValue(input4);
//		System.out.printf(resultText4, result4[0], result4[1]);
//		
//		System.out.println(messageSeperate);
		
//		// 5) 실행
//		System.out.println(message5);
//		for(int i = 0; i < 5; i++) {
//			input5[i] = sc.nextInt();
//		}
//		mt4.getMinMax(input5);
		
//		System.out.println(messageSeperate);
		
//		// 6) 실행
//		System.out.println(message6_1);
//		input6_1 = sc.nextLine();
//		System.out.println(message6_2);
//		input6_2 = sc.next().toCharArray()[0];
//		
//		result6 = mt4.myIndexOf(input6_1, input6_2);
//		System.out.printf(resultText6, input6_2, result6);
	}
}
