package synchronizedTest;

public class CU {

	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Thread yjy = new Thread(atm, "부자 진영");
		Thread jjy = new Thread(atm, "거지 재영");
		
		yjy.start();
		jjy.start();
	}
}
