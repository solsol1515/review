package chapter09.EX_04;

public class Test_A {

	public static void main(String[] args) {
		
		System.out.println("--- 객체 생성 후 출력 ---");
		// 객체 생성 후 출력(인스턴스 필드, 정적 필드)
		A a1 = new A();
		System.out.println(a1.m);				// 인스턴스 필드 출력: 객체 생성 후 출력
		System.out.println(a1.n);				// (static)정적 필드 출력: 객체 생성 후 출력, 객체없이도 출력
		
		System.out.println("--- 객체 생성없이 출력 ---");
		// 객체 생성없이 출력(클래스이름.정적필드(n))
		System.out.println(A.n);				// 정적 필드 출력: "클래스명.n"
		// System.out.println(A.m);				// 인스턴스 필드: 반드시 객체 생성 후에 "객체이름.m"
		
		System.out.println("--- 정적 필드의 객체간 공유 ---");
		
		// 정적 필드는 모든 객체에서 공유하는 필드
		A a2 = new A();
			a2.m = 10;							// m: 3 → 10(인스턴스 필드: 그 객체에서만 저장됨)
			a2.n= 1000;							// n: 5 → 1000(정적 필드: 모든 객체에서 공유되는 필드)
			
		A a3 = new A();
			a3.m = 20;							// m: 3 → 20
			a3.n= 2000;							// n: 1000 → 2000
			
		A a4 = new A();
			a4.m = 30;							// m: 3 → 30
			a4.n= 3000;							// n: 2000 → 3000
			
		A.n = 5000;  
		
		// 객체 정보 출력
		a2.print();
		a3.print();
		a4.print();
		
	
	
	
	
	
	}

}
