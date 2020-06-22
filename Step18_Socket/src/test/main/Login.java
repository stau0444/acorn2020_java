package test.main;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

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