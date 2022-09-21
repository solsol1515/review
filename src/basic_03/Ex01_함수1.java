package basic_03;

public class Ex01_함수1 {

	public static void main(String[] args) {
		int a = 10, b = 20;
		
		add(a, b);								// add method에 보낼 값 a, b
	}
	static void add(int a, int b) {				// static void에서 받은 값
		// 여기에서 a, b의 값을 합해서 출력
		int sum = a + b;						// sum 변수 만들어서 합계 입력
		System.out.println("합: "+sum);			// sum 출력
	}
	
}