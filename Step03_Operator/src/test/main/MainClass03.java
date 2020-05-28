package test.main;
/*
 *  3. 비교연산자 테스트
 */
public class MainClass03 {
	public static void main(String[] args) {
		//연산한 위치는 불리언값으로 바뀐다.
		boolean result1 = 10 == 10; //true
		boolean result2 = 10 != 10; //false
		boolean result3 = 10 > 100; //false;
		boolean result4 = 10 >= 10; //true
		boolean result5 = 10 < 100; //true
		boolean result6 = 10 <= 10; //true	
		
		String name=null; //빈상태를 가르킨다.
		//null 인지 아닌지 비교가 가능하다(즉 java에서 null값은 비었는지 안비었는지를 확인하는 용도로 사용);
		boolean result7 = name == null; //true
		boolean result8 = name != null; //false
	}
}























