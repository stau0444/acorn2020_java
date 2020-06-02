package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		
		//0으로 초기화된 방3개 짜리 int[] 객체를 만들고 참조값을 변수 nums에 담기; 
		int[] nums= {0,0,0};
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		//0으로 초기화된 방3개 짜리 int[] 객체를 만들고 참조값을 변수 nums2에 담기; 
		int[] nums2=new int[3];
		//위에 것과 같다.
		nums2[0]=100;
		nums2[1]=200;
		nums2[2]=300;
	}
}
