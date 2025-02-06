package arrayTask;

import java.util.Scanner;

public class ArrayTask1 {

	public static void main(String[] args) {
//		int [] arrBronze_1 = new int[5];
//		
//		for(int i = 0; i < 5; i++) {
//				arrBronze_1[i] = 10 - (i * 2);
//				System.out.println(arrBronze_1[i]);
//		}
//		
//		int [] arrBronze_2 = new int[10];
//		
//		for(int i = 0; i < 10; i++) {
//			arrBronze_2[i] = i + 1;
//			System.out.println(arrBronze_2[i]);
//		}
//		
//		int [] arrBronze_3 = new int[100];
//		
//		for(int i = 0; i < 100; i++) {
//			arrBronze_3[i] = i + 1;
//		}
//		for(int i = 0; i < arrBronze_3.length; i++) {
//			if(i % 2 != 0) {
//				System.out.println(arrBronze_3[i]);
//			}
//		}
//		
//		int [] arrSilver_1 = new int[100];
//		int result = 0;
//		for(int i = 0; i < 100; i++) {
//			arrSilver_1[i] = i + 1;
//		}
//		for(int i = 0; i < arrSilver_1.length; i++) {
//			if(i % 2 != 0) {
//				result += arrSilver_1[i];
//			}
//		}
//		System.out.println(result);
		
//		int count1 = (int)'F' - (int)'A';
//		int [] arrSilver_2 = new int[count1 + 1];
//		
//		for(int i = 0; i < arrSilver_2.length; i++) {
//			arrSilver_2[i] = (int)'A' + i;
//			
//			System.out.println((char)arrSilver_2[i]);
//		}
//		
//		int count2 = (int)'F' - (int)'A';
//		
//		int [] arrSilver_3 = new int[count2];
//		
//		for(int i = 0; i < arrSilver_3.length; i++) {
//			if(i > 1) {
//				arrSilver_3[i] = (int)'A' + i + 1;
//			}else {
//				arrSilver_3[i] = (int)'A' + i;
//			}
//			
//			System.out.println((char)arrSilver_3[i]);
//		}
//		
//		골드
//		5개의 정수를 입력받고 배열에 담은 후 최댓값과 최솟값을 출력하기
		Scanner scGold = new Scanner(System.in);
		int max = 0, min = 0;
		int [] arrInputNum = new int[5];
		
		String messageGold = "5개의 값을 입력해주세요\nex)2 3 5 10 22",
				resultGold_InputMessage = "입력 값: ",
				resultGold_Input = "",
				resultGold_MinMax = "최대 값 : %d\n최소 값 : %d";
		
		System.out.println(messageGold);
		for(int i = 0; i < 5; i++) {
			arrInputNum[i] = scGold.nextInt();
		}
		
		for(int i = 0; i < arrInputNum.length; i++) {
			resultGold_Input += arrInputNum[i] + " ";
			
			if(max < arrInputNum[i]) {
				max = arrInputNum[i];
			}
			
			if(min == 0 || min > arrInputNum[i]) {
				min = arrInputNum[i];
			}
		}
		
		System.out.println(resultGold_InputMessage + resultGold_Input);
		
		System.out.printf(resultGold_MinMax,max,min);
		
//		다이아
//		사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균값을 구하기
//		Scanner scDiamond = new Scanner(System.in);
//		String messageInputCount = "입력할 정수의 개수를 입력해주세요.";
//		String messageInput = "정수를 입력해주세요 \nex)1 3 5 10";
//		String resultDiamond = "평균 값 : %.2f";
//		
//		
//		int intCount = 0;
//		System.out.println(messageInputCount);
//		intCount = scDiamond.nextInt();
//		
//		int sum = 0;
//		double avg = 0.0;
//		
//		int [] arrAvg = new int[intCount];
//		
//		System.out.println(messageInput);
//		for(int i = 0; i < arrAvg.length; i++) {
//			arrAvg[i] = scDiamond.nextInt();
//			sum += arrAvg[i];
//		}
//		
//		avg = (double)sum / (double)intCount;
//		
//		System.out.printf(resultDiamond, avg);
	}
}
