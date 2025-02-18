package collectionTest;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonTest2 {

	public static void main(String[] args) {
		
		JSONObject userJson = new JSONObject();
		JSONArray usersJson = new JSONArray();
		
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
		
		System.out.println(users);
		
//		for(User user : users) {
//			JSONObject JSONUser = new JSONObject(user);
//			usersJson.put(JSONUser);
//		}
//		
//		users.stream().map(user -> new JSONObject(user)).forEach(user -> {
//			usersJson.put(user);
//		});
		
		users.stream().map(JSONObject::new).forEach(usersJson::put);
		System.out.println(usersJson);
		
	}
}
