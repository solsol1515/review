package chapter08.EX_02;

// import를 사용해서 외부 패키지 접근
	// 동일한 클래스는 import로 사용 불가

import chapter08.EX_01.A;
// import chapter08.EX_01.com.A;		// 오류 발생: 동일한 클래스는 import할 수 없음
// import chapter08.EX_01.B;			// 오류 발생(접근 제어자가 default: 외부 패키지 접근 불가)

public class Using_Package_02 {

	public static void main(String[] args) {
		
		// A클래스는 동일한 패키지 내에 존재하지 않는다. (import해서 사용)
			// A클래스는 접근 제어자가  public, protected(상속 필수) 지정되어있어야 한다. 
		
		System.out.println("--- A클래스(public) ---");
		A a = new A();
		
		System.out.println(a.m);					// 다른 패키지에서 접근
		System.out.println(a.n);
		
		a.print();

		System.out.println("--- B클래스(default) ---");
		// B클래스는 다른 패키지에 존재하고, 접근 제어자를 default로 할당했기때문에 외부 패키지에서 접근 불가
		// B b = new B();
		
		System.out.println("--- com.A클래스 객체 생성 ---");
		chapter08.EX_01.com.A aa = new chapter08.EX_01.com.A();
		System.out.println(aa.aa);
		System.out.println(aa.bb);
		
		aa.print();
		
		
		
	}

}
