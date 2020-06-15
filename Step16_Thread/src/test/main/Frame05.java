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
	//스레드상속 런메소드 오버라이드 스타트 메서드 호출
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//익명의 클래스를 생성해서 Runnable 타입의 객채를생성하고 메소드를 오버라이드해줬다.
		Runnable r=new Runnable() {

			@Override
			public void run() {
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
			}
			
		};
		//쓰레드를 상속받지않고 바로 쓰레드에 runnable 타입을 인자로 넣어준다.
		Thread t= new Thread(r);
		//start 메소드호출
		t.start();
		System.out.println("새로운 스레드 시작");
	}
}
