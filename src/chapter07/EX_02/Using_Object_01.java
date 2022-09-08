package chapter07.EX_02;

//class 외부에 올 수 있는 것(3): 패키지, 임포트(같은 패키지에 존재하지 않는 클래스), 외부 클래스

class A {						// 클래스: 객체를 생성하기 위한 설계도
	// class 내부에 올 수 있는 것(4): 필드(클래스에서 선언된 변수), 생성자, 메소드, 내부 클래스
		// 1. 필드
		int m;					// Heap 공간에 저장, 강제 초기화됨 
		int n;					// 0
		double k;				// 0.0
		String l;				// null
	
		// 생성자: 클래스는 반드시 생성자가 존재해야 한다. 
			// 생성자 특징: 1. 클래스 이름과 동일 2. 리턴이 존재하지 않아야 한다.
			  // 기본 생성자(입력 매개변수가 없는 생성자)는 생략될 수 있다.		A () {}
			  // 객체의 초기값을 세팅
			  // 기본 생성자는 생략되어 있을 경우, 컴파일러가 자동으로 등록해 준다.
			  // 클래스 내부의 다른 생성자가 존재할 때, 컴파일러가 기본 생성자를 자동으로 만들어 주지 않음.
		A () {		// 기본 생성자?
			System.out.println("기본 생성자 호출");
		}
		
		// 메소드: 리턴 타입 메소드명 (입력 매개 변수) {실행 코드;}
			// 프로그램의 기능을 코드로 작성
			// 호출해서 작동됨, work1()
		void work1 () {
			System.out.println("work1 메소드 호출");
		}
		
		// work2 (정수1, 정수2)
		int work2(int a, int b) {					// 지역변수: 메소드 블락에서 선언된 변수, Stack에 값이 저장됨
														// 메소드가 종료되면 없어짐 
			System.out.println("work2 메소드 호출");
			return a+b;
		}
		
		// work3 (정수, 실수, 문자열)
		double work3(int a, double b, String c) {
			System.out.println("work3 메소드 호출");
			System.out.println(a+","+b+","+c);
			return a+b;
		}
		
		String work4(String a) {
			return a;
		}
}

public class Using_Object_01 {

	public static void main(String[] args) {
		// 객체 생성: Main Method에서 생성 (클래스 복사해서 객체 생성_하나의 클래스로 여러개의 객체 생성 가능)
				
				// 객체 생성
				A a1 = new A();
				// A: 클래스
				// a1: 객체
				// new: 객체 생성, Heap에 객체 생성
				// A(): 클래스 내부의 생성자 호출, 기본 생성자: 입력 매개변수가 없는 생성자, 생략될 수 있음 
				
				// 객체의 필드값 출력
				System.out.println(a1.m);			// 0
				System.out.println(a1.n);			// 0
				System.out.println(a1.k);			// 0.0(double형)
				System.out.println(a1.l);			// null(String형)
				
				System.out.println("----- 객체의 필드 값 수정 -----");
				
				// 객체의 필드의 값을 수정
				a1.m = 10;
				a1.n = 20;
				a1.k = 30.0;
				a1.l = "안녕하세요";
				
				System.out.println(a1.m);			// 10
				System.out.println(a1.n);			// 20
				System.out.println(a1.k);			// 30.5
				System.out.println(a1.l);			// 안녕하세요
				
				System.out.println("----- work1 메소드 호출 -----");
				
				// 메소드 호출(work1())
				a1.work1();			// 매개변수가 존재하지 않는 메소드 
				
				System.out.println("----- work2 메소드 호출 -----");
				
				// 메소드 호출 (work2 (정수, 정수))
				int k = a1.work2(10, 20);	// 매개변수가 2개인 메소드 호출 ← return: a+b; 
				System.out.println(k);		// 30(return: a+b; 10+20=30)
				
				System.out.println(a1.work2(40, 50));			// 90(return: a+b; 40+50=90)
				
				System.out.println("----- work3 메소드 호출 -----");
				
				// 메소드 호출(work3 (정수, 실수, 문자열)) - 리턴은 double형으로!
				double d = a1.work3(10, 20.0, "오늘");			// 리턴받은 값을 변수에 할당 후 출력
				System.out.println(d);							// 30.0 (return: a+b; 10+20.0=30.0)
				System.out.println("-----");
				System.out.println(a1.work3(30, 30.0, "날씨"));	// 60.0 (return: a+b; 30+30.0=60.0)   // work3 메소드 호출 - 30, 30.0, 날씨 - 60.0(return)
				
				System.out.println("----- work4 메소드 호출 -----");
				
				// 메소드 호출(work4(문자열)) - 리턴은 String형으로!
				
				String s = a1.work4("안녕");
				System.out.print(s);							// return값 변수에 저장 후 출력 // 안녕
				
				System.out.println(a1.work4("하세요"));			// 인풋 값을 return 받음 // 하세요
				
				// 클래스: 객체를 생성하기 위한 설계도		  ← 클래스 영역에 로드되어 있음
				// 객체: 클래스를 기반으로 만들어진 인스턴스(객체) ← Heap에 로드됨
				// 인스턴스화: 클래스는 객체화해야 사용 가능	A a = new A();
				A a2 = new A();
				A a3 = new A();
				A a4 = new A();
				A a5 = new A();
				
				
				
	}

}
