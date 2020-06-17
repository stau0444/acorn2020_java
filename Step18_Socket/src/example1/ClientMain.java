package example1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientMain {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("192.168.0.25", 5000);
			System.out.println("Socket연결성공");
			socket.getOutputStream();
	
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (socket != null)
					socket.close();
			} catch (Exception e) {
			}
		}
		System.out.println("연결이 끝났습니다");
	}
}
