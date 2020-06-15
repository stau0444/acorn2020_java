package test.frame1;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
		JTextField jaddr,jname,jage,result;
		JButton btn1;
	
	public MyFrame() {
		setTitle("그리드 레이아웃");
		//창의 크기정한다
		setLayout(new GridLayout(4,2));
		//창을 보이게 한다
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new JLabel("이름"));
		jname=new JTextField();
		add(jname);
		add(new JLabel("주소"));
		add(jaddr);
		add(new JLabel("나이"));
		jage=new JTextField();
		add(jage);
		btn1=new JButton("확인");
		add(btn1);
		result=new JTextField();
		add(result);
		
		btn1.addActionListener(this);
		jname.addActionListener(this);
		jaddr.addActionListener(this);
		jage.addActionListener(this);
		
		setSize(400,200);
		setVisible(true);
		
		//버튼 객체만든다
//		JButton btn= new JButton("눌러");
//		//버튼의 크기정한다.
//		btn.setBounds(10,10, 100, 40);
//		//this에 버튼을 추가한다
//		add(btn);
//		
//		JButton btn2= new JButton("눌러");
//		btn2.setBounds(120,10, 100, 40);
//		add(btn2);
//		
//		JButton btn3= new JButton("눌러");
//		btn3.setBounds(230,10, 100, 40);
//		add(btn3);
//		
//		JButton btn4= new JButton("눌러");
//		btn4.setBounds(340,10, 100, 40);
//		add(btn4);
//		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj==btn1) {
			result.setText("이름:"+jname.getText()+"주소:"+jaddr.getText()+"나이:"+jage.getText());
		}else if(obj==jname) {
			result.setText("이름:"+jname.getText());
		}else if(obj==jaddr) {
			result.setText("주소:"+jaddr.getText());
		}else if(obj==jage) {
			result.setText("나이:"+jage.getText());
		}
		
	}
	public static void main(String[] args) {
		
	}
}

