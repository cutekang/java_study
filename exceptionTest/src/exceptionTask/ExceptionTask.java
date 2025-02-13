package exceptionTask;

import java.util.Scanner;

public class ExceptionTask {

//  5개의 정수를 입력 받기
//  무한 입력 상태로 구현한다
//  q를 입력시 나간다
//  입력한 각 정수는 배열에 담는다
//  if문은 딱 한 번만 사용한다.
	public static void main(String[] args) {
		int[] arData = new int[5];
		int count = 0;
		Scanner sc = new Scanner(System.in);
		String expression = null, message = "정수 5개를 순서대로 입력하세요.\nq 입력시 종료", exampleMessage = "번 째 정수";
		
		System.out.println(message);
		
		while(true) {
			try {
				if(count > arData.length - 1) {
					System.out.println("반복 종료");
					break;
				}
				expression = sc.next();
				count++;
				arData[count - 1] = Integer.parseInt(expression);
				
				System.out.println((count) + exampleMessage + " : " + arData[count - 1]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 배열 벗어남");
			} catch (NumberFormatException e) {
				if(expression.equals("q")) {
					System.out.println("반복 종료");
					break;
				}
				else {
					System.out.println("정수만 입력하셈");
					count--;
				}
			} catch (Exception e) {
				System.out.println("??");
			}
			
		}
		for(int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
	}
}
