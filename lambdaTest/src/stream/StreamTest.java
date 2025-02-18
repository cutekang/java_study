package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {

	public static void main(String[] args) {
//		IntStream : 시작점부터 끝점까지 정해준다. 1씩 증가
		
//		IntStream.range(0, 10); // 0 ~ 9 까지
//		
//		IntStream.range(0, 10).forEach(System.out::println);
//		
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1 ,2 ,3 ,4 ,5 ,6 ,7, 8, 9, 10));
//		
//		IntStream.rangeClosed(1, 10).forEach(datas::add);
//		datas.forEach(System.out::println);
		
//		10~1까지 ArrayList를 만들고, 만든 ArrayList 에 값을 담고( add )
//		모두 출력하기
		
		ArrayList<Integer> datas2 = new ArrayList<Integer>();
		IntStream.range(0, 10).forEach(num -> {
			datas2.add(10-num);
		});
//		datas2.forEach(System.out::println);
//		System.out.println(datas2);
		
		IntStream.range(0, 5).forEach(num -> {
			datas2.remove(0);
		});
//		datas2.forEach(System.out::println);
		
//		문자열 stream
//		chars() : 문자열을 Intstream 으로 변환
		String data3 = "ABCDEFG";
		String data4 = "ㄱㄴㄷㄹㅁㅂ";
//		data3.chars().forEach(System.out::println);
//		data4.chars().forEach(System.out::println);
		
//		.map()
//		data4.chars().forEach(c -> {
//			System.out.println((char)c);
//		});
//		data4.chars().map((c) -> c + 4).forEach(c -> {
//			System.out.println((char)c);
//		});
		
		
//		직업만 출력하기
		ArrayList<User> users = new ArrayList<User>();
		User user1 = new User(1, "양진영", 30, "강아지 콜렉터");
		User user2 = new User(2, "김영수", 10, "천재");
		User user3 = new User(3, "함지현", 20, "뮤지컬배우");
		User user4 = new User(4, "신정훈", 20, "개발자");
		User user5 = new User(5, "장재영", 16, "배우");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
		users.forEach(System.out::println);
		users.stream().map(User::getJob).map((job) -> "직업 : " + job).forEach(System.out::println);
		
//		유저의 나이만 출력하기
		users.stream().map(user -> user.getAge()).map((age) -> "나이 : " + age).forEach(System.out::println);
		
//		실습
//		"/news", "/game", "/brand", "/rank"
//		ArrayList에 담고, 모든 경로 앞에 "/app"을 붙여준다
		String news = "/news";
		String game = "/game";
		String brand = "/brand";
		String rank = "/rank";
		String app = "/app";
		
		ArrayList<String> uri = new ArrayList<String>();
		uri.add(news);
		uri.add(game);
		uri.add(brand);
		uri.add(rank);
		uri.stream().map(str -> app + str).forEach(System.out::println);
		
//		정렬 : sorted()
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,10,6,4,8));
		
//		오름차순
		numbers.stream().sorted().forEach(System.out::println);
//		내림차순
		numbers.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
//		결과 값의 리턴을 다양한 타입으로 리턴 : collect((Collector.~());
		ArrayList<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(1,10,6,4,8));
		List<Integer> list = numbers2.stream().map(n -> n + 10).collect(Collectors.toList());
		System.out.println(list);
		
//		문자열로 바꾸기
		ArrayList<Integer> numbers3 = new ArrayList<Integer>(Arrays.asList(1,10,6,4,8));
		String a = numbers3.stream().sorted().map(String::valueOf).collect(Collectors.joining(","));
		System.out.println(a);
		
//		filter()
		ArrayList<Integer> numbers4 = new ArrayList<Integer>(Arrays.asList(1,10,6,4,8));
		ArrayList<Integer> even = new ArrayList<Integer>();
		numbers4.stream().filter(n -> n % 2 == 0).forEach(even::add);
		even.forEach(System.out::println);
		
		
	}
}
