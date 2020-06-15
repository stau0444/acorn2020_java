package test.frame10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EventObject;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet.FontAttribute;

public class Myframe extends JFrame implements ActionListener, KeyListener,FontAttribute {
	JTextField inputMsg;
	JLabel lab1;
	JList<String> list;
	DefaultListModel<String> model;
	JButton sendBtn1;
	JButton sendBtn;
	// 들어갈 값을 상수로 지정해서 오타날 가능성을 없앤다
	static final String COMMAND_SEND = "send";
	static final String COMMAND_RESET = "reset";

	public Myframe() {
		setLayout(new BorderLayout());

		// 텍스트를 입력받는 칸을 만든다()안은 범위
		inputMsg = new JTextField(15);
		inputMsg.addKeyListener(this);

		// 프레임에 추가해준다
		add(inputMsg);

		// 버튼만든다
		sendBtn = new JButton("전송");
		sendBtn1 = new JButton("삭제");

		// 프레임에추가한다
		add(sendBtn);
		add(sendBtn1);

		// 버튼을 눌렀을 때 동작하는 이벤트리스너를 this에 걸어준다.
		sendBtn.addActionListener(this);
		sendBtn1.addActionListener(this);
		lab1 = new JLabel("하이");
		add(lab1);
		sendBtn.setActionCommand("COMMAND_SEND");
		sendBtn1.setActionCommand("COMMAND_RESET");

		// JPannel 생성
		JPanel panel = new JPanel();

		// 패널에 ui 추가
		panel.add(inputMsg);
		panel.add(sendBtn);
		panel.add(sendBtn1);
		panel.setBackground(Color.CYAN);

		// JFrame에 panel 추가
		add(panel, BorderLayout.NORTH);
		JPanel panel2 = new JPanel();
		panel2.add(lab1);
		add(panel2, BorderLayout.CENTER);
		panel2.setBackground(Color.ORANGE);

		list = new JList<String>();
		model = new DefaultListModel<String>();
		list.setModel(model);
		add(list, BorderLayout.SOUTH);
		int lo = list.locationToIndex(getLocation());
		// JScrollPane 객체 생성
		JScrollPane sc = new JScrollPane(list, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		// 스크롤 페널을 프레임의 가운데에 배치하기
		add(sc, BorderLayout.CENTER);
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

		if (e.getActionCommand().equals("COMMAND_SEND")) {
			addMsg();
		} else if (e.getActionCommand().equals("COMMAND_RESET")) {
			boolean a = list.isSelectedIndex(list.getSelectedIndex());
			if (a) {
				int b = JOptionPane.showConfirmDialog(this, "삭제하시겠어요?");
				if (b == JOptionPane.YES_OPTION) {
					reset();
				}

			} else {
				JOptionPane.showMessageDialog(this, "삭제할 것을 선택해 주세요!");
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == 10) {
			addMsg();
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	public void addMsg() {
		String msg = inputMsg.getText();
		lab1.setText(msg);
		model.addElement(msg);
		inputMsg.setText("");
	}

	public void reset() {
		model.remove(list.getSelectedIndex());
	}
}
