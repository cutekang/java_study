package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest{

	public static void main(String[] args)  throws IOException{
//		throws는 해당 메소드를 사용한 쪽으로 예외를 ㅅ발생시킨다.
//		따라서 메소드 내에서는 throws에 작성한 예외가 발생하지 않는다.
		
//		new FileWriter(경로, 이어쓰기 여부);
//		BufferedWriter bufferedWriter = null;
//		try {
//			bufferedWriter = new BufferedWriter(new FileWriter("text.txt", true));
//			bufferedWriter.write("양진영 !!");
//			bufferedWriter.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			bufferedWriter.close();
//		}
		
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("text.txt"));
			String line = null;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("없는 경로입니다.");
			e.printStackTrace();
		} finally{
			bufferedReader.close();
		}
	}
}
