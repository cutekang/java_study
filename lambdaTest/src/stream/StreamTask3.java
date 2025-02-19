package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class StreamTask3 {
	public static void main(String[] args) {
//	    1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
		ArrayList<Integer> datas = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 6).forEach(n -> datas.add(n * 10));
		System.out.println(datas);
		
		Optional<Integer> resulto;
		
		int result = 0;

		for(int data : datas) {
			result += data;
		}
		
//		stream 내의 rduce 메서드 (찾아본거)
		resulto = datas.stream().reduce((a, b) -> a + b);
		
		result = datas.stream().reduce(0,(a, b) -> a + b);
//		result = datas.stream().reduce(0,Integer::sum);
		System.out.println(resulto);
		
		
//	    2) 각각의 Member가 들어가 있는 ArrayList<Member>가 존재한다.
//	    모든 Member의 취미를 검토하여, 개발을 좋아하는 사람의 데이터를 출력한다.
		Member member1 = new Member("홍길동", "축구_농구_야구", "나는 축구왕!");
		Member member2 = new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!");
		Member member3 = new Member("장보고", "피아노", "피아노만 한 우물!");
		Member member4 = new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
		Member member5 = new Member("김영희", "골프_야구", "운동 선수는 나의 꿈");
		Member member6 = new Member("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
		
		ArrayList<Member> members = new ArrayList<Member>(Arrays.asList(member1, member2, member3, member4, member5, member6));
		
		ArrayList<Member> members2 = new ArrayList<Member>(Arrays.asList(
				new Member("홍길동", "축구_농구_야구", "나는 축구왕!"), 
				new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!"),    
				new Member("장보고", "피아노", "피아노만 한 우물!"),         
				new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~"),   
				new Member("김영희", "골프_야구", "운동 선수는 나의 꿈"),      
				new Member("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!")
				));
		
		members.stream().filter(member -> member.getHobby().contains("개발")).forEach(System.out::println);
		
//	    필드 : 이름, 취미, 소개
//	    홍길동, 축구_농구_야구, 나는 축구왕!
//	    이순신, 개발_당구_축구, 나는 개발자 좋아!
//	    장보고, 피아노, 피아노만 한 우물!
//	    김철수, 스포츠댄스_개발, 취미로 춤을 춘다 ~
//	    김영희, 골프_야구, 운동 선수는 나의 꿈
//	    흰둥이, 개발_축구_농구, 개발도 운동도 다 잘해요!
		
		
	}

	
}
