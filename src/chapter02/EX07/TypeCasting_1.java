package chapter02.EX07;

public class TypeCasting_1 {

	public static void main(String[] args) {
		// 1. 캐스팅 방법 
		// 	- 캐스팅 방법 1 (데이터 타입 명시)
		int value1 = (int)5.3;   // 5 (다운캐스팅 할 경우, 값이 소실될 수 있음)
		long value2 = 10;   // int 10 > long 타입 자동 업캐스팅
		float value3 = (float)5.8;   // double 5.8 > float타입 다운캐스팅
		double value4 = 16;   // int 16 > double 자동 업캐스팅
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println("=============");
		// 	- 캐스팅 방법 2 (L, F)
		// 정수 리터럴 기본: int, 실수 리터럴 기본: double
		long value5 = 10L;
		long value6 = 10l;
		float value7 = 5.8F;
		float value8 = 5.8f;
		
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		
		
	}

}
