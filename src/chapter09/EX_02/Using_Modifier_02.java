package chapter09.EX_02;

import chapter09.EX_01.A;

// A클래스와 다른 패키지에 존재하는 클래스: import 사용



public class Using_Modifier_02 {

	public static void main(String[] args) {
		
		// import 완료
		A a = new A();							// control + shift + o (임포트 입력)

		// 필드 접근
		System.out.println(a.a);				// public
		// System.out.println(a.b);				// protected(상속) <접근 불가> 다른 패키지에서 접근할 경우 상속관계 
		// System.out.println(a.c);				// default <접근 불가>
		// System.out.println(a.d);				// private <접근 불가>
		
		// 메소드 접근 
		a.print1();								// public
		// a.print2();								// protected <접근 불가>
		// a.print3();								// default <접근 불가>
		// a.print4();								// private <접근 불가>
		
	}

}
