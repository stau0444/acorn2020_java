package test.main;

import javax.swing.JFrame;

public class MainClass01 {
	public static void main(String[] args) {
		//int type 5개를 저장하고 있는배열
		int[] nums= {10,20,30,40,50};
		//double type 5개를 저장하고 있는배열
		double[] nums2= {10.1,10.2,10.3,10.4,10.5,10.6};
		//boolean type 5개를 가지고 있는 배열
		boolean[] truth= {true,true,true,false,false};
		//String type (참조데이터type) 5개를 저장 하는 배열
		String[] names= {"asd","해골","원숭이","주뎅이","덩어리"};
		
		int result1=nums[0];
		double result2=nums2[0];
		boolean result3=truth[0];
		String result4=names[0].toUpperCase();
		//자바에서는 사용될 방의 갯수가 정해지거나 하는 것이아니면 배열의 사용하지 않는다.
		System.out.println(result4);
		//String을 담은 배열에는 참조 데이터 타입이 들어가있기 때문에 [].메소드명 으로 참조할 수가 있다.
		
		int[] cloned=nums.clone();
		int size=nums.length;
		
		System.out.println(cloned);
		System.out.println(size);
	}
}
