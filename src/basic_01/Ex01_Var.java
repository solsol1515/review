package basic_01;

// import java.lang.*;					// 자동으로 들어옴

/*
 * 자료형(data type)
 * 
 * 1. 기본형
 * 		boolean
 * 		char
 * 		int / long
 * 		double
 * 
 * 2. 참조형
 * 		클래스
 * 		배열
 * 		→ new 예약어를 통해 객체 생성 (필요)
 * 
 * (*) String
 * 
 * */

public class Ex01_Var {	// extends Object{ 자동으로 들어옴
	// * 멤버변수
	String a = null;					// 자동 초기화
	int b = 0;
	
	public static void main(String[] args) {
		
		
		// * 지역변수
		
		// 문자열 변수 a 선언
		String a = null;				// 초기화 하는 습관 들이기 !!! 
		// 정수 변수 b 선언
		int b = 0;
		
		// 변수 a에 "Hello" 지정
		a = "Hello";
		// ***** 
		// a = new String("Hello")		// 선생님 정답 
		// 변수 b에 200대입
		b = 200;
		
		// 변수 a와 b 콘솔에 출력
		System.out.println(a);
		System.out.println(b);
	}

}
