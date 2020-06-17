package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import test.mypac.CountRunnable;
import test.mypac.CountThread;


public class Frame05 extends JFrame implements ActionListener{
	public Frame05() {
		setLayout(new BorderLayout());
		JPanel panel=new JPanel();
		panel.setBackground(Color.yellow);
		add(panel,BorderLayout.NORTH);
		
		JButton countBtn=new JButton("1~10까지 세기");
		panel.add(countBtn);
		countBtn.addActionListener(this);
	}
	public static void main(String[] args) {
		Frame05 frame= new Frame05();
		frame.setTitle("Frame01");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,500,500);
		frame.setVisible(true);
		

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {

		
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				
//			}
//		}).start();
		//오버라이드 메소드 한가지면 람다식 사용가능
		new Thread(()->{
			int count = 1;

			while (true) {
				try {

					Thread.sleep(1000);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(count);
				count++;
				if (count == 11) {
					break;
				}
			}
		}).start();
		System.out.println("새로운 스레드 시작");
	}
}
