package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Frame01 extends JFrame implements ActionListener{
	public Frame01() {
		setLayout(new BorderLayout());
		JPanel panel=new JPanel();
		panel.setBackground(Color.yellow);
		add(panel,BorderLayout.NORTH);
		
		JButton alertBtn=new JButton("알림 띄우기");
		panel.add(alertBtn);
		alertBtn.addActionListener(this);
	}
	public static void main(String[] args) {
		Frame01 frame= new Frame01();
		frame.setTitle("Frame01");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,500,500);
		frame.setVisible(true);
		

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(this, "알림");
		
		//눈에 보이진 않지만 작업의 흐름이있다 스레드라한다.
		//떄로는 스레드가 여러개 필요할 수도 있다.
		//시간이 오래걸리거나 불확실한 작업.
		//메인 스레드에서 할경우 그 작업이 끝날때까지 다른 작업을 할 수없다.
		try {
			System.out.println("10초동안 작업준비");
			Thread.sleep(10000);
			//10초동안 스레드가 잡혀있어서 다른작업이 불가핟.
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("알림창이 닫아 졌습니다");
	}
	
}
