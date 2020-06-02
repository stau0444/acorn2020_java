package test.main;

import test.mypac.Rect;

public class MainClass06 {
	public static void main(String[] args) {
		Rect [] rects = new Rect[3];
		rects[0]=new Rect(10,20);
		rects[1]=new Rect(20,40);
		rects[2]=new Rect(30,50);
		for(int i=0; i<rects.length; i++) {
			int area=rects[i].getArea();
			System.out.println(area);
		}
	}
}



