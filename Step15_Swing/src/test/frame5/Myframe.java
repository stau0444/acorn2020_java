package test.frame5;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Myframe extends JFrame {

	public Myframe() {
		setLayout(new FlowLayout());
		JButton sendBtn = new JButton("전송");
		JButton removeBtn = new JButton("삭제");
		add(sendBtn);
		add(removeBtn);
		
		// ActionListener는 인터페이스 이기 때문에 익명의 클래스를 만들어 오버라이딩해야한다.
	
		
		ActionListener listner2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(Myframe.this, "삭제됨");
			}
		};
		
		;
		sendBtn.addActionListener((e)->{JOptionPane.showMessageDialog(Myframe.this, "전송됨");});
		removeBtn.addActionListener((e)->{JOptionPane.showMessageDialog(Myframe.this, "삭제됨");});
		
	}

	public static void main(String[] args) {

		// MYframe의 참조값을 frame이라는 변수에 담는다.
		Myframe frame = new Myframe();
		frame.setBounds(100, 100, 500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(3);

	}
}
