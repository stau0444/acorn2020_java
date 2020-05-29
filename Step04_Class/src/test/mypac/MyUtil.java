package test.mypac;

public class MyUtil {
	
	//static이 부여된 필드 생성 ( static field )
	public static String version;
	
	//send 메소드 생성 static 부여( static method )
	// static이 부여된 메소드는 사용법이 다르다
	// 스태틱영역에는 하나의 객체만 만들어진다.
	//static이 부여된 것들 은 클래스명으로 구분이된다.
	public static void send() {
		System.out.println("전송합니다.");
	}
}
