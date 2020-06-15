package test.main;

import test.mypac.Drill;

/*
 * 메소드를 호출하면서 동작 하나를 전달한다 
 */
public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			
			@Override
			public void hole() {
				System.out.println("바닥에 구멍을 뚤어");
				
			}
		});
		Drill d1=()->{
			System.out.println("벽에 20mm 의 구멍내기");
		}; 
		//위의 것과 같은 내용
		//인터페이스에 메소드가 하나인경우에 사용 가능
		useDrill(d1);
		useDrill(()->{});
		//usDrill을 콜할때 수행할 익명함수.
	}
	public static void useDrill(Drill d) {
		d.hole();
	}
}
