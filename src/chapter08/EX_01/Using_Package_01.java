package chapter08.EX_01;

public class Using_Package_01 {

	public static void main(String[] args) {
		  
		System.out.println("--- A클래스 접근(public) ---");
		// A클래스와 같은 패키지에 존재: import없이 바로 접근 가능 
		A a = new A();
		
		System.out.println(a.m);					// 접근 가능 (3출력)
		System.out.println(a.n);					// 접근 가능 (4출력)
		a.print();									// 접근 가능 (임포트 test출력)
		
		System.out.println("--- B클래스 접근(dafault) ---");
		// B클래스와 같은 패키지에 존재: import없이 바로 접근 가능
		B b = new B();
		
		System.out.println(b.a);
		System.out.println(b.b);
		b.print();

	}

}
