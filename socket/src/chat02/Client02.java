package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client02 {

	public static void main(String[] args) throws IOException{
		Socket clientSocket = null;
		PrintWriter printWriter = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		String serverIp = "localhost";
		
		try {
//			IP , Port
			clientSocket = new Socket(serverIp, 7777);
			System.out.println("부자진영이와 연결되었습니다.");
			
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
			
			while(true) {
				System.out.println("거지재영 > ");
				String outMessage = sc.nextLine();
				
				out.write(outMessage + "\n");
				out.flush();
				
				String inMessage = in.readLine().replaceAll("\n", "");
				System.out.println("부자진영 >> " + inMessage);
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sc != null) {
				sc.close();
			}
			if(clientSocket != null) {
				clientSocket.close();
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
