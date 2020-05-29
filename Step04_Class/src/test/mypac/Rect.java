package test.mypac;

//사각형의 정보를 담을 수 잇는 rect 클래스
public class Rect {
	//non static 필드
	public int width;
	public int height;
	
	//사각형의 면적을 리턴해주는 non static 메소드
	//int 값을 리턴해주는 메소드
	//void는 어떤 값도 리턴해 주지 않는다고 선언하는 것이며 메서드에 부여한다.
	public int getArea() {
		int area= this.width*this.height;
		return area;
	}
}
