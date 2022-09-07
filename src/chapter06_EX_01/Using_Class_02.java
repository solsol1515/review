package chapter06_EX_01;

// 클래스(붕어빵 기계)와 객체(붕어빵)의 차이점
	// 클래스: 객체를 만들기위한 틀, 붕어빵 기계, 설계도 
		// 필드: 클래스 블락에서 선언된 변수(멤버변수)
		// 생성자
		// 메소드: 메소드 내부에 선언된 변수(지역변수)
		// 이너클래스
	// 객체: 클래스를 틀로 사용해 만들어진 RAM에 로드된 것, 붕어빵, 설계도로 만들어진 건물 

	// 클래스를 객체로 만드는 작업을 인스턴스화

// 외부 클래스 
class A{
	
	// 필드: Heap 공간에 값이 저장됨, 값을 넣지 않은 경우 → 강제 초기화됨 
	int m = 3;
	int n = 4;
	
	// 기본 생성자: 클래스 이름과 동일한 메소드를 생성자, 리턴 타입이 없다 
		// 객체를 생성할 때, 초기값을 부여하는 역할을 한다.
	A(){}																		 
	
	// 메소드: 호출 시 작동이 됩니다.
	void print() {
		int k = 10;																// 지역변수: Stack 공간에 값이 저장됨, 값을 넣지 않을 경우 → 비어있음(공백)
		System.out.println(k);
		System.out.println(m + n);
		
	}
}

// 외부 클래스 
class B{
	
}

public class Using_Class_02 {

	public static void main(String[] args) {
		
		int aa;																	// 지역변수 
		
		// 객체 생성은 main 메소드에서 작성 
		
		// 객체 생성
		A a = new A();
		// A: 참조 변수 타입(A)
		// a: 객체(참조변수)
		// new: Heap 메모리에 값을 넣어라, 객체를 생성해라 
		// A(): 기본 생성자 호출
		
		// 객체의 필드의 내용 출력(a.m, a.n)
		System.out.println("----- 객체의 필드의 내용값 출력 -----");
		System.out.println(a.m);												// 필드의 m 값을 출력 → 3 출력
		System.out.println(a.n);												// 필드의 n 값을 출력 → 4 출력
		
		// 객체의 메소드 호출(a.print())
		System.out.println("----- 객체의 메소드 호출 -----");
		a.print();																 // 10과 7 출력 (k, m+n 값 출력)
		
		System.out.println("-----");
		
		// A class: 틀 → 객체화
		
		// A class를 틀로 사용해서 b라는 객체를 생성
		A b = new A();
		
		//  객체의 필드의 값을 수정 
		b.m = 30;																 // 필드의 값을 30으로 수정
		b.n = 40;																 // 필드의 값을 30으로 수정
		
		// 필드의 내용을 출력 
		System.out.println(b.m);												 // 30 출력
		System.out.println(b.n);												 // 40 출력
		
		// 메소드 호출: 기능을 프로그래밍한 것
		System.out.println("----- print() 메소드 호출 -----");
		b.print();																 // 10, 70 출력 
		
		System.out.println("----- A class를 틀로해서 객체를 무한정 생성 -----");
		A c = new A();															 
		
		System.out.println(c.m);												 // 3 출력
		System.out.println(c.n);												 // 4 출력
		c.print();																 // 10, 7 출력
		
		
	}

}