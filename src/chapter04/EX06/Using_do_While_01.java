package chapter04.EX06;

public class Using_do_While_01 {

	public static void main(String[] args) {

		// while: 조건을 비교 후 실행문을 실행 (조건 true > 실행문 실행)
		/*	while(조건) {
		 		실행문;
		 	}
		 */
		
		// do while: 1번은 실행 후 조건을 비교 후 실행 (일단 실행문 실행 > 조건이 true > 계속 반복)
		/*	do{
		 	  실행문;
		 	}while(조건);
		 */
		
		
		// 1. while vs do while 비교                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
		int a;                    
		a = 11;
		System.out.println("----- while문: 조건이 true일 때만 실행 -----");
		while(a<10) {
			System.out.println(a + " ");   // 실행 X
			a++;
		}
		
		System.out.println("----- do while문: 조건과 상관없이 실행문을 1번 실행 후"
				+ ", 조건이 참이면 반복");
		a = 11;
		do {
			System.out.println(a + " ");   // 조건과 상관없이 1번은 실행 > 11 출력
		}while(a<10);
		
		
		// while문과 do while문 10번 실행 
		
		System.out.println("----- while -----");
		
		a = 0;
		while (a<10) {
			System.out.print(a+ " ");
			a++;
		}
		
		System.out.println();
		System.out.println("----- do while -----");   
		
		a = 0;
		do {
			System.out.print(a + " ");   // 조건과 관계없이 1번은 실행됨
			a++;
		}while(a<10);
		
		System.out.println();
		
		a = 0;
		int sum1=0;
		do {
			System.out.print(a+" +"+" ");
			a++;
			sum1+=a;
		}while(a<5);
			System.out.println(a+" = "+sum1);
		
		
		
		
	}
}
