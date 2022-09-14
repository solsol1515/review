package chapter09.EX_03;

// 기존 클래스의 외부 클래스 생성: 다른 패키지에서 접근이 불가
	// 간단하게 외부 패키지에서는 접근이 불가, 같은 패키지에서만 사용할 경우

// 외부 패키지에서 A클래스를 사용하도록 할 때는 별도의 파일로 생성

class A{							// default (접근 지정자 생략)_ 다른 패키지에서는 접근 불가
	
	int m = 10;
	int n = 20;
	
	void print() {
		System.out.println(m+", "+n);
	}
	
}

public class Using_Modifier_10 {

	public static void main(String[] args) {
		// 
		A a = new A();
		a.print();
		
		B b = new B();
		b.print();
		
	}

}
