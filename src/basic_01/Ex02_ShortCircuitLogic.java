package basic_01;

public class Ex02_ShortCircuitLogic {

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
		
		
		
		if(a>1|++a>3) {
			System.out.println("조건 만족3");			// 첫번째 조건을 만족해서 출력 (a>3)
		}
		System.out.println("a3 = "+a);				// short circuit 작동 X → ++a>3 연산 → a=4
	}

}
