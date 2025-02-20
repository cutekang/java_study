package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class FileTask2 {

	public static void main(String[] args) throws IOException{
		ArrayList<User> users = new ArrayList<User>();
		User user1 = new User(1L, "홍길동", "도둑",20);
		User user2 = new User(2L, "신짱구", "전사",5);
		User user3 = new User(3L, "신짱아", "마법사",3);
		User user4 = new User(4L, "이순신", "해적", 55);
		User user5 = new User(5L, "양진영", "개발자", 20);
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
		// 파일에 적을 텍스트 작성
		String jobList = null;
		jobList = users.stream().map(user -> user.getName() + " 님의 직업은 " +  user.getJob() + "입니다.").reduce("", (a, b) -> a + b + "\n");
		
		// 파일에 쓰기
		BufferedWriter bufferedWriter = null;
		bufferedWriter = new BufferedWriter(new FileWriter("jobs.txt"));
		bufferedWriter.write(jobList);
		bufferedWriter.close();
		
		// 파일 읽어서 콘솔 출력
		BufferedReader bufferedReader = null;
		bufferedReader = new BufferedReader(new FileReader("jobs.txt"));
		String readLine = null;
		while((readLine = bufferedReader.readLine()) != null) {
			System.out.println(readLine);
		}
		bufferedReader.close();
	}
}
