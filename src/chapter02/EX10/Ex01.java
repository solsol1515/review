package chapter02.EX10;

public class Ex01 {

	public static void main(String[] args) {

		// 각 변수의 평균값 구하기.
		
		int aa =80;
		int bb = 90;
		int cc = 100;
		double dd =  75.5;
		double ee = 60.3;
		
		double data3 = (aa + bb + cc + dd + ee)/5.0;
		
		System.out.println("각 과목의 평균값은: " + data3);
		System.out.printf("각 과목의 평균값은: %4.2f \n", data3);
		System.out.printf("각 과목의 평균값은: %3.1f", data3);
			
	}

}
