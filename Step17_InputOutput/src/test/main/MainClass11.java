package test.main;

import java.io.File;

public class MainClass11 {
	public static void main(String[] args) {
		//c:/acorn2020/visual_work/MyFloder/에 있는 모든 내용 (파일 혹은 폴더) 삭제하기
		File f1=new File("C:\\acorn2020\\visual_work\\MyFolder");
		File[] files=f1.listFiles();
		for(File tmp:files) {
			tmp.delete();
		}
		System.out.println("c:/acorn2020/visual_work/MyFloder 안에 내용 모두 삭제");
	}
}
