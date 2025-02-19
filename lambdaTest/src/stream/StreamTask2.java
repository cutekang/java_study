package stream;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamTask2 {
	
	public static void main(String[] args) {
//		1) 5개의 문자열을 모두 소문자로 변경하기
//		Black , WHITE, reD, yeLLOW, PINk 등
//		ArrayList<String> colors = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLOW", "PINk"));
//		colors.stream().map(String::toLowerCase).forEach(System.out::println);

//		2) "Apple", "banna", "Melon", "cherry", "딸기"
//		단어 중 영문이면서, 앞글자가 대문자인 단어만 출력하기
//		int numAUpper = (int)'A';
//		int numZUpper = (int)'Z';
//		
//		ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("Apple", "banna", "Melon", "cherry", "딸기"));
//		fruits.forEach(s -> {
//			if(s.charAt(0) >= numAUpper && s.charAt(0) <= numZUpper) {
//				System.out.println(s);
//			}
//		});
		
//		3) 한글을 정수로 변경
//		"일공이사" -> 1024
		String input3 = "일공이사";
		ArrayList<Character> numsKor = new ArrayList<Character>(Arrays.asList('공', '일', '이', '삼', '사', '오', '육', '칠', '팔', '구'));
		input3.chars().map(c -> numsKor.indexOf((char)c)).forEach(System.out::print);
		System.out.println("\n\n=======================================================================\n");
		
//		4) 정수를 한글로 변경
//		"1024" -> "일공이사"
		String input4 = "1024";
		input4.chars().map(c -> numsKor.get(Character.getNumericValue((char)c))).forEach(c -> { System.out.print((char)c); }); 
		
	}
}
