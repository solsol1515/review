package chapter10.EX_09;

// this(): 자신의 객체의 생성자 호출, 생성자 내부의 첫 라인에 위치

// super(): 상속관계, 부모 클래스의 생성자 호출, 생성자 내부에서 첫 라인에 위치
	// 자식 클래스는 생성자 내부의 첫 라인에 this() or super() 중에 하나가 반드시 와야한다.
		// 생략 시, super(), 부모의 기본 생성자가 생략되어 있다. 

class A{
	A(){
		this(3);
		System.out.println("A 기본 생성자-A()");
	}
	A(int a){
		System.out.println("A의 매개변수 1개인 생성자-A(10)");
	}
}

class B extends A{
	B(){
		this(3);
		System.out.println("B의 기본 생성자-B()");	
	}
	B(int a){			// super(), 부모의 기본 생성자 호출이 생략됨
	
		System.out.println("B의 매개변수 1개인 생성자");
	}
}


public class Using_Super_03 {

	public static void main(String[] args) {
		
		// 1. A 객체 생성
		A aa1 = new A();			// A의 매개 변수 1개-A(10) → A 기본 생성자-A 순서로 출력 

		System.out.println("----- 1 -----");
		
		A aa2 = new A(3);			// A의 매개 변수 1개-A(10)
		
		System.out.println("----- 2 -----");
		
		// 2. B 객체 생성
		B bb1 = new B();
		
		
		
	}

}
