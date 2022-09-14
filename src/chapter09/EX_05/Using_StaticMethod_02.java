package chapter09.EX_05;

class B{
	
	int a = 10;						// 인스턴스 필드
	static int b = 20;				// 정적 필드
	
	void abc() {					// 인스턴스 메소드: 객체 생성 후 사용
										// 인스턴스 필드, 정적 필드, 인스턴스 메소드, 정적 메소드 
		System.out.println("인스턴스 메소드-abc()");
		System.out.println(a);		// 인스턴스 필드
		System.out.println(b);		// 정적 필드
		cde();						// 인스턴스 메소드
		bcd();						// 정적 메소드
	}
	
	static void bcd() {				// 정적 메소드: 객체 생성 호출, 객체 생성없이 호출
										// 정적 필드, 정적 메소드
	// * 정적 메소드는 객체 생성없이 사용 가능, 인스턴스 필드나 메소드는 객체 생성해야만 사용 가능(→ 정적 메소드 내부에 포함될 수 없음)	
		System.out.println("정적 메소드-bcd()");
		
		// System.out.println(a);	// 인스턴스 필드(X) <오류 발생>
		System.out.println(b);		// 정적 필드(O)
		// cde();					// 인스턴스 메소드(X) <오류 발생>
		def();						// 정적 메소드(O)
	}
	
	void cde() {					// 인스턴스 메소드
		System.out.println("인스턴스 메소드-cde()");
	}
	
	static void def() {				// 정적 메소드
		System.out.println("정적 메소드-def()");
	}
	
	
}

public class Using_StaticMethod_02 {

	public static void main(String[] args) {
		// 객체 생성없이 바로 호출 가능: static필드, static메소드
			// 클래스명.필드명, 클래스명.메소드명{}
		
		// 객체 생성
		B b = new B();     
                                             
		System.out.println("--- static:객체 생성없이 호출 ---");
		// System.out.println(B.a);				// 인스턴스 필드
		System.out.println(B.b);
		// B.abc();								// 인스턴스 메소드
		B.bcd();								// 정적 메소드
		// B.cde(); 							// 인스턴스 메소드
		B.def();								// 정적 메소드 
		
		System.out.println("--- 객체 생성 후 필드 --- 메소드 호출");
		// 인스턴스 필드, 정적 필드 모두 호출됨.
		
	}
	

}
