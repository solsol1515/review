package chapter04_study;

import java.util.Scanner;

public class Using_Scanner_if01 {

	public static void main(String[] args) {
		/* 문제: Scanner를 이용해 정수값으로 인풋 받아서 
		 국어(aa), 영어(bb), 수학(cc), 과학(dd), 음악(ee) 점수를 인풋 받습니다.
		 if문을 사용해서 평균이 90점 이상이면 "A학점", 80점 이상이면 "B학점", 70점 이상이면 "C학점" 60점 이상이면 "D학점", 나머지는 "F학점"
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어, 영어, 수학, 과학, 음악 점수를 차례대로 입력하세요. >>>");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		double ev = (a+b+c+d+e)/5.0;
		System.out.println("당신의 평균 점수는: " + ev);
		
		if(ev>=90) {
			System.out.println("A학점"); 
		} else if(ev>=80) {
			System.out.println("B학점");
		} else if(ev>=70) {
			System.out.println("C학점");
		} else if(ev>=60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
		
		
		System.out.print("당신의 평균 점수는 " + ev + "입니다.");
		//sc.close();
		
		
	}

}
