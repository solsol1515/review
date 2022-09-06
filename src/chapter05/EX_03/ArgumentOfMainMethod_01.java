package chapter05.EX_03;

public class ArgumentOfMainMethod_01 {

	public static void main(String[] args) {
	
		// main Method의 입력 매개변수 전달하기, 메소드(객체지향언어) = 함수 
		// 	- 메소드(함수)의 형식: 리턴타입 메소드명 (입력매개변수){실행부}
		//						void main (String[] args){ 실행부 }
		
		
		
		// main Method 입력 매개변수 args[i] 값을 받아서 각 변수에 할당
		
		// 안녕하세요 3 5.8 ← String[] args
		
		String a = args[0];										// 안녕하세요			args[0]
		String b = args[1];										// 3				args[1]
		String c = args[2];										// 5.8			 	args[2]
		
		System.out.println("----- 출력 -----");
		// 출력
		System.out.println(a);									// 안녕하세요
		System.out.println(b);									// 3
		System.out.println(c);									// 5.8
		
		System.out.println("----- 연결O 연산X  -----");
		// 연산(String): + (연결 연산자)
		System.out.println(b + 1);								// 31 [3(String) + 1(int) = 31(String)] 연산 X 연결 O
		System.out.println(c + 1);								// 5.81 [5.8(String) + 1(int) = 5.81(String)] 연산 X 연결 O
		System.out.println(1 + c);								// 15.8 [1(int) + 5.8(String) = 15.8(String)] 연산 X 연결 O
		
		// 숫자형식의 String → int(정수) or double(실수) 변환
			// Integer.parseInt(String 변수)
			// Double.parseDouble(String 변수)
		
		System.out.println("----- 연산 -----");
		// 연산 (형 변환 → 연산)
		int d = Integer.parseInt(b);							// b (문자형 3 → 정수형 3 변환)
		double e = Double.parseDouble(c);						// c (문자형 5.8 → 실수형 5.8 변환)
		
		System.out.println(d);									// 정수 3
		System.out.println(e);									// 실수 5.8
		
		System.out.println("----- 형 변환 → 연산 -----");
		System.out.println(d+1);								// 4 (정수 + 정수)
		System.out.println(e+1);								// 6.8 (실수 + 정수(int → double_자동으로 업캐스팅))
		
		
		
		
	}

}
