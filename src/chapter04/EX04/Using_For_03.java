package chapter04.EX04;

import java.util.Scanner;

public class Using_For_03 {

	public static void main(String[] args) {
		// for구문 내에 if구문 사용
		// 정수(음수, 양수)를 스캐너로 5개 인풋받아 
		// 양수만 더한 값을 출력하세요.
		
		/*
		Scanner sc = new Scanner(System.in);   //  ★ 복습할 때 꼭 해보기 ★(잘 몰라 ㅠㅠ)
		System.out.println("정수를 하세요.");
		
		double sum = 0;
		double count = 0;
		
		for(double a=0; a<5; a++) {
			double avg = sc.nextInt();
			if(avg>0) {
				sum+=avg;
				count+=1;
			}
		}	
		System.out.println(sum);
		System.out.println(sum/count);	
		*/	
		
		// [선생님 해설]
		Scanner sc = new Scanner(System.in);
		int sum = 0;   // 양수만 더함
		int sum1 = 0;   // 모든 수를 더함
		int count = 0;   // 양수를 카운트하는 변수
		int count1 = 0;   // 모든 수를 카운트함
		
		System.out.println("정수 5개를 입력하세요. (음수, 양수) >>");
		
		for(int i=0; i<5; i++) {
			int n = sc.nextInt();
			sum1 += n;   // 입력받은 모든 수를 더함
			count1++;   // 모든 수를 카운트
			if (n>0) {
				sum+=n;
				count++;   // 양수일 때, 1씩 증가
			}
		}
		System.out.println("양수의 합: " + sum + ", 양수의 평균: " + sum/(double)count);
		System.out.println("모든 수의 합: "+ sum1 + ", 모든 수의 평균: " + sum1/(double)count1);
		
		
	}
}
