package chapter05.EX_04;

public class Using_String_04 {

	public static void main(String[] args) {
		 System.out.println("----- 1. 문자열+문자열 -----");
		// 1. 문자열 + 문자열
		 
		String str1 = "안녕" + "하세요" + "!";
		System.out.println(str1);
		
		String str2 = "반갑";
		str2 += "습니다";															// str2 = str2 + "습니다"
		str2 += "!";															// str2 = str2 + "!"
		System.out.println(str2);												// 반갑습니다!
		
		System.out.println("----- 2. 문자열+기본 자료형 -----");
		// 2. 문자열 + 기본 자료형
		
		String str3 = "안녕" + 1;													// 정수"1"이 문자열로 자동 변환됨
		System.out.println(str3);												// 안녕(문자)1(정수)
		String str4 = "안녕" + String.valueOf(1);									// 정수"1"을 문자열로 변환해줌
		System.out.println(str4);												// 안녕(문자)1(문자) 
		String str5 = "안녕" + "1";												// 안녕(문자)1(문자)
		
		System.out.println("----- 3. 문자열과 기본 자료형 혼용 -----");
		// 3. 문자열과 기본 자료형 혼용
		System.out.println(1+"안녕");												// 1안녕
		System.out.println(1+2+3+"안녕");											// 6안녕 (1+2+3: 연산 → 정수+문자열(연결) → 6(연산)안녕(연결) // 연산 O → 연결
		System.out.println("안녕"+1+2+3);											// 안녕123 (문자열 → 정수(연결) → 안녕1 → 안녕12 → 안녕123)  // 연산 X → 연결
		
		
		
	}

}
