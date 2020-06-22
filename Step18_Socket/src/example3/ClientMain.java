package example3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClientMain extends JFrame implements ActionListener {

	JButton sendBtn;
	JTextField tf;
	// 서버와 연결된 Socket 객체의 참조값을 담을 필드
	Socket socket;

	public ClientMain() {

		try {
			socket = new Socket("192.168.0.30", 5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		setLayout(new BorderLayout());
		// 페널
		JPanel panel = new JPanel();
		panel.setBackground(Color.magenta);
		tf = new JTextField(15);
		sendBtn = new JButton("전송");
		sendBtn.setActionCommand("send");
		panel.add(tf);
		panel.add(sendBtn);
		add(panel, BorderLayout.SOUTH);

		sendBtn.addActionListener(this);
	}

	public static void main(String[] args) {
		ClientMain f = new ClientMain();
		f.setTitle("채팅");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String msg = tf.getText();
		Socket socket = null;
		try {
			// 문자열 서버에 전송 (출력 Output) 하기
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			osw.write(msg); // 서버에서 줄단위로 읽어낼 예정이기 떄문에 개행기호가 있어야 한줄로 표시가된다
			osw.write("\r\n");
			osw.flush();
		} catch (Exception e2) {
			e2.printStackTrace();
		} finally {
			try {
				if (socket != null)
					socket.close();
			} catch (Exception e1) {}
		}
		System.out.println("연결이 끝났습니다");

	}
}
