package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileTask {


	public static void main(String[] args) throws IOException{
//		음식을 4개 출력
		String[] foods = {"햄버거", "떡볶이", "김밥", "라면"};
		
		BufferedWriter bufferedWriter = null;
		
		bufferedWriter =  new BufferedWriter(new FileWriter("Food_List.txt"));
		
		for(String food : foods) {
			bufferedWriter.write(food + "\n");
		}
		
		bufferedWriter.close();
		
//		음식을 모두 가져와서 콘솔에 출력
		BufferedReader bufferedReader = null;
//		
//		try {
//			bufferedReader = new BufferedReader(new FileReader("Food_List.txt"));
//			
//			String readLine = null;
//			
//			while((readLine = bufferedReader.readLine()) != null) {
//				System.out.println(readLine);
//			}
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("파일 경로가 올바르지 않음");
//			e.printStackTrace();
//		}
		
//		값을 수정하기
		
		
//		햄버거 삭제
	}
}
