package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

//메뉴아이템-메뉴-메뉴바- 프레임에 setmenubar 순으로 add 해준다
public class Quiz04 extends JFrame implements ActionListener {
	JTextArea ta;

	public Quiz04() {
		setLayout(new BorderLayout());
		setTitle("나의 파일");
		JMenuItem item_new = new JMenuItem("new");
		JMenuItem item_open = new JMenuItem("open");
		JMenuItem item_save = new JMenuItem("save");

		// 액션 커맨드 지정
		item_new.setActionCommand("new");
		item_open.setActionCommand("open");
		item_save.setActionCommand("save");
		// 아이템에 액션리스너등록
		item_new.addActionListener(this);
		item_open.addActionListener(this);
		item_save.addActionListener(this);

		// 메뉴아이템 추가
		JMenu menu1 = new JMenu("File");
		menu1.add(item_new);
		menu1.add(item_open);
		menu1.add(item_save);

		JMenu menu2 = new JMenu();
		menu2.setText("도움말");

		// 메뉴바 추가
		JMenuBar bar1 = new JMenuBar();
		bar1.add(menu1);
		bar1.add(menu2);

		setJMenuBar(bar1);
		// textarea 만들기
		ta = new JTextArea();
		add(ta, BorderLayout.CENTER);
		ta.setBackground(Color.ORANGE);
		ta.setVisible(false);
	

		// 파일 지정하기

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("new")) {
			ta.setText("");
			ta.setVisible(true);
			ta.grabFocus();
		} else if (e.getActionCommand().equals("open")) {
			ta.setText(""); 
			openContent();
		} else if (e.getActionCommand().equals("save")) {
			saveContent();
			ta.setText("");
		}

	}

	public static void main(String[] args) {
		Quiz04 f = new Quiz04();
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// 파일 저장 메서드
	public void saveContent() {
		// textArea의 string을 가져와서 memo에 담음
		String memo = ta.getText();
		// 파일선택 객체를 생성함
		JFileChooser fc = new JFileChooser("C:\\acorn2020\\visual_work\\MyFolder");
		JOptionPane.showMessageDialog(this, "저장할 때는 확장자를 꼭 입력해주세요! ");
		// savedialog 창을 띄움
		int result = fc.showSaveDialog(this);

		if (result == JFileChooser.APPROVE_OPTION) {
			// 새로 만들 예정인 객체의 참조값 얻어오기
			File file = fc.getSelectedFile();

			// 파일에 문자열을 출력할 수 있는 객체생성
			try {
				// 파일 객체에는 문자열을 추가 할수 없기때문에
				// filewriter 객체의 인자로 file 객체를 넣어줌으로 문자열을 읽을 수 있게해준다.
				FileWriter fw = new FileWriter(file);
				fw.write(memo);
				fw.flush();
				fw.close();
				JOptionPane.showMessageDialog(this, file.getName() + " 가 저장되었습니다");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void openContent()  {
		JFileChooser gfc=new JFileChooser("C:\\acorn2020\\visual_work\\MyFolder");
		int result= gfc.showOpenDialog(this);
		if(result==JFileChooser.APPROVE_OPTION) {
			File File=gfc.getSelectedFile();
			try {
				FileReader fr=new FileReader(File);
				BufferedReader bfr=new BufferedReader(fr);
				while(true) {
					String line=bfr.readLine();
					if(line==null) {
						break;
					}
					//JTextArea에 문자열 개행기호 추가
					ta.append(line);
					ta.append("\r\n");
				}
				ta.setVisible(true);
				bfr.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
