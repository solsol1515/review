package basic_03;

public class Ex03_CallByValue {

	public static void main(String[] args) {
									// 기본형을 함수에 보내는 것 CallByValue (원본에 영향 미치지 않음)
		int a = 10, b = 20;
		add(a, b);					// add함수로 a, b를 보낸다.
		System.out.println("(main)A = "+a+", B = "+b);		// 2 a=10, b=20
		// static method에 보냈던 값을 따로 저장해주지 않아서 소실됨 → 위의 10과 20 값이 출력됨 
	}
	static void add(int a, int b) {
		a+=b;
		System.out.println("(static)A = "+a+", B = "+b);	// 1 a=30, b=20
		
	}
}
