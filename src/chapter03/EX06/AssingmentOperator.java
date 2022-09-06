package chapter03.EX06;

public class AssingmentOperator {

	public static void main(String[] args) {

		// 대입 연산자의 축약 표현 
		/*
		 * 산술 연산의 축약 표현
		  a = a + b		a += b
		  a = a - b 	a -= b
		  a = a * b 	a *= b
		  a = a / b 	a /= b
		  
		 * 비트 연산의 축약 표현
		  a = a & b 	a &= b
		  a = a | b 	a |= b
		  
		 * 쉬프트 연산의 축약 표현
		  a = a >> b 	a >>= b
		  a = a << b 	a <<= b
		  
		 * 논리 쉬프트 연산의 축약 표현
		  a = a >>> b	a >>>= b
		  
		  
		 */
		
		int value1 = 3;
		value1 = value1 + 3;   // 대입 연산자는 제일 마지막에 적용
		System.out.println(value1);
		System.out.println("==========");
		
		int value2;   // 변수 선언
		value2 = 1;   // 변수에 값 할당: 
		
		System.out.println(value2 += 2);   // value2 = value2 + 2 = 1 + 2 // 3
		System.out.println(value2 -= 2);   // value2 = value2 - 2 = 3 - 2 // 1
		System.out.println(value2 *= 2);   // value2 = value2 * 2 = 1 * 2 // 2
		System.out.println(value2 /= 2);   // value2 = value2 / 2 = 2 / 2 // 1
		System.out.println(value2 %= 2);   // value2 = value2 % 2 = 1 % 2 // 1(나머지 값 출력)

		System.out.println(value2 <<= 2);   // value2 = value2 << 2 = 1 * 2^2 // 4 
		System.out.println(value2 >>= 2);   // valeu2 = value2 >> 2 = 1 * 2^0 // 1
	}

}
