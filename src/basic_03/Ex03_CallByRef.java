package basic_03;

public class Ex03_CallByRef {

	public static void main(String[] args) {
		
		StringBuffer a = new StringBuffer("안녕");
		StringBuffer b = new StringBuffer("하이");
		
		add(a, b);
		System.out.println("(main)A = "+a+", B = "+b);		// 2 
		// stack 영역에서 가리키는 주소값에는 변동이 없어 void add에서 수정한 heap 영역의 값이 출력됨
	}
	static void add(StringBuffer a, StringBuffer b) {
		
		a.append(b);										// a+=b
		System.out.println("(static)A = "+a+", B = "+b);	// 1 안녕하이, 하이
		// heap 영역에 값을 저장함 (a = 안녕하이, b = 하이)
	}
}
/*
 문자열 처리 클래스 
 
 	- String
 
 	- StringBuffer / StringBuilder
 	
 	
 */
