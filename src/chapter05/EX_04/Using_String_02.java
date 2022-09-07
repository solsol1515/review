package chapter05.EX_04;

public class Using_String_02 {

	public static void main(String[] args) {
		// String변수에 값을 할당하는 방법
			// 1. 객체 생성방법으로 값을 할당 (생성자) // 별도의 주소 공간에 값을 할당(동일한 문자열)
			// ==: stack 공간의 값을 비교(참조 자료형인 경우: stack(주소), heap(값))
			// 						 (기본자료형: 스택(값))
			// 2. 리터럴 방식으로 값을 할당 // 주소 공간을 공유 (동일한 문자열일 경우)
			// .equals(): 참조 자료형 heap영역의 값 비교 
		
		String str1 = new String("안녕");								// 별도의 메모리 공간에 입력되어 있음 
		String str2 = "안녕";											// 리터럴로 입력 (str3와 주소 공유)
		String str3 = "안녕";											// 리터럴로 입력 (str2와 주소 공유)
		String str4 = new String("안녕");								// 별도의 메모리 공간에 입력되어 있음
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

		System.out.println("----- 비교 -----");
		
		// ==: 참조 자료형일 경우 Stack의 Heap영역 주소 비교
		System.out.println(str1==str4);								// 주소 비교 → false
		System.out.println(str2==str3);								// 주소 공유 → true
		// .equals: 참조 자료형 Heap영역의 값 비교
		System.out.println(str1.equals(str2));						// true
		System.out.println(str2.equals(str3));						// true
		System.out.println(str3.equals(str4));						// true
		
		
	}

}
