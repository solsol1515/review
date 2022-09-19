package basic_01;

public class Ex02_ShortCircuitLogic2 {

	public static void main(String[] args) {

		int a = 3;
		
		if(a>3 && ++a>3) {
			System.out.println("조건 만족");			// Short Circuit 작동 → 출력 X
		}
		System.out.println("a= "+a);				// a = 3
		
		if (a>1 || ++a>3) {
			System.out.println("조건 만족2");			// Short Circuit 작동 → 조건 만족2 출력
		}
		System.out.println("a = "+a);				// a = 3
		
		// Short Circuit 사용 X (요즘 추세)
		
		if(a>3 & ++a>3) {
			System.out.println("조건 만족");			// 출력 X
		}
		System.out.println("a= "+a);				// a = 4
		
		if (a>1 | ++a>3) {
			System.out.println("조건 만족2");			// 조건 만족2 출력
		}
		System.out.println("a = "+a);				// a = 5
		
		
	}

}
