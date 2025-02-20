package chatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

class ClientThread extends Thread{
	private BufferedReader input;

	public ClientThread(BufferedReader input) {
		this.input = input;
	}
	
	@Override
	public void run() {
		String line;
		try {
			while((line = input.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(input != null) {
					input.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Client {

	public static void main(String[] args) throws IOException{
		String name = "진영";
		String ip = "192.168.181.14";
		PrintWriter output = null;
		BufferedReader input = null;
		BufferedReader keyInput = null;
		
		Socket socket = null;
		
		try {
			socket = new Socket(ip, 8000);
			output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			keyInput = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("재영님과 연결되었습니다.");
			
			ClientThread clientThread = new ClientThread(input);
			clientThread.start();
			
			String line;
			
			while((line = keyInput.readLine()) != null) {
				output.println(name + " : " + line);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(socket != null) {
				socket.close();
			}
			if(input != null) {
				input.close();
			}
			if(output != null) {
				output.close();
			}
			if(keyInput != null) {
				keyInput.close();
			}
		}
		
		
	}
}
