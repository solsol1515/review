package chapter02.EX05;

public class DataType02 {

	public static void main(String[] args) {
		//float과 double의 정밀도 (실수 기본: double)
			// float: 소수점 7자리까지 정밀도가 유지됨.
			// double: 소수점 15자리까지 정밀도가 유지됨.
		
		float f1 = 1.0000001F;   
		// float변수에 값을 저장할 때는 casting 필요
		// 변수값 앞(float) f1 or 변수값 뒤F
		// 리터럴: 변수에 저장되는 값을 호칭
		System.out.println(f1);
		
		float f2 = 1.00000001F;   // 7째자리까지만 정밀도가 유지되어 정밀도 떨어짐. (소수점 8자리)
		System.out.println(f2);
		
		System.out.println("=======================");
		
		double d1 = 1.000000000000001;
		System.out.println(d1);
		
		double d2 = 1.0000000000000001;
		System.out.println(d2);   // 15째자리까지만 정밀도가 유지되어 정밀도 떨어짐.
		
		
		
		
		
	}

}
