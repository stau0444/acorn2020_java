package example2;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("서버에 전송할 문자열 입력");
		String msg=scan.nextLine();
		
		Socket socket = null;
		try {
			socket = new Socket("192.168.0.30", 5000);
			System.out.println("Socket연결성공");
			socket.getOutputStream();
			//문자열 서버에 전송 (출력 Output) 하기
			OutputStream os=socket.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(os);
			osw.write(msg); //서버에서 줄단위로 읽어낼 예정이기 떄문에 개행기호가 있어야 한줄로 표시가된다
			osw.write("\r\n");
			osw.flush();
			osw.close();
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
