package chatting;

import java.util.Scanner;

public class Chatting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = null;
				
		System.out.println("상대방에게 보내는 메세지 : ");
		message = sc.nextLine();
		
		try {
			if(message.contains("바보")) {
				throw new BadWordException("비속어 사용하면 뒤짐..");
			}
			System.out.println(message);
			
		} catch (BadWordException e) {
			System.out.println("비속어 사용하면 뒤짐요");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
