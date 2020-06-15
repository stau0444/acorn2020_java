package test.main;

import test.mypac.Calculator;

public class MainClass06 {
	public static void main(String[] args) {
		//람다식으로 Calculator 인터페이스 구현
		//하나의 인터페이스로 여러개의 개체를 만들어 구현
		//public double exec(f,b); 인터페이스의 메소드를
		//람다식으로 오버라이딩하여 사용
		Calculator plus=(a,b)->a+b;
		Calculator sub=(a,b)->a-b;
		Calculator multi=(a,b)->a*b;
		Calculator divide=(a,b)->a/b;
		
		double result1=plus.exec(10,20);
		double result2=sub.exec(10,20);
		double result3=multi.exec(10,20);
		double result4=divide.exec(10,20);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		//함수에  동작을 전달하는 형식으로 사용
		useCalculator((a,b)->a+b);
		useCalculator((a,b)->a-b);
		useCalculator((a,b)->a*b);
		useCalculator((a,b)->a/b);
	}
	public static void useCalculator(Calculator c) {
		System.out.println(c.exec(10, 20));
	}
}
