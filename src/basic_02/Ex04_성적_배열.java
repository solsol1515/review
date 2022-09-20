package basic_02;

import java.util.Scanner;

public class Ex04_성적_배열 {

	public static void main(String[] args) {
		
		 // 배열은 for문과 짝 (배열 개수가 확실하기때문에)
		
		Scanner input = new Scanner(System.in);
		
		int kor[] = new int[5];							// 배열 생성 (학생 점수 배열 kor)
		
		for(int i=0; i<kor.length; i++) {
			System.out.println(i+"번 학생의 국어점수를 입력	→");
			kor[i] = input.nextInt();					// 학생들의 점수값 입력 (kor[i]에 입력됨)
		}
		
		System.out.println("----- 출력 -----");
		
		// 출력
		for(int i=0; i<kor.length; i++) {
		System.out.println(i+"번 학생의 점수: "+kor[i]);	// 스캐너에 입력한 값 출력 i번째 입력값(점수) 출력됨
		
		}
		
		// 위 학생들 점수의 총점과 평균 출력
		
		int sum = 0;									// 학생 5명 점수의 합
		for(int i=0; i<kor.length; i++) {				// 학생 수만큼 for문 작동
			sum+=kor[i];								// sum=sum+kor[i] / sum으로 학생들 점수 합산
		}
		System.out.println("학생들의 총점: "+sum);
		System.out.println("학생들의 평균: "+(double)sum/kor.length);
		
		
	}

}
