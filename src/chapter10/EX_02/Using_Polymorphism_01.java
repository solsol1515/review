package chapter10.EX_02;

// 다형성(Polymorphism): 하나의 객체가 여러가지 타입을 가질 수 있다.
	// 메소드 오버라이딩을 사용해서 부모 클래스의 메소드를 재정의해서 자식 클래스에서 재사용한다.

// 상속을 사용한 다형적 표현
	// 상속관계에서 객체 생성 시, 부모 타입으로 선언 가능
	// 부모 타입으로 선언할 경우, 부모 클래스의 필드와 메소드만 사용 가능
	// 자식 객체를 생성하면서 부모 타입으로 지정하면 자동으로 업캐스팅
	// 다시 자식 클래스의 필드와 메소드를 사용하려면 다운 캐스팅 필요
	// 다운 캐스팅은 수동으로 적용

class A{}					// 부모 클래스
class B extends A{}			// 자식 클래스, 부모 A
class C extends B{}			// 자식 클래스, 부모 B
class D extends B{}			// 자식 클래스, 부모 B

public class Using_Polymorphism_01 {

	public static void main(String[] args) {
		// 자식에서 객체 생성 후 부모 타입으로 지정 가능 
		// 부모에서 객체 생성 후 자식 타입으로 지정 불가
		
		// 1. A타입의 다형적 표현
		A a1 = new A();							// A클래스는 A타입이다. (A는 A이다.)
			// a1은 A타입만 내포, A타입으로 지정
		A a2 = new B();							// B클래스는 A타입이다. (B는 A이다.)
			// a2는 A, B타입을 내포하고 있고, A타입으로 지정
		A a3 = new C();							// C클래스는 A타입이다. (C는 A이다.)
			// a3는 A, B, C타입을 내포, A타입으로 지정
		A a4 = new D();							// D클래스는 A타입이다. (D는 A이다.)
			// a4는 A, B, D타입을 내포, A타입으로 지정
		
		// 2. B타입으로 다형적 표현
		// B b1 = new A();			<오류 발생>	// A는 B이다(X)
		B b2 = new B();							// B는 B이다(O)
		B b3 = new C();							// C는 B이다(O)
		B b4 = new D();							// D는 B이다(O)
		
		// 3. C타입으로 다형적 표현
		// C c1 = new A();						// A는 C이다. (X)
		// C c2 = new B();						// B는 C이다. (X)
		C c3 = new C();							// C는 C이다. (O)
		// C c4 = new D();						// D는 C이다. (X)	<상속 관계 없음>
		
		// 4. D타입으로 다형적 표현
		// D d1 = new A();						// A는 D이다. (X)
		// D d2 = new B();						// B는 D이다. (X)
		// D d3 = new C();						// C는 D이다. (X)
		D d4 = new D();							// D는 D이다. (O)
	}

}
