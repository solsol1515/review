package chapter07.EX_01;

public class Using_Method_07 {
	
	static void print() {
		System.out.println("입력된 데이터가 없습니다. - 매개변수 없음");
	}
	
	static void print(int a) {
		System.out.println(a+": 값이 입력되었습니다. - 매개변수: 정수 1");
	}
	
	// 위의 메소드와 시그니처가 같음: 메소드명(print) 매개변수 타입(int_정수) 매개변수 개수(1개)
	/*static void print(int c) {
		// 매개변수의 타입과 개수가 같아서 오류 발생: 시그니처가 같음(메소드명, 매개변수의 타입, 매개변수 개수)
	}
	*/
	
	static void print(double a) {
		System.out.println(a+": 값이 입력되었습니다. - 매개변수: 실수 1");
	}

	static void print(double a, double b) {
		System.out.println(a+","+b+": 값이 입력되었습니다. - 매개변수: 실수 1 실수 1");
	}
	
	static void print(int a, int b) {
		System.out.println(a+","+b+": 값이 입력되었습니다. - 매개변수: 정수 1 정수 1");
	}
	
	static void print(int a, double b) {
		System.out.println(a+","+b+": 값이 입력되었습니다. - 매개변수: 정수 1 실수 1");
	}
	
	/*위의 메소드와 시그니처가 동일(메소드명, 입력 매개변수의 타입, 매개변수의 개수)
	static int print(int c, double d) {
		System.out.println("시그니처가 중복됨");
	}
	*/
	
	public static void main(String[] args) {
		/* 메소드 오버로딩 (Method Overloading) 
			: 동일한 메소드 이름에 대해서 시그니처가 다른 경우 메소드로 인식
			시그니처(식별자): 메소드명, 입력매개변수 타입, 입력매개변수 개수
				* 리턴타입은 시그니처가 아님
		*/ 
		// 메소드 오버라이딩 (Method Overriding): 상속
		// 		: 부모 클래스에서 정의된 메소드를 자식 클래스에서 재정의해서 사용하는 것
		
		// 매개변수 없는 메소드 호출: print()
		print();
		
		System.out.println("----- 매개변수: 정수 -----");
		// 매개변수: print(정수);
		print(10);
		
		// 매개변수: print(실수);
		System.out.println("----- 매개변수: 실수 -----");
		print(20.0);
		
		//매개변수: print(정수, 정수);
		System.out.println("----- 매개변수: 정수 정수 -----");
		print(30, 40);
		
		// 매개변수: print(실수, 실수);
		System.out.println("----- 매개변수: 실수 실수 -----");
		print(10.1, 20.1);
		
		//매개변수: print(정수, 실수);
		System.out.println("----- 매개변수: 정수 실수 -----");
		print(10, 20.0);
		
	}

}
