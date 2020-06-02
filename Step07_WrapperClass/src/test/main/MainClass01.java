package test.main;

public class MainClass01 {
	public static void main(String[] args) {
	/*
	 * [기본 data type 의 참조 data type]
	 * byte:Byte
	 * short:Short
	 * int:Integer
	 * long:Long
	 * float:Float
	 * double:Double
	 * char:Character
	 * boolean:Boolean	
	 */
		
		int num1=10;
		//스택 영역에 저장된다
		Integer num2=10;
		//힙영역에 저장된다.
		//Integer가 int를 감싸고있다.
		//num2는 참조가 가능하다
		int result1=num2+1;
		int result2=num1+num2;
		Integer result3=num1+num2;
		//참조  데이터타입이지만 기본데이터타입처럼 모든연산이가능하고 기능이 붙어있다
		String strNum=num2.toString();
		//숫자를 문자로 바꿔준다
		String strNum2="999";
		int num=Integer.parseInt(strNum2);
		String a="a";
		String b="b";
		String d=a+b;
		System.out.println(d);
	}
	
}
