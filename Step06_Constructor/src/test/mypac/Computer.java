package test.mypac;

public class Computer {
	//필드
	//필드에는 메서드에 필요한 값들을 정의해 놓는경우가많고
	//필드값은 생성자의 매개변수로 사용하는 경우가 많다.
	public Cpu cpu;
	//생성자
	public Computer(Cpu cpu) {
		this.cpu=cpu;
	}
	public Computer() {
		System.out.println("기본 생성자가 호출되었습니다.");
	}
	//메소드
	public void doGame() {
		if(this.cpu==null) {
			System.out.println("cpu가 작동하지 않습니다.");
			return;
		}
		System.out.println("게임을 시작합니다");
	}
}
