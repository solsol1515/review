package chapter07.EX_01;

public class Using_Method_04 {
	
	// 같은 클래스에서 메소드 호출
	// main method는 static 키가 붙은 메소드
		// static 메소드에서는 인스턴스 메소드를 직접 호출 불가능 (객체화 → 호출 가능)
		// static 메소드는 직접 호출 가능
	
	static void print() {
		System.out.println("안녕");
	}
	
	static int twice(int k) {						// 인풋 값을 2배로 돌려주는 메소드
		return k * 2;
	}
	
	static double sum(int m, double n) {			// 두 값을 받아서 더한 뒤 되돌려줌
		return m + n;
	}
	
	public static void main(String[] args) {
		// 같은 클래스 내부에서 메소드 호출
		
		print();									// 안녕 출력
		
		int a = twice(3);							// twice(3) 매개변수 k에 3을 넣어서 return으로 3*2 > 출력
		System.out.println(a);						// 6 출력
		
		double b = sum(a, 5.8);						// sum(a=6, 5.8) 6 + 5.8 = 11.8
		System.out.println(b);						// 11.8 출력
		
		
		
	}

}
