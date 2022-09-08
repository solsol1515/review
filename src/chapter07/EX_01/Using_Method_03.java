package chapter07.EX_01;

public class Using_Method_03 {

	// 인스턴스 필드: 객체화 필요(객체화 해야만 사용 가능)
	int c;					// 인스턴스 필드: static 키가 붙지 않는 필드(객체화를 해야 사용 가능)
	int d;					// 인스턴스 필드
	
	// static 필드: 객체화 불필요(객체화 하지 않아도 바로 사용 가능)
	static int e;
	static int f;
	
	// 인스턴스 메소드: 객체화 해야만 사용 가능
	void abc() {			// main 메소드에서 선언하면 안됨
		System.out.println("abc() 메소드 호출");
	}
	
	// static 메소드: 객체화하지 않고도 호출 가능
	static void def() {
		System.out.println("def() 메소드 호출");
	}
	
	// static 메소드 내부에 인스턴스 필드나 메소드 사용 불가(객체화 시켜야 사용 가능)
		// 
	
	public static void main(String[] args) {
		// main 메소드도 method이다.
		
		int a;					// 지역변수 ← Stack에 저장, Stack영역을 강제로 초기화 안됨
									// Stack에 값이 저장, main() 메소드 내에서만 사용됨
		// System.out.println(a);		// 초기값 설정이 안돼서 오류 발생 (사용 시 초기값이 있어야함)
		
		a = 10;
		System.out.println(a);			// 10 출력
		
		// main 메소드 내부의 메소드 선언 불가
		// class 블락에서 선언되어야 함
		/* 오류 발생
		    void abc() {
			System.out.println("안녕하세요");
			}
		 */
		
		// 필드명, 메소드명 앞에 "static" 키가 적용되어 있으면 객체 생성없이 호출 가능
			// static 메소드 내에서는 인스턴스 필드 or 인스턴스 메소드 사용 불가
			// static 메소드 내에서는 static 필드 or static 메소드 사용 가능
		
		// c = 5;	// 인스턴스 필드	// 오류 발생(static 메소드 내부에서 인스턴스 필드 직접 호출(X))	
		e = 10;						// 같은 클래스 내에서 직접 호출, static 필드 호출
		
		// abc();					// 인스턴스 메소드 → 오류 발생
		def();						// static 메소드 (직접 호출)
			
			
		
	}

}
