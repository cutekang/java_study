package lambdaTask2;

// 1) 1~10까지 출력해주는 람다 구현 PrintNum, printUpTo10()
// 2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다 구현 PrintString, strCount()
// 3) 문자열을 받으면 뒤집은 문자열을 리턴해주는 람다 구현 Reverse, reverseString()
// 4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다 구현 Remove, removeStr()
// 5) 문자열에서 중복된 값을 모두 없애고 리턴해주는 람다 구현 Deduce, getDeduce()
// ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"

public class LambdaResult2 {
	
	public static void main(String[] args) {
		
//		1) 풀이
		PrintNum printNum = () -> {
			String resultString = "";
			for(int i = 0; i < 10; i++) {
				resultString += i + 1;
			}
			return resultString;
		};
		String result1 = printNum.printUpTo10();
		System.out.println("1번 풀이 : " + result1);
		
//		2) 풀이
		PrintString printStringCount = (strInput, charSearch) -> {
			int resultCount = 0;
			for(int i = 0; i < strInput.length(); i++) {
				if(strInput.charAt(i) == charSearch) {
					resultCount++;
				}
			}
			return resultCount;
		};
		int result2 = printStringCount.strCount("abcdabcdababcdefg", 'a');
		System.out.println("2번 풀이 : " + result2);
		
//		3) 풀이
		Reverse reverseString = (strInput) -> {
			String resultString = "";
			
			for(int i = 0; i < strInput.length(); i++) {
				resultString += strInput.charAt(strInput.length() - 1 - i);
			}
			return resultString;
		};
		String result3 = reverseString.reverseString("장재영바보멍청이");
		System.out.println("3번 풀이 : " + result3);
		
//		4) 풀이
		Remove remove = (strInput, charRemove) -> {
			String resultString = "";
			for(int i = 0; i < strInput.length(); i++) {
				if(strInput.charAt(i) != charRemove) {
					resultString += strInput.charAt(i); 
				}
			}
			return resultString;
		};
		String result4 = remove.removeString("장재영똥멍청이",'똥');
		System.out.println("4번 풀이 : " + result4);
		
//		5) 풀이
		Deduce deduce = (strInput) -> {
			char[] inputStringToChar = null;
			inputStringToChar = strInput.toCharArray();
			String resultString = ""; 
			boolean checkRepeat = false;
			
			for(int i = 0; i < inputStringToChar.length; i++) {
				char compareChar = inputStringToChar[i];
				
				for(int j = 0; j < resultString.length(); j++) {
					if(resultString.charAt(j) == compareChar)
					{
						checkRepeat = true;
						break;
					}
				}
				
				if(!checkRepeat) {
					resultString += inputStringToChar[i];
				}
				else {
					checkRepeat = false;
				}
			}
			return resultString;
		};
		
		String result5 = deduce.getDeduce("장장장장장장재재재재재영영영재재영영멍멍청이이청청이이멍멍멍");
		System.out.println("5번 풀이 : " + result5);
		
	}
}
