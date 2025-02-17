package collectionTest.arrayList.task;

import java.util.ArrayList;

public class UserField {

	public ArrayList<User> users = DBConnector.users;
	public static String userId = null;
	
//	아이디 검사
	public User checkId(String id) {
		for(User user : users) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	
//	아이디 검사
	public boolean checkPassword(User user, String inputPassword) {
		return user.getPassword().equals(inputPassword);
	}
	
//	회원가입
	public void join(User user) {
		User userInDB = checkId(user.getId());
		if(userInDB == null) {
			users.add(user);
		}
		else {
			System.out.println("아이디가 중복되었습니다.");
			return;
		}
	}
	
//	로그인
//	public void logIn(User user) {
//		User findUser = checkId(user.getId());
//		
//		if(findUser == null) {
//			System.out.println("아이디가 없습니다.");
//			return;
//		}
//		else {
//			if(checkPassword(findUser, user.getPassword())) {
//				curUser = findUser;
//				System.out.println("로그인 완료\n" + curUser.getName() + " 님 환영합니다.");
//				return;
//			}
//			else {
//				System.out.println("비밀번호가 틀렸습니다. 다시 확인해 주세요.");
//				return;
//			}
//		}
//	}
//	public void logIn(String id, String password) {
//		User findUser = checkId(id);
//		
//		if(findUser == null) {
//			System.out.println("아이디가 없습니다.");
//			return;
//		}
//		else {
//			if(checkPassword(findUser, password)) {
//				curUser = findUser;
//				System.out.println("로그인 완료\n" + curUser.getName() + " 님 환영합니다.");
//				return;
//			}
//			else {
//				System.out.println("비밀번호가 틀렸습니다. 다시 확인해 주세요.");
//				return;
//			}
//		}
//	}
	
//	로그인 로직
	public boolean logIn(User user) {
		User userInDB = checkId(user.getId());
		
		if(userInDB != null) {
			if(userInDB.getPassword().equals(user.getPassword())) {
				userId = user.getId();
				return true;
			}
		}
		return false;
	}
	
//	로그아웃
	public void logOut() {
		userId = null;
	}
	
//	암호화
//	단방향으로
//	key의 앞단에 더하는 상수 : salt
	
	int salt = (int)'Y';
	final int key = 33;
	
	public String encrypt(String s) {
		String result = "";
		for(int i = 0; i < s.length(); i++) {
			result += (char)(salt + s.charAt(i) * key);
		}
		return result;
	}
	
//	비밀번호 변경(마이 페이지)
//	비밀번호 변경(30일)
//	인증번호 전송
//	인증번호 확인
	
	
}
