package chapter07.EX_01;

class B{
	// 1. 리턴 타입이 없고(void), 입력 매개변수가 없는 메소드
	void print() {
		System.out.println("안녕");
	}
	
	// 2. 리턴 타입 int, 입력 매개변수가 없는 메소드
	int data() {		// 호출하는 곳에 정수 3을 돌려줌
		
	return 3;			// 3은 반드시 정수여야함 
	
	}
	
	// 3. 리턴 타입 double, 입력 매개변수 2개인 메소드
	double sum(int a, double b) {
		
		return a + b;
	
	}
	
	// 4. 리턴 타입 없음(void), 내부 함수를 종료함(return) 
		// 메소드 내부에서 return;을 만나면 메소드 종료 
	
	void printMethod (int m) {
		if(m<=0 || m>12) {
			System.out.println("잘못된 입력되어 메소드 종료됨");
			return ;												// 메소드 종료 
			// System.out.println("출력되지 않는 부분");					// 도달할 수 없는 코드
			
		
		}else {
			System.out.println("입력한 달은: "+m+"월달입니다.");
		}
	}
	
	boolean call() {			// call()를 호출 시, true를 돌려줌
		return true;
	}
}

public class Using_Method_01 {

	public static void main(String[] args) {
		// 메소드 사용
		
		// 객체 생성(b)
		B b = new B();
		b.print();
		System.out.println(b.data());					// 3 출력 
		
		System.out.println("----- retrurn double, 입력 매개변수 2개 -----");
		System.out.println(b.sum(3, 5.5));				// 8.5 출력
		
		System.out.println("----- return이 없고 입력이 잘못 되면 메소드 종료 -----");
		
		b.printMethod(13);								// 1 ~ 12월달만 입력 가능, 그 외에는 메소드 종료시킴
		
		System.out.println(b.call());
		
	}

}
