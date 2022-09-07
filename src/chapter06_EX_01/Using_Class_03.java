package chapter06_EX_01;

// 같은 패키지에서 class가 중복되면 오류 발생(class A, class B 생성 X)
class C {
	
	// 필드: Heap 영역에 값이 저장, 강제 초기화
	int a;				// 0
	int b;
	String name;		// null
	
	C () {}										// 기본생성자: 매개변수 값이 없고, 실행부도 없는 생성자, 생략 가능, 클래스 이름과 동일 
	
	void call() {
		int c = 18;				// 지역 변수: Stack, 강제 초기화가 되지 않으므로 반드시 기본 값을 넣고 출력 필요
		System.out.println("출력 내용입니다.");
		
		// System.out.println(c);				초기값을 할당해야함 
		int a = 10;
		int b = 20;
		String name = "한솔";
		System.out.println(name);
		System.out.println(a);
		System.out.println(b);
		
	}
	
}


public class Using_Class_03 {

	public static void main(String[] args) {
		//
		C c = new C();
		
		c.call();

	}

}
