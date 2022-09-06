package chapter04_study;

import java.util.Scanner;

public class Using_Scanner_if02 {

	public static void main(String[] args) {
		/* 점수(score)와 학년(year)을 인풋 받아서 60점 이상: 합격, 60점 미만: 불합격
		  4학년인 경우, 70점 이상: 합격, 70점 미만: 불합격 _ 중첩 if문 사용(if내의 if 사용)
		*/

		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 점수와 학년을 입력하세요. >>> ");
			int s = sc.nextInt();
			int y = sc.nextInt();
			
		if(y==4){
			if(s>=70) {
			System.out.println("합격");
			} else {
			System.out.println("불합격");
			}
		}else {
				if(s>=60) {
				System.out.println("합격");	
				} else { 
					System.out.println("불합격");
				}
		}
	
			sc.close();	
		
			
			
			
			
			
			
			
			
			
			
		}	
			
	}
