package exceptionTest;

public class ExceptionTest {
	
	public static void main(String[] args) {
		int[] arData = new int[5];
		int num = 0;
		
		try {
			arData[0] = 20;
			System.out.println(arData[0] / num);
//			System.out.println(arData[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위 오바됨");
		} catch (ArithmeticException e) {
			System.out.println("0으로 왜 나눔?");
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} 
//		catch (ArithmeticException e) { //데드 코드
//			System.out.println("0으로 왜 나눔?");
//		}
		
	}
}
