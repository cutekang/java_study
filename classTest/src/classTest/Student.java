package classTest;

import java.util.Scanner;

public class Student {

//	학생의 학번, 이름, 국어점수, 영어점수, 수학점수 입력받고
//	총점과 평균을 출력하기
	
	String name;
	int num;
	int scoreKorean;
	int scoreEnglish;
	int scoreMath;
	
	static int scoreSum;
	static double scoreAvg;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	int getSum() {
		scoreSum = scoreKorean + scoreEnglish + scoreMath;
		return scoreSum;
	}
	
	double getAvg() {
		scoreAvg = (double)scoreSum / 3.0;
		return scoreAvg;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String messageKor = "국어점수를 입력해주세요.";
		String messageEng = "영어점수를 입력해주세요.";
		String messageMat = "수학점수를 입력해주세요.";
		
		Student JaeYoung = new Student("재영", 100);
		
		System.out.println(messageKor);
		JaeYoung.scoreKorean = sc.nextInt();
		
		System.out.println(messageEng);
		JaeYoung.scoreEnglish = sc.nextInt();
		
		System.out.println(messageMat);
		JaeYoung.scoreMath = sc.nextInt();
		
		System.out.println("총점 : " + JaeYoung.getSum());
		System.out.println("평균 : " + JaeYoung.getAvg());
		
	}
}
