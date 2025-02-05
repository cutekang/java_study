package castingTest;

public class CastingTask2 {
	
	public static void main(String[] args) {
//		1번 문제
//		num1 + str1 + str2로 115 만들기
		int num1 = 1;
		String dstr1 = "8.24", dstr2 = "7.8";
		String result1 = "" + num1 + ((int)(Double.parseDouble(dstr1)) + (int)(Double.parseDouble(dstr2)));
		System.out.println("1번 답 : " + result1);
		
		
//		2번 문제
//		a,j,k를 연산하여 A,J,K를 출력하기
		char str1 = 'a';
		char str2 = 'j';
		char str3 = 'k';
		
		int changenum = 32;
		
		int resulta = str1 - changenum;
		int resultj = str2 - changenum;
		int resultk = str3 - changenum;
		
		String result2 = "" + (char)resulta + ", " + (char)resultj + ", " + (char)resultk;
      
		System.out.println("2번 답 : "  + result2);
		
//		3번 문제
//		"12.123"
//		"345.789"
//		"6789.456"
//		3개 값을 더해서 123456789를 출력하기
		String str12 = "12.123";
		String str345 = "345.789";
		String str6789 = "6789.456";
		
		int inum12 = (int)(Double.parseDouble(str12));
		int inum345 = (int)(Double.parseDouble(str345));
		int inum6789 = (int)(Double.parseDouble(str6789));
		
		String result3 = "" + inum12 + inum345 + inum6789;
		
		System.out.println("3번 답 : " + result3);
	}
}
