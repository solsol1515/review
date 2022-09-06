package chapter02.EX08;

public class TypeCasting_2 {

	public static void main(String[] args) {
		// 1. 자동 타입 변환 (업캐스팅)
		
		float value1 = 3;   // int 3 > float 타입 자동 업캐스팅
		long value2 = 5;    // int 5 > long 타입 자동 업캐스팅
		double value3 = 7;  // int 7 > double 타입 자동 업캐스팅
		System.out.println(value3);
		
		byte value4 = 9;    // 예외) int 9 > byte
		short value5 = 11;  // 예외) int 11 > short
		
		// 2. 수동 타입 변환 (다운캐스팅)
		
		byte value6 = (byte)128;     // int > byte 수동 다운캐스팅, -128
		int value7 = (int)3.5;       // double > int 수동 다운캐스팅, 3
		float value8 = (float)7.5;   // double > float 수동 다운캐스팅, 7.5
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		
	}

}
