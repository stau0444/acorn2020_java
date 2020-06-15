package test.frame1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JPannelTest extends JFrame implements ActionListener {
	public JPannelTest() {
		setTitle("스윙예제");
		setLayout(new FlowLayout());
		
		JButton btn1=new JButton("button1");
		JButton btn2=new JButton("button2");
		add(btn1);
		add(btn2);
		
		setSize(300,400);
		setVisible(true);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(str.equals("button1")) {
			System.out.println("버튼 1 클릭 됬다");
			getContentPane().setBackground(Color.ORANGE);
		}else if(str.equals("button2")) {
			System.out.println("버튼 2 클릭 됬다");
			getContentPane().setBackground(Color.blue);
		}
	}
	public static void main(String[] args) {
		new JPannelTest();
	}
}
