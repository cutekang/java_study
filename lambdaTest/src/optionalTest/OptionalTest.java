package optionalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {

	ArrayList<User2> users = new ArrayList<User2>(Arrays.asList(
			new User2("양진영","yjy","1234"),
			new User2("함지현","hjh","4567"),
			new User2("김영수","kys","8910"),
			new User2("신정훈","sjh","1112"),
			new User2("장재영","jjy","1314")
			));
	
	public Optional<User2> findById(Long id) {
		User2 user = null;
		
		for(User2 userinDB : users) {
			if(userinDB.getId() == id) {
				user = userinDB;
			}
		}
		
		return Optional.ofNullable(user);
	}
	
	public static void main(String[] args) {
		OptionalTest op = new OptionalTest();
		
		Optional<User2> user = op.findById(200L);
		
//		orElse : null 아니라면 user, null 이라면 대체 user
//		user.orElse(new User2());
		
//		orElseThrow : null 아니라면 user, null 이라면 () -> {예외 발생}
//		user.orElseThrow(() -> {
//			throw new NoSearchUserException("그런회원 없수다");
//		});
		user.ifPresent((findUser) -> {
//			null 이 아닐때만 실행
			System.out.println("ifPresent");
			System.out.println(findUser);
		});
		
		user.ifPresentOrElse((findUser) -> {
//			null 이 아니면 실행
		}, () -> {
//			null 일 때 실행
			System.out.println("ifPresentorElse");
		});
		
		System.out.println(user.isPresent());
	}
}
