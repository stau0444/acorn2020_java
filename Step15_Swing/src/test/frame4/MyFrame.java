package test.frame4;

import java.awt.BorderLayout;

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
		setLayout(new BorderLayout());
		//창을 보이게 한다
		setVisible(true);
		//버튼 객체만든다
		JButton btn= new JButton("눌러");
		//버튼의 크기정한다.
		btn.setSize(100,30);
		//this에 버튼을 추가한다
		add(btn,BorderLayout.WEST);
		
		JButton btn2= new JButton("눌러");
		btn2.setSize(100,30);
		add(btn2,BorderLayout.EAST);
		
		JButton btn3= new JButton("눌러");
		btn3.setSize(100,30);
		add(btn3,BorderLayout.NORTH);
		
		JButton btn4= new JButton("눌러");
		btn4.setSize(100,30);
		add(btn4,BorderLayout.SOUTH);
		
		
	}
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}
}

