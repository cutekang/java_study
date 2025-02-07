package methodTest;

public class MethodTest01 {
//	두 수를 더해서 더한 값을 알려주는 메서드
	int add(int num1, int num2){
		return num1 + num2;
	}
	
//	이름을 받으면 이름을 콘솔에 출력해주는 메서드
	void printName(String name){
		System.out.println(name);
	}
	
//	두 개의 정수를 뺀 결과를 알려주는 메서드
	int subtract(int num1, int num2) {
		return num1 - num2; 
	}
	
	public static void main(String[] args) {
//		클래스명 변수명 = new 클래스명()
		MethodTest01 mt = new MethodTest01();
		int result = 0;
		result = mt.subtract(0,0);
	}
}
