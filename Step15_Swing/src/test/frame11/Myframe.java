package test.frame11;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Myframe extends JFrame implements  ActionListener {
	JTextField num1;
	JTextField num2;
	JLabel lab;
	JLabel lab1;
	JLabel lab3;
	JButton btnP;
	JButton btnM;
	JButton btnMul;
	JButton btnD;
	JPanel pan;
	JPanel pan2;
	
	public Myframe() {
		setLayout(new GridLayout(10,2));
		num1 = new JTextField(5);
		btnP = new JButton("+");
		btnP.addActionListener(this);
		btnP.setActionCommand("plus");
		btnM = new JButton("-");
		btnM.addActionListener(this);
		btnM.setActionCommand("minus");
		btnMul = new JButton("*");
		btnMul.addActionListener(this);
		btnMul.setActionCommand("multiple");
		btnD = new JButton("/");
		btnD.addActionListener(this);
		btnD.setActionCommand("divide");
		lab = new JLabel("=");
		lab1 = new JLabel();
		lab3=new JLabel();
		num2 = new JTextField(5);
		pan = new JPanel();
		pan2= new JPanel();
		

		pan.add(num1);
		pan.add(lab3);
		pan.add(num2);
		pan.add(lab);
		pan.add(lab1);
		pan.setBackground(Color.green);
		pan2.add(btnP);
		pan2.add(btnM);
		pan2.add(btnD);
		pan2.add(btnMul);
		
		
		add(pan,BorderLayout.NORTH);
		add(pan2,BorderLayout.CENTER);
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
		try {
			Double plus=(double) 0;
			String p;
			double n1=Double.parseDouble(num1.getText());
			double n2=Double.parseDouble(num2.getText());
			if(e.getActionCommand().equals("plus")) {
				plus=n1+n2;
				lab3.setText("+");
			}else if(e.getActionCommand().equals("minus")){
				plus=n1-n2;
				lab3.setText("-");
			}else if(e.getActionCommand().equals("multiple")){
				plus=n1*n2;
				lab3.setText("*");
			}else if(e.getActionCommand().equals("divide")){
				plus=n1/n2;
				lab3.setText("/");
			}
			p=plus.toString();
			lab.setText(p);
			num1.setText("");
			num2.setText("");
		}catch(NumberFormatException nfe) {
			JOptionPane.showMessageDialog(this, "숫자를 입력해주세요");
		}
	
			
		}
		
	}
	

