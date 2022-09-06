package chapter04.EX05;

public class Using_While_01 {

	public static void main(String[] args) {
		/* while: (조건){
			실행문;
			}
		*/
		
		// *while: 반복 횟수를 알 수 없는 경우 사용
		// *for: 반복 횟수를 알 수 있는 경우 사용
		
		// - 초기값 선언을 반드시 while구문 밖에서 해야한다.
		// - while 내에서 초기값 선언 시 > 무한루프
		// - 증가값은 while 내에서 선언한다.   < 증가값을 선언하지 않을 경우 무한루프
		
		// 1. while구문에서 반복 횟수가 0인 경우
		
		System.out.println("----- 반복 횟수 0 -----");
		int a = 0;   // 변수의 초기값은 while문 밖에서 선언
		while (a<0) {   // false > 실행 X
			System.out.print(a+" ");   // while문: 조건 true일 때만 실행
		}
		
		// 2. while구문에서 한 번 반복되는 경우 
		
		System.out.println("----- break; 사용 -----");
		
		a = 0;
		while (a==0) {
			System.out.print(a + " ");
			System.out.println();
			break;
		}
		
		System.out.println("----- 반복 횟수 1(증가값 사용) -----");   // 조건을 false로 만들어 멈춤
		
		a = 0;
		while (a==0) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();   // Enter
		System.out.println("----- 반복 횟수 10 -----");
		
		a = 0;   // 초기값은 반드시 while 밖에서 선언해야함
		while (a<10) {
			System.out.print(a+" ");
				a++;   // 증가값은 while문 내에서 처리 (while문을 빠져나오도록 증가값을 넣거나 break; 사용 필요)
		}
		
		System.out.println();
		System.out.println("----- 초기값을 while문 내에 넣는 경우: 무한루프 -----");
		
		
		while (a<10) {
			a = 0;   // 초기화 값을 while문 내에서 선언 > 무한루프
			System.out.print(a+" ");
				a++;   
		}
		// while문은 조건을 생략할 수 없음.
		// for문 조건 생략 > 무한루프 
		// while문에서 무한루프 돌릴 때 조건에 true
		
		System.out.println();
		System.out.println("----- 무한루프 -----");
		
		a = 0;
		boolean b;
		b = true;
		while(b) {
			System.out.print(a + " ");
				a++;
				if(a>200) {
					break;
				}
		}
		
	}
}
