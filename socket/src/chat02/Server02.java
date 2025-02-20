package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server02 {
	
	
	public static void main(String[] args) throws IOException{
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("연결 대기중...");
			
			socket = serverSocket.accept();
			System.out.println("연결 완료");
			
//			네트워크 입출력 스트림 생성
			in = new BufferedReader(new InputStreamReader((socket.getInputStream())));
			out = new BufferedWriter(new OutputStreamWriter((socket.getOutputStream())));
			
			while(true) {
				String inMessage = in.readLine();
				System.out.println("거지재영 > " + inMessage);
				
				
				System.out.println("부자진영이 거지재영한테 메세지 보내기 >> ");
				String outMessage = sc.nextLine();
				out.write(outMessage);
				out.flush();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sc != null) {
				sc.close();
			}
			if(serverSocket != null) {
				serverSocket.close();
			}
			if(socket != null) {
				socket.close();
			}
			if(in != null) {
				in.close();
			}
			if(out != null) {
				out.close();
			}
		}
	}
}
