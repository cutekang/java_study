package methodTask;

import java.util.Scanner;

public class MethodTask1 {

//	1부터 10까지 println으로 출력하는 메서드
	void printTen() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}
	
//	홍길동 이름을 n번 println()으로 출력하는 메서드
	void printGilDong(int printCount) {
		for(int i = 0; i < printCount; i++) {
			System.out.println("홍길동");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MethodTask1 mt = new MethodTask1();
		String messageGilDong = "홍길동을 몇 번 출력하시겠습니까?";
		int printGilDongCount = 0;
		
		mt.printTen();
		
		System.out.println(messageGilDong);
		printGilDongCount = sc.nextInt();
		
		mt.printGilDong(printGilDongCount);
	}
	
}
