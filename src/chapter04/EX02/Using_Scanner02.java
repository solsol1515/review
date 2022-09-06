package chapter04.EX02;

import java.util.Scanner;   // ctrl + shift + o

public class Using_Scanner02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 콘솔에서 인풋할 때: 1. 공백으로 한꺼번에 변수값 할당
		//				  2. 엔터를 사용해서 하나씩 값을 할당
		// 주의) 자료형과 변수의 개수에 잘 맞춰서 인풋할 것!
		System.out.println("이름(문자열), 나이(정수), 몸무게(실수) 공백으로 구분해서 입력하세요. >>>");
		
		String aa = sc.next();   // 콘솔에서 인풋, 문자열
		int bb = sc.nextInt();   // 콘솔에서 인풋, 정수값
		double cc = sc.nextDouble();   // 콘솔에서 인풋, 실수값
		System.out.printf("당신의 이름은 %s이고, 나이는 %d이고, " + "당신의 몸무게는 %3.1f입니다. \n" , aa, bb, cc);
		
		System.out.print("당신의 이름은 " + aa +  "이고 나이는 " + bb + "이고 몸무게는 " + cc + "입니다. \n");
		
		sc.close();
		
	}

}
