package chapter09.EX_05;

// static 필드의 값 초기화: 클래스 내부에서 static{필드의 값을 초기화}
// 클래스명.필드명, 호출될 때 static{}이 제일 먼저 작동

class C{
	int a;
	static int b;
	
	static {				// 클래스가 클래스영역에 로드될 때 제일 먼저 작동 / 생성자와 같은 역할
		// a = 10;				// 인스턴스 필드는 초기화할 수 없음 <오류 발생>
		b = 5;
		System.out.println("클래스 C가 로딩되었습니다.");
	}
	
	C(){					// 생성자: 객체 생성 시 필드의 초기값을 할당
		a = 3;				// 인스턴스 필드 초기화
		b = 55;				// 정적 필드 초기화
	}
}

public class Using_StaticMethod_03 {
	
	
	int a = 100;
	static int b = 200;
	
	void abc() {
		System.out.println("abc()-인스턴스");
	}
	static void bcd() {
		System.out.println("bcd()-정적");
	}

	public static void main(String[] args) {
		// 객체 생성없이 static필드 호출
		
		System.out.println(C.b);
		
		// System.out.println(a);				// 인스턴스 필드 <오류 발생>
		System.out.println(b);
		
		// abc();
		// 인스턴스 메소드
		bcd();									// 정적 메소드

	}

}
