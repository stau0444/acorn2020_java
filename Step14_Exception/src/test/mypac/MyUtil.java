package test.mypac;

public class MyUtil {
	//메소드 ㅇ
	public static void draw() {
		System.out.println("5초 동안 그림 그려");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	//발생한 예외를 던져버림 
	public static void send  () throws InterruptedException {
		System.out.println("5초 동안 전송 해요");
		Thread.sleep(5000);
		System.out.println("전송 완료");
	}
}
