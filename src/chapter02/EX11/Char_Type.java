package chapter02.EX11;

public class Char_Type {

	public static void main(String[] args) {
		// char 데이터 타입: 하나의 문자만 저장
		// 		- 문자, 숫자, 유니코드로 저장할 수 있음.
		//		- '' 사용해서 저장 
		// 		- 2문자 이상 넣을 수 없음. > String으로 여러 문자 저장 ("")
		
		// 유니코드(2byte): 전세계 모든 문자를 16진수로 표기
		
		
		// 1. 문자로 저장하는 방법: ''
		char value1 = 'A';
		char value2 = '가';
		char value3 = '3';   // 3이라는 문자를 뜻함 (숫자 3 X)
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3); 
		System.out.println("====================");
		
		// 2. 정수로 저장하는 방법
		char value4 = 65;   	// A <== 65
		char value5 = 0xac00;   // 0x: 16진수 표현, 가 <== 0xac00
		char value6 = 51;  		// 3 <== 51
		
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		System.out.println("====================");
		
		// 3. 유니코드 형식으로 저장하는 방법: (\\u유니코드); '' 사용
		char value7 = '\u0041';   // A
		char value8 = '\uac00';   // 가
		char value9 = '\u0033';   // 3
		
		char value100 = 35;   // # <== 35
		System.out.println(value100);
		
		char value101 = '\uac12';   // 값 <== ac12
		System.out.println(value101);
		System.out.println("===================");
		
		// 구글 검색 사용해서 자신의 이름의 유니코드를 찾아서 char에 저장해 출력
		
		char a1 = '\uBC15';
		char b1 = '\uD55C';
		char c1 = '\uC194';
		System.out.printf("%s%s%s", a1, b1, c1);
		System.out.println();
		
		// 문자 A를 저장하는 다양한 방법
		char a = 'A';   // A <== 65
		char b = 65;    // 정수로 저장 (10진수)
		char c = 0b1000001;   // 0b 뒤에 오는 값은 2진수
		char d = 00101;   // 0 뒤에 오는 값은 8진수 
		char e = 0x0041;  // 0x 뒤에 오는 값은 16진수
		char f = '\u0041'; // 유니코드로 값 할당
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		

		System.out.println("============");
		System.out.println(a);
		System.out.println((int)a);   // int로 문자'A'를 아스키코드로 나타냄
	}

}
