package chapter09.EX_02;

import chapter09.EX_01.A;

// class D는 class A를 상속받음 (패키지 외부에서 상속 설정)
	// D클래스는 A클래스의 필드와 메소드를 상속받음

	// protected 접근 제어자: "상속 관계"가 있을 때만 외부 패키지에서 접근 가능

public class D extends A{

	public void print() {
		System.out.println("--- 부모 클래스의 필드 출력(다른 패키지) ---"); 
		System.out.println(a);						// public  		// 다른 패키지에서 접근됨
		System.out.println(b);						// protected	// 다른 패키지에서 접근됨(상속)
		// System.out.println(c);					// default
		// System.out.println(d);					// private
		
		System.out.println("--- 부모 클래스의 메소드 출력(다른 패키지) ---");
		print1();									// public
		// print2();								// protected <접근 불가>, 상속이 적용 안되어 있음
		// print3();								// default	
		// print4();								// private
		
		System.out.println("--- 상속 관계 객체 출력(D) ---");
		D d = new D ();
		
		d.print();
	
	}
	
}
