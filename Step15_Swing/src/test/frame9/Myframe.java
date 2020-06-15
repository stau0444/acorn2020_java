package test.frame9;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EventObject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Myframe extends JFrame implements ActionListener, KeyListener {
	JTextField inputMsg;
	JLabel lab1;

	public Myframe() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		// 텍스트를 입력받는 칸을 만든다()안은 범위
		inputMsg = new JTextField(15);
		// 프레임에 추가해준다
		add(inputMsg);
		// 버튼만든다
		JButton sendBtn = new JButton("전송");
		// 프레임에추가한다
		add(sendBtn);
		// 버튼을 눌렀을 때 동작하는 이벤트리스너를 this에 걸어준다.
		sendBtn.addActionListener(this);
		lab1 = new JLabel("하이");
		add(lab1);
		inputMsg.addKeyListener(this);
		

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
		// 경고창을 띄우는 showMessageDialog에 인자로 부모,텍스트 전달
		String msg = inputMsg.getText();
		lab1.setText(lab1.getText()+"\n"+msg );
		inputMsg.setText("");

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == 10) {
			String msg = inputMsg.getText();
			lab1.setText(msg );
			inputMsg.setText("");
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}
}
