package example5;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame{
	JTextField user;
	public Login() {
			setLayout(new GridLayout(10,1));
			setBounds(100,100, 300, 400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel pan=new JPanel();
			JPanel pan2=new JPanel();
			JLabel lab=new JLabel("아이디");
			user=new JTextField(15);
			JButton btn =new JButton("들어가기");
			pan.add(lab);
			pan2.add(user);
			pan.add(btn);
			add(pan);
			
			
			setVisible(true);

		}
		
		public boolean check() {
			boolean a= false;
			if(user.getText()!=null) {
				a=true;
			}
			return a;
			
			
		}
	
}