package test.main;
/*
 *  2. 증감 연산자 테스트
 */
public class MainClass02 {
	public static void main(String[] args) {
		int num=0;
		num++; 
		num++;
		num++;
		System.out.println(num);//3이 찍힌다
		int num2=0;
		num2--; 
		num2--;
		num2--;	
		System.out.println(num2);//-3이 찍힌다
		int num3=0;
		int result1 = num3++; 
		System.out.println(result1);//대입연산이 먼저일어나고 1이 증가한다 연산순위가 가장늦다.
		int num4=0;
		int result2 = ++num4;
		System.out.println(result2);//증가하고 대입이된다
	}
}












