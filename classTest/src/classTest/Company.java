package classTest;

public class Company {

//	회사 클래스 필드 구성하기
//	이름, 나이, 수입
//	회사의 총 수입

//	회사원은 총 4명(객체)
//	1번 + 10,000원
//	2번 + 1,000원
//	3번 + 2,000원
//	4번 - 20,000원
//	각 회사의 총 수입을 출력하기
	
	String name;
	int money;
	int age;
	static int totalMoney;
	public Company() {
		// TODO Auto-generated constructor stub
	}
	
	public Company (String Name, int age, int money) {
		this.name = Name;
		this.age = age;
		this.money = money;
		totalMoney += this.money;
	}
	
	void printMoney() {
		System.out.println(name + "의 수입 : " + money);
	}
	
	void printAge() {
		System.out.println(name + "의 나이 : " + age);
	}
	
	void printTotalMoney() {
		System.out.println("회사 총 수입 : " + totalMoney);
	}
	
	public static void main(String[] args) {
		Company JaeYoung = new Company("재영", 28, 10000);

		JaeYoung.printMoney();
		JaeYoung.printAge();
		JaeYoung.printTotalMoney();
		
		Company JiHyeon = new Company("지현", 30, 1000);
		
		JiHyeon.printMoney();
		JiHyeon.printAge();
		JiHyeon.printTotalMoney();
		
		Company JeongHoon = new Company("정훈", 34, 2000);
		
		JeongHoon.printMoney();
		JeongHoon.printAge();
		JeongHoon.printTotalMoney();
		
		Company YoungSoo = new Company("영수", 26, -20000);
		
		YoungSoo.printMoney();
		YoungSoo.printAge();
		YoungSoo.printTotalMoney();
	}
}
