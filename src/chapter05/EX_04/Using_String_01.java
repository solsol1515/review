package chapter05.EX_04;

public class Using_String_01 {

	public static void main(String[] args) {
		// String: 참조 데이터 타입, 문자열 처리, 특별한 기능 많이 들어있음
		
		// 1. 객체 생성을 사용해서 값을 할당 (객체의 주소는 별개로 작동)
		String str1 = new String("안녕");
						// new는 Heap 메모리에 값을 할당
						// String(): 생성자의 매개변수에 "안녕" 문자열 할당
		System.out.println(str1);									// 안녕
		
		String str11 = new String("안녕");
		
		System.out.println(str1==str11);							// str1과 str11의 객체의 주소를 비교 // false(두 객체의 번지수가 다름)
		System.out.println(str1.equals(str11));						// str1과 str11의 객체의 값 비교 // true(두 객체의 값이 같음)
		
		System.out.println("----- 2. 리터럴로 값 할당 -----");
		
		// 2. 리터럴로 값을 할당(객체의 주소(번지)를 공유)
			// 리터럴: 변수에 들어가는 값을 통칭
		String str2 = "안녕하세요";
		System.out.println(str2);									// 안녕하세요
		
		String str3;
		String str22 = "안녕하세요";												
		
		System.out.println(str2==str22);							// str2와 str22는 동일한 번지를 가짐 // true
		System.out.println(str2.equals(str22));						// 객체의 값 비교 // true
		
		System.out.println("----- ");

	}

}
