package chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws IOException {
//		소켓
		Socket socket = null;
		
//		출력 스트림 PrintWriter
		PrintWriter writer = null;
		
		String serverIp = "192.168.181.14";
		
		try {
			socket = new Socket(serverIp, 1100);
			
			System.out.println("서버와 연결되었습니다.");
			
			writer = new PrintWriter(socket.getOutputStream(),true);
			
			String message = "하이 나는 장재영 😎😎😎😎😎😎😎😎😎";
			writer.println(message);
			
			System.out.println("서버로 [" + message + "] 라는 메세지를 보냈습니다....");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(socket != null) {
				socket.close();
			}
			if(writer != null) {
				writer.close();
			}
		}
	}
}
