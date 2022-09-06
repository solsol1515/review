package chapter02.EX03;

public class RangeOfVariableUse02 {

	public static void main(String[] args) {
		// 변수의 생존 범위
		int value1 = 3;
		if (value1 >1) {
			int value2 = 5;
			
			System.out.println(value1);   // 3
			System.out.println(value2);   // 5
		}
		
		System.out.println(value1);   // 3
		// System.out.println(value2);   // 오류 발생
	}

}
