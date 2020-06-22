package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import test.main.ServerMain;

public class ClientMain extends JFrame implements ActionListener, KeyListener {

	JTextField tf;
	Socket socket;
	BufferedWriter bw;
	JTextArea jta;

	public ClientMain() {

		try {
			socket = new Socket("192.168.0.25", 5000);
			OutputStream os = socket.getOutputStream();
			// 접속한 서버의 출력이기 떄문에 soket 객체로부터 아웃풋스트림 객체를 받아올 수밖에없다.
			// 메소드가 리턴해주는 것을 사용하고 있다.
			OutputStreamWriter osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			// 접속이성공하면 서버로 부터 메세지 받을 스레드 시작
			new ClientThread().start();
			// 객체의 인자로 IP와 포트번호를 준다.
			// 접속이 성공되면 Socket 객체의 참조값이 반환된다.
			// 반환되는 객체의 참조값을 필드에 저장해 놓는다.
		} catch (Exception e) {

		}
		setLayout(new BorderLayout());
		// 페널
		JPanel panel = new JPanel();
		panel.setBackground(Color.magenta);
		tf = new JTextField(15);
		jta = new JTextArea();
		JButton sendBtn = new JButton("전송");
		sendBtn.setActionCommand("send");
		sendBtn.addActionListener(this);
		panel.add(tf);
		panel.add(sendBtn);
		JScrollPane bar = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setEditable(false);
		jta.setBackground(Color.pink);
		add(panel, BorderLayout.SOUTH);
		add(bar, BorderLayout.CENTER);
		// 엔터키로 메세지 전송 가능하게
		tf.addKeyListener(this);
		
	}
	//생성자

	//메인 메소드
	public static void main(String[] args) {
		Login login=new Login();
			

		
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		sendMessage();
	}

	// 서버에서 불특정 시점에 도착하는 메시지를 받을 스레드
	public class ClientThread extends Thread {

		@Override
		public void run() {
			try {
				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				while (true) {
					String inputMsg = br.readLine();
					jta.append(inputMsg + "\r\n");
					int docLength = jta.getDocument().getLength();
					jta.setCaretPosition(docLength);
					if (inputMsg == null) {
						break;
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_ENTER) {
			sendMessage();
		}
	}

	// 메세지 전송 메소드
	public void sendMessage() {
		String msg = tf.getText();

		try {
			bw.write(msg); // 서버에서 줄단위로 읽어낼 예정이기 떄문에 개행기호가 있어야 한줄로 표시가된다
			bw.newLine();// 버퍼드라이터에 개행기호출력 메소드
			bw.flush();

		} catch (Exception e2) {
			e2.printStackTrace();
		} finally {

			tf.setText("");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	
}
