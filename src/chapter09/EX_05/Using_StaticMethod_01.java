package chapter09.EX_05;

	// 메소드 이름 앞에 static이 X 메소드: 인스턴스 메소드(객체 생성 후 호출)
	// 메소드 이름 앞에 static이 O 메소드: 정적(static) 메소드(객체 생성 후 호출, 객체 생성없이 호출)

class A {
	
	void abc() {
		System.out.println("인스턴스 메소드");
	}
	static void bcd() {
		System.out.println("정적 메소드");
	}
}

public class Using_StaticMethod_01 {

	public static void main(String[] args) {
		
		System.out.println("--- 정적 메소드 ---");
		// 객체 생성없이 바로 호출: 정적 메소드 (클래스명.메소드명())
		// A.abc();			// 인스턴스 메소드: 객체 생성 → 객체명으로 호출 <오류 발생>
		A.bcd();
		
		System.out.println("--- 인스턴스 메소드 ---");
		// 객체 생성 후 호출: 인스턴스 메소드
		A a = new A();
		
		a.abc();			// 인스턴스 메소드
		a.bcd();			// 정적 메소드

	}

}
