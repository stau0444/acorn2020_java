package test.mypac;

/*
 * 새로운 스레드 만드는 방법
 * 
 * 1. Thread 클래스를 상속 받은 클래스를 정의한다.
 * 2.run() 메소드를 오버라이드한다.
 * 3.run() 메소드 안에서 새로운 스레드에서 해야할 작업을 코딩한다.
 * 4.만든 클래스로 객체를 생성하고 해당 객체의 start() 메소드를 호출하면 새로운 스레드가
 * 시작된다.
 */
public class CountThread extends Thread {
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
	}
}
