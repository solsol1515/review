package basic_01;


/*
 *  반복문: for / while / do_while
 * 
 * (1) for(초기치; 조건문; 증가치){
 * 			반복 구문
 * 		}
 * */


public class Ex03_For개념 {

	public static void main(String[] args) {
		
		// 1) 1~10까지 숫자 출력
		
		 for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int a=0;
		for(int i=0; i<=10; i++) {
			a+=i;
		}
		System.out.println(a);
		
		System.out.println("--- (2) 홀수합 출력 ---");
		
		// (2) 1~10 중 홀수의 합 출력
		
		a=0;										// 초기화
		 for(int i=1; i<=10; i+=2) {
			 a+=i;									// a = a + i
		 } 
		 System.out.println(a);
		 
		 a = 0;										// 초기화
		 for(int i=1; i<11; i++) {
			 if(i%2==1) {
			a+=i;
			 }
		 }
		 System.out.println(a);
		 
		 System.out.println("--- (3) 짝수합 출력 ---");
		 // (3) 1~10 중 짝수의 합 출력
		 
		 a=0;										// 초기화
		 for(int i=0; i<11; i+=2) {
			 a+=i;									// a = a + i
		 }
		 System.out.println(a);
		
		/* 2) 'A'~'Z' 출력
		for(char a = 'A'; a<='Z'; a++) {
			System.out.print(a);
		}
		System.out.println();
		
		for(char a = 'A'; a<='Z'; a+=2) {
			System.out.print(a);
		}
		System.out.println();
		
		// 'Z' ~ 'A'까지 출력
		for(char b='Z'; b>='A'; b--) {
			System.out.print(b);
		}
		System.out.println();
		
		for(char b='Z'; b>='A'; b-=2) {
			System.out.print(b);
		}
		*/
	}

}
