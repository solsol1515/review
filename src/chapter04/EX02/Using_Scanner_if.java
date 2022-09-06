package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if {

	public static void main(String[] args) {

		// 문제: Scanner를 이용해 정수값으로 인풋 받아서 
		// 국어(aa), 영어(bb), 수학(cc), 과학(dd), 음악(ee) 점수를 인풋 받습니다.
		// if문을 사용해서 평균이 90점 이상이면 "A학점", 80점 이상이면 "B학점", 70점 이상이면 "C학점" 60점 이상이면 "D학점", 나머지는 "F학점"
		
		Scanner sc = new Scanner(System.in);
		int aa, bb, cc, dd, ee;
		
		System.out.println("국어, 영어, 수학, 과학, 음악 점수를 넣으세요>>>");
		
		aa = sc.nextInt();
		bb = sc.nextInt();
		cc = sc.nextInt();
		dd = sc.nextInt(); 
		ee = sc.nextInt();
		
		
		double s = (aa + bb + cc + dd + ee)/5.0;
		System.out.println("평균점수: " + s  );
		if (s >= 90) {
			System.out.println("A학점입니다.");
		} else if(s >= 80){
			System.out.println("B학점입니다.");
		} else if(s >= 70){
			System.out.println("C학점입니다.");
		} else if(s >= 60){
			System.out.println("D학점입니다.");
		} else {
			System.out.println("F학점입니다.");
		}

		// sc.close();   // 객제 제거
		
	}
}
