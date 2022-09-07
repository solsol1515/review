package chapter07.EX_01;

class A{
	
	// 필드
	int m = 3;
	int n = 4;
	
	// 기본 생성자 생략됨				A () {} 
	
	// 메소드 1
	void work1 () {
		int k = 5;								// 지역변수
		System.out.println(k);					
		work2 (3);								// work2 (3) 메소드 호출
	}
	
	// 메소드 2
	void work2(int i) {
		int j = 4;
		System.out.println(i+j);
	}
}

public class Using_Field {

	public static void main(String[] args) {
		
		// 객체 생성
		A a = new A();							// 기본 생성사 호출, 생략되어 있음
		
		// 필드값 출력
		System.out.println(a.m);				// 3 출력
		System.out.println(a.n);				// 4 출력
		
		System.out.println("----- 메소드 호출 -----");
		
		// 메소드 호출
		a.work1();								// 5, 7 출력 
		
		
	}

}
