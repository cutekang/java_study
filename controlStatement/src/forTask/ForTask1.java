package forTask;

import java.util.Scanner;

public class ForTask1 {

	public static void main(String[] args) {
//		브론즈
//		1~100 까지 출력하기
//		for(int i = 0; i < 100; i++) {
//			System.out.println(i+1);
//		}
		
//		100~1 까지 출력하기
//		for(int i = 100; i > 0; i--) {
//			System.out.println(i);
//		}
		
//		1~100 까지 짝수만 출력하기
//		for(int i = 0; i < 100; i++) {
//			if((i + 1) % 2 == 0) {
//				System.out.println(i+1);
//			}
//		}
		
//		골드
//		1~10까지의 합을 출력하기
//		int resultGold_1 = 0;
//		for(int i = 0; i < 10; i++) {
//			resultGold_1 += i + 1;
//		}
//		System.out.println(resultGold_1);
//		
//		1~n 까지의 합을 출력하기
//		int inputGold_2 = 0, resultGold_2 = 0;
//		String messageGold = "반복을 멈출 수를 입력해주세요.";
//		
//		System.out.println(messageGold);
//		Scanner scGold = new Scanner(System.in);
//		
//		inputGold_2 = scGold.nextInt();
//		
//		for(int i = 0; i < inputGold_2; i++) {
//			inputGold_2 += i + 1;
//		}
//		System.out.println(resultGold_2);
		
//		플레티넘
//		A~F까지 출력하기
//		int numA = (int)'A';
//		int numC = (int)'C';
//		int numF = (int)'F';
//		
//		for(int i = numA; i <= numF; i++) {
//			System.out.print((char)i);
//		}
		
		
//		A~F까지 중 C를 제외하고 출력하기
//		for(int i = numA; i <= numF; i++) {
//			if(i != numC) {
//				System.out.print((char)i);
//			}
//		}
		
//		다이아
//		012340123401234 출력하기
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print(j);
//			}
//		}
		
//		aBcDeF...Z까지 출력하기
//		int numA = (int)'A';
//		int gap = (int)'a' - (int)'A';
//		int numZ = (int)'Z';
//		
//		for(int i = numA; i <= numZ; i++) {
//			if(i % 2 == 0) {
//				System.out.print((char)i);
//			}else {
//				System.out.print((char)(i + gap));
//			}
//		}
		
//		마스터
//		별찍기
//		    *
//		   ***
//		  *****
//		 *******
//		*********
//		Scanner scMaster = new Scanner(System.in);
//		String messageMaster = "몇 줄짜리 별인가요? \n예) 5";
//		int inputNum = 0;
//		String resultMaster_Line = "";
//		
//		System.out.println(messageMaster);
//		inputNum = scMaster.nextInt();
//		
//		for(int i = 0; i < inputNum; i++) {
//			for(int j = 0; j <= inputNum + i; j++) {
//				if(j < (inputNum + i) - (i * 2)) {
//					resultMaster_Line += " ";
//				}else {
//					resultMaster_Line += "*";
//				}
//			}
//			
//			
//			System.out.println(resultMaster_Line);
//			resultMaster_Line = "";
//		}
	}
}
