package chapter08.EX_01;

// default: 같은 패키지 내에서만 접근 가능 / 다른 패키지에서는 접근 불가

class B {								// default 생략

	int a = 10;							// default 생략
	int b = 20;							// default 생략
	
	void print() {						// default 생략
		System.out.println("B클래스 접근");
	}
}
