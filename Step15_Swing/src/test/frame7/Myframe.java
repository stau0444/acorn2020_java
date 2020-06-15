package test.frame7;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Myframe extends JFrame implements ActionListener {
	JButton sendBtn;
	JButton removeBtn;
	
	public Myframe() {
		setLayout(new FlowLayout());
		sendBtn = new JButton("전송");
		removeBtn = new JButton("삭제");
		
		add(sendBtn);
		add(removeBtn);
		sendBtn.addActionListener(this);
		removeBtn.addActionListener(this);
		

	}

	public static void main(String[] args) {

		// MYframe의 참조값을 frame이라는 변수에 담는다.
		Myframe frame = new Myframe();
		frame.setBounds(100, 100, 500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object s=e.getSource();
		//이벤트 일어난 객체의 참조값을 object 타입으로 리턴
		if(s==sendBtn) {
			System.out.println("전송");
		}else if(s==removeBtn) {
			System.out.println("삭제");
		}
			
	}
}
