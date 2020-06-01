package test.mypac;

public class Student {
	public void study() {
		System.out.println("공부를 해요");
	}
	public void goSchool() {
		System.out.println("학교를 가요");
	}
	
	//new Student().study new 라는 생성자 호출
	public Student() {
		System.out.println("Student 클래스의 생성자 호출됨");
	}
	/*
	 * 생성자의특징 
	 * 1.생성자는 리턴 타입이 없고  클래스명과 똑같음.
	 * 2.객체를 생성할때(new할때) 호출된다
	 * 3.객체를 생성하는 시점에 무언가 준비 작업을 할 때 유용하다.
	 * 4.생성자를 명시적으로 정의 하지 않아도 기본 생성자는 있다고 간주된다.
	 * 5.객체를 생성하는 시점에 준비해야 하는 초기값을 명시해 줄 수 있다.
	 */

}
