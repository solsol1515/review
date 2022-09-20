package basic_02;

public class Ex01_while개념 {

	public static void main(String[] args) {
		
		// 0. for문 
		// 1~10의 합
		int sum = 0;									// 합계 변수 선언
		for(int a=1; a<11; a++) {						// 1부터 10까지의 합 구하기
			sum+=a;										// sum = sum+a
		}
		System.out.println("1~10까지의 합(for): "+sum);	// sum 구하기 (1~10까지의 합)
		
		// 초기치를 반복 블록 위로 / 증가치를 반복문 끝으로 / 조건문만 남아서 for → while
		
		sum = 0;										// 합계 변수 초기화
		int a = 0;										// 변수 초기화
		while(a<=10) {
			sum+=a;
			a++;
		}
		System.out.println("1부터 10까지의 합(while): "+sum);
		
		// 2. do_while
		sum=0;											// 합계 변수 초기화
		a=0;											// 변수 초기화
		do {
			sum+=a;										// sum = sum + a
			a++;										// a 1씩 증가
		}while(a<11);									// 조건문 
		System.out.println("1부터 10까지의 합(do_while): "+sum);
		
		
	}
}
