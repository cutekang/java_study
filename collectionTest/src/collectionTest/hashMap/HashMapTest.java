package collectionTest.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
	
	
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<>();
		
		userMap.put("id", "wlsud94");
		userMap.put("password", "wlsud9494");
		userMap.put("name", "양진영");
		userMap.put("age", 19);
		System.out.println(userMap.size()); 
		System.out.println(userMap); 
		System.out.println(userMap.get("id")); 
		
		Iterator<Entry<String, Object>> iter = userMap.entrySet().iterator();
		
//		entry : key, value를 한 쌍씩 가지고 있는 자료구조
//		entrySet() : Set 자료구조로 바꾼다.
//		순서가 없기 때문에 iterator()
		
		while(iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
			
			if(entry.getKey().equals("name")) {
				System.out.println(entry.getValue());
			}
		}
	}
}
