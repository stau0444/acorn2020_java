package test.main;
//창을 만들어내는 클래스
import javax.swing.JFrame;

public class MainClass06 {
	public static void main(String[] args) {
		
	
		//창의 제목
		JFrame jf=new JFrame("황경욱");
		//창의 위치(x,y,width,height);
		jf.setBounds(100,200,500,500);
		//창을 보이게 할지 안보이게 할지
		jf.setVisible(true);
		//창을 닫았을떄 프로세스도 자동으로 종료 되도록 한다.
		//이미 만들어 놓은 상수를 인자로 받아사용한다 
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
