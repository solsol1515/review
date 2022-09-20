package basic_02;

import java.util.Scanner;

/*control+a+i = 줄 맞춤
 * for		: 반복 횟수가 정해진 경우
 * while	: 반복 횟수를 모르는 경우
 * do_while	: 반복 횟수를 모르는 경우(다만, 조건을 나중에 비교) 
 * */


public class Ex02_반복문구분 {

	public static void main(String[] args) {
		// 구구단의 단수를 입력 받아서 해당 단의 구구단을 출력

		// 1. for문
		Scanner sc = new Scanner(System.in);						// 스캐너 이용(입력하는 내용 출력)
		System.out.println("출력하실 구구단의 단을 입력해주세요(1~9단)(for문 사용)");		// 원하는 단수 입력 → 스캐너 사용
		int gugudan = sc.nextInt();									// 스캐너를 이용해서 입력하는 단수를 gugudan이라는 변수로 받음

		for(int i=1; i<10; i++) {
			System.out.print(gugudan+"x"+i+"= "+gugudan*i+" ");
		}
		
		
		while(true) {
		
			System.out.println("--- 구구단 중 원하는 단수를 입력하세요 ---");
			int ii = sc.nextInt();					// 스캐너에서 입력하는 수를 ii로 입력받음
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d\n", ii, j, ii*j);
			}
		
			System.out.println("반복 종료를 원하실 경우(Y)를 입력하세요.");
			String answer = sc.nextLine();
			if(answer.equalsIgnoreCase("Y")) break;			// 대소문자 상관없이 스캐너 종료(equalsIgnoreCase)
		}
		
		// 3. do_while문
		
		do {
			System.out.println("--- 구구단 중 원하는 단수를 입력하세요 ---");
			int ii = sc.nextInt();					// enter 전까지만 출력 / 스캐너로 입력받은 값 ii로 받음
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d\n", ii, j, ii*j);
			}
			
			System.out.println("반복 종료를 원하실 경우(Y)를 입력하세요.");
			sc.nextLine();
			String answer = sc.nextLine();
			if(answer.equalsIgnoreCase("Y")) break;
		}while(true);
		
		sc.close();
		
	}
	
}
