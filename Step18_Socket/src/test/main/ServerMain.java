package test.main;
/*
 * JSON
 * -javaScriptObjectNotation( 자바스크립트 객체 표기법을 따르는 문자열)
 * 
 * -데이터의 type:
 * value가 될 수 있는 타입
 * 1.{}
 * 2.[]
 * 3."xxx"
 * 4.10 or 10.1
 * 5.true or false
 * 6.null
 * 
 *  -JSON 예제
 *  {"num":1, "name":"김구라","isMan":true,"phone":null}
 * 	[10,20,30,40,50]
 * 	["김구라","해골","원숭이","주뎅이"]
 * 	[{},{},{}]
 * 	{"name":"kim","friends":["김구라","해골","원숭이"]}
 * -자바스크립트 친화적이기 때문에 자바에선 라이브러리를 사용해야한다.
 * -라이브러리를 통해 JSON형식으로 만들거나 받은문자열에서 원하는 것을 빼내준다
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.json.JSONArray;
import org.json.JSONObject;

public class ServerMain {
	//static 필드
	static List<ServerThread> threadList=new ArrayList<>();
	
	public static void main(String[] args) {
		
		//필요한 객체를 저장할 지역변수 미리 만들기 
		ServerSocket serverSocket=null;
		try {
			// 5000번 통신 port 을 열고 클라이언트의 접속을 기다린다. 
			serverSocket=new ServerSocket(5000);
			while(true) {
				
				Socket socket=serverSocket.accept();
				System.out.println("클라이언트가 접속을 했습니다.");
				//방금 접속한 클라이언트를 응대할 스레드를 시작 시킨다.
				ServerThread thread=new ServerThread(socket);
				thread.start();
				//생성하고 시작한 스레드의 참조값을 List 에 저장하기 
				threadList.add(thread);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(serverSocket!=null)serverSocket.close();
				
			}catch(Exception e) {}
		}
	}
	//내부 클래스로 스레드 객체를 생성할 클래스를 정의한다.
	//static main() 메소드에서 클래스를 사용하기 위해 static 예약어를 붙여서 정의한다.
	public static class ServerThread extends Thread{
		//필드 
		Socket socket;
		//클라이언트에게 출력할수 문자열을 있는 객체
		BufferedWriter bw;
		//클라이언트 대화면 저장할 필드
		String chatName;
		
		//생성자의 인자로 Socket 객체를 전달받도록 한다.
		public ServerThread(Socket socket) {
			//생성자의 인자로 전달 받은 Socket 객체의 참조값을 필드에 저장한다. 
			this.socket=socket;
		}
		//인자로 전달된 문자열을 Socket 을 통해서 출력하는 메소드 
		public void sendMessage(String msg) throws IOException {
			//반복문 돌면서 모든 스레드의 BufferedWriter 객체를 이용해서
			//문자열을 전송한다. 
			for(ServerThread tmp:threadList) {
				tmp.bw.write(msg); //문자열 출력
				tmp.bw.newLine(); //개행기호 출력
				tmp.bw.flush(); //방출
			}
		}
		// 참여자 목록을 얻어내서 Client 에게 출려해주는 메소드
		public void sendChatNameList() {
			JSONObject jsonObj=new JSONObject();
			JSONArray jsonArr=new JSONArray();
			//스레드 리스트에서 chatName을 순서대로 참조해서 JSONArray 객체에 순서대로 넣기
			for(int i=0; i<threadList.size(); i++) {
				ServerThread tmp= threadList.get(i);
				jsonArr.put(i,tmp.chatName);
			}
			jsonObj.put("type","members");
			jsonObj.put("list",jsonArr);
			//sendMessage에서 throws 를 하고 있기 때문에 사용하는데에서 잡아줘야한다
			try {
				sendMessage(jsonObj.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//새로운 작업 단위가 시작되는 run() 메소드 
		@Override
		public void run() {
			try {
				//클라이언트로 부터 읽어들일 (Input) 객체의 참조값 얻어오기
				InputStream is=socket.getInputStream();
				InputStreamReader isr=new InputStreamReader(is);
				BufferedReader br=new BufferedReader(isr);
				
				//클라이언트에게 출력할수 있는 객체
				OutputStream os=socket.getOutputStream();
				OutputStreamWriter osw=new OutputStreamWriter(os);
				//BufferedWriter 객체의 참조값을 필드에 저장하기 
				bw=new BufferedWriter(osw);
				
				while(true) {
					/*
					 *  클라이언트가 문자열을 한줄 (개행기호와 함께) 보내면
					 *  readLine() 메소드가 리턴 하면서 보낸 문자열을 가지고 온다.
					 *  보내지 않으면 계속 블로킹 되어서 대기하고 있다가
					 *  접속이 끈기면 Exception 이 발생하거나 혹은 null 이 
					 *  리턴 된다. 
					 *  따라서 null 이 리턴되면 반복문을 빠져 나가게 break 문을 만나도록
					 *  한다.
					 *  실행순서가 try 블럭을 벗어나면 run() 메소드가 리턴하게 되고
					 *  run() 메소드가 리턴되면 해당 스레드는 종료가 된다. 
					 */
					//클라이언트가 전송하는 문자열을 읽어낸다.
					String msg=br.readLine();
					//전송된 JSON문자열을 사용할 준비를 한다.
					//받아온 문자열을 제이슨오브젝트의 인자로 넣어준다
					JSONObject jsonObj= new JSONObject(msg);
					//type 이라는 키값의 문자열을 뺴낸다
					String type=jsonObj.getString("type");
					if(type.equals("enter")) {
						//현재 스레드가 대응하는 클라이언트의 대화명을 필드에 저장
						String chatName=jsonObj.getString("name");
						this.chatName=chatName;
						sendChatNameList();
						//누가 나가는지를 출력하기위해 필드에 저장
					}
					System.out.println("메세지:"+msg);
					//클라이언트에게 동일한 메세지를 보내는 메소드를 호출한다.
					sendMessage(msg);
					if(msg==null) {//클라이언트의 접속이 끈겼기 때문에 
						//문자열 출력
						break;//반복문(while) 을 빠져 나오도록 한다. 
					}
				}
			}catch(Exception e) {
				
				e.printStackTrace();
			}finally {
				//접속이 끈겨서 종료 되는 스레드는 List에서 제거한다.
				
				threadList.remove(this);
				//this가 퇴장 한다고 메세지를 보낸다.
				
				try {
					JSONObject jsonObj=new JSONObject();
					jsonObj.put("type", "out");
					jsonObj.put("name", this.chatName);
					sendMessage(jsonObj.toString());
					sendChatNameList();
					
					if(socket!=null)socket.close();
				}catch(Exception e) {}
			}
		}
	}
	public class Login extends JFrame implements ActionListener {
		JTextField userId;
		JPasswordField userPassword;

		public Login() {
			setTitle("로그인");
			setLayout(new GridLayout(6, 1));
			setBounds(100, 100, 300, 400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel pan = new JPanel();
			JPanel pan2 = new JPanel();
			JLabel lab = new JLabel("아이디");
			JLabel lab1 = new JLabel("비밀번호");
			userId = new JTextField(15);
			userPassword = new JPasswordField(15);
			JButton btn = new JButton("들어가기");
			btn.addActionListener(this);
			btn.setSize(50, 50);
			pan.add(lab);
			pan.add(userId);
			pan2.add(lab1);
			pan2.add(userPassword);
			add(pan);
			add(pan2);
			add(btn);

			setVisible(true);

		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (userId.getText().equals("ugo") && (userPassword.getText().equals("asdasd1"))) {
				setVisible(false);
				ClientMain f = new ClientMain();
				f.setTitle("채팅");
				f.setBounds(100, 100, 500, 500);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(this, "아이디 혹은 비밀번호를 다시입력해 주세요");
			}

		}

	}
}

