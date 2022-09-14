package chapter08.EX_02;

// import 사용하지 않고 외부 패키지 접근: 클래스 전체 이름 사용 (패키지명+클래스명)
	// A클래스(public): 접근 가능, B클래스(default): 접근 불가

public class Using_Package_03 {

	public static void main(String[] args) {
		
		// 전체 이름: 패키지명.클래스명
		chapter08.EX_01.A a = new chapter08.EX_01.A();
		
		System.out.println(a.m);						// 외부 패키지에서 접근 가능(public)
		System.out.println(a.n);						// 외부 패키지에서 접근 가능(public)
		
		a.print();										// 외부 패키지에서 접근 가능(public)
			
	}
	
}
