package test.frame6;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Myframe extends JFrame implements ActionListener {

	public Myframe() {
		setLayout(new FlowLayout());
		JButton sendBtn = new JButton("전송");
		JButton removeBtn = new JButton("삭제");
		add(sendBtn);
		add(removeBtn);
		sendBtn.addActionListener(this);
		removeBtn.addActionListener(this);
		
		//버튼에 command 등록하기 (어떤 기능을 하는 버튼인지)
		sendBtn.setActionCommand("send");
		removeBtn.setActionCommand("remove");
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
		System.out.println("하이");
		if(e.getActionCommand().equals("send")) {
			JOptionPane.showMessageDialog(this, "전송됨");	
		}else if(e.getActionCommand().equals("remove")){
			JOptionPane.showMessageDialog(this, "삭제됨");
		}
			
	}
}
