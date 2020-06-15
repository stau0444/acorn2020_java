package test.frame1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainClass01 {
	public static void main(String[] args) {
		// JFrame 객체 생성하고 참조 값을 담아 놓고 프레임을 만든다.
		JFrame f = new JFrame("Hello Frame");
		// 초기 위치와 크기 지정
		f.setBounds(100, 100, 500, 500);
		// 프레임을 닫았을때 자동으로 프로세스 종료 되도록
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 프레임 보이게한다
		f.setVisible(true);
		//버튼 추가
		JButton btn=new JButton("눌러");
		btn.setBounds(10, 10, 100, 40);
		f.add(btn);
		new MyFrame("나만의 프레임");
		
	
	}

	public static class MyFrame extends JFrame {
		//클래스를 만들고 상속 받아서 생성자에 초기값을 지정해 프레임을 만든다
		public MyFrame(String title) {
			super(title);
			// 초기화작업
			setBounds(200, 200, 300, 300);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
			setLayout(null);
			JButton btn=new JButton("눌러");
			btn.setBounds(10, 10, 100, 40);
			this.add(btn);
			
		}
	}
}
