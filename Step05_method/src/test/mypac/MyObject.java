package test.mypac;
/*
 * [메소드를 만들때 고려 해야 하는것]
 * 1.접근지정자
 * 2.리턴type
 * 3.메소드명
 * 4.메소드에 전달하는 인자의 갯수와 data type
 * 아래의 클래스에서
 *  public은 접근지정자
 * 	void는  리턴 타입
 *  walk는 메소드명
 *  ()에 들어가는 것은 인자의 갯수와 데이터 type
 */
//myObjcet 클래스 정의
public class MyObject {
	public void walk(int a,String b) {
		System.out.println(a+b+"걸음을 걸어요~");
	}
	//int type을 리턴해주는 메소드
	public int getNumber() {
		int myNum=10;
		//int type을 리턴해 주어야 문법이 성립한다.
		return myNum;
	}
	//String type을 리턴해주는 메소드
	public String getGreeting() {
		String greet="안녕하세요";
		return greet;
	}
	public Car getCar() {
		Car c1 =new Car();
		return c1;
	}
	//int type을 메소드의 인자로 전달 받는 메소드
	public void setNum(int num) {
		System.out.println("num:"+num);
	}
	//String type을 메소드의 인자로 전달받는 메소드
	public void setName(String name) {
		System.out.println("name:"+name);
	}
	public void useCar(Car car) {
		System.out.println(car);
	}
	public void useSome(String name,Car car) {
		System.out.println("name:"+name);
		car.drive();
	}
	//Radio type과 Speaker type을 전달 받는 메소드
	public void doSome(Radio r,Speaker s) {
		System.out.println("doSome() 메소드가 호출되었습니다.");
	}
}
