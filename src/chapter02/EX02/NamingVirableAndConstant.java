package chapter02.EX02;

public class NamingVirableAndConstant {

	public static void main(String[] args) {
		
		/*변수의 이름 부여_ 변수: 값 변경 가능
			- 변수 이름: 영문, 한글 사용 가능 (한글은 권장사항 X)
			- 첫자는 소문자 
			- 특수문자: _, $ 사용가능
			- 첫자에 숫자 올 수 없음. 
			- JAVA의 Keyword(예약어)는 올 수 없음. (int, double, String...)
		*/
		
		boolean aBcD;   //aBcD 변수에는 true, false
		aBcD = true;
		System.out.println(aBcD);   // true
		aBcD = false;
		System.out.println(aBcD);   //false
		byte 가나다;    // 사용은 가능하나 권장 사항 아님.
		short _abcd;   // 특수문자는 _, $ 사용 가능. (다른 특수문자 입력 시, 오류)
		char $ab_cd;   
		double main;   // 메소드 이름을 변수 이름으로 사용 가능, 
						// 사용 방법이 달라서 사용가능 
		// float int;   // 예약어를 변수명으로 사용하면 오류 발생
						// * class, int, double, char, byte...
		String myClassName;   //  첫단어는 소문자, 여러 단어가 묶여있을 때_첫 단어 대문자
		
		/*
		 	상수의 이름 부여_ 상수: 값 변경 불가
		 		- 대문자로 처리 (변수는 소문자)
		 		- 변수 선언문 앞에 final 키워드를 사용.
		 		
		 */
		
		final double PI;
		PI = 3.141592;
		
		System.out.println(PI);
		
		// PI = 1234.00;   // 상수는 값을 수정할 수 없다. 
		System.out.println(PI);
		
		final int MY_DATA;   // 상수 (규칙)
		int myData;   // 변수 
		
		
			
		

	}

}
