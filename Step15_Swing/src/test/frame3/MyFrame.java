package test.frame3;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	public MyFrame(String title) {
		super(title);
		//창의 크기정한다
		setBounds(100,100,500,500);
		//종료시 작동을 끈다
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//모르겠다
		setLayout(null);
		//창을 보이게 한다
		setVisible(true);
		//버튼 객체만든다
		JButton btn= new JButton("눌러");
		//버튼의 크기정한다.
		//this에 버튼을 추가한다
		add(btn);
		
		JButton btn2= new JButton("눌러");
		add(btn2);
		
		JButton btn3= new JButton("눌러");
		add(btn3);
		
		JButton btn4= new JButton("눌러");
		add(btn4);
		
		
	}
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}
}


