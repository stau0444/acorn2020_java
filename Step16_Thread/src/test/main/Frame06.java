package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import test.mypac.CountRunnable;
import test.mypac.CountThread;

public class Frame06 extends JFrame implements ActionListener {
	// 필드
	JLabel label_result;

	// inner class 정의
	// 내부클래스의 장점은 바깥클래스에 정의된 필드를 사용할 수 있다.
	class CountThread extends Thread {
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
			/*
			 * 내부 클래스의 메소드 안에서 바깐쪽에 클래스의 필드와
			 * 메소드를 사용할 수 있다.
			 */
			label_result.setText("작업 종료");
		}
	}

	// 생성자
	public Frame06() {
		setLayout(new BorderLayout());
		JPanel panel = new JPanel();
		panel.setBackground(Color.yellow);
		add(panel, BorderLayout.NORTH);

		// 버튼추가
		JButton countBtn = new JButton("1~10까지 세기");
		panel.add(countBtn);
		countBtn.addActionListener(this);
		// JLable 페널에추가
		label_result = new JLabel();
		panel.add(label_result);

	}

	public static void main(String[] args) {
		Frame06 frame = new Frame06();
		frame.setTitle("Frame01");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 500, 500);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//내부 클래스를 이용해서 스레드 객체
		new CountThread().start();
		
	}
}
