package chapter04.EX06;

import java.util.Scanner;

public class Using_do_While_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int nu = 0;   // 스캐너에서 정수를 인풋
		
		do {
			System.out.println("====================================================");
			System.out.println("1. 19단 출력 | 2. 홀수단만 출력 | 3. 3의 배수단만 출력 | 4. 종료");
			System.out.println("====================================================");
			System.out.println("원하는 숫자를 선택하세요 >>>");
			nu = sc.nextInt();
			
			if(nu==1) {
				System.out.println("===== 1. 19단 출력 =====");
				
				for(int a=1; a<20; a++) {
					for(int b=1; b<20; b++) {
						System.out.print(a+"*"+b+"="+a*b);
						System.out.print("\t");
					}System.out.println();
				}
			}else if(nu==2) {
				System.out.println("===== 2. 홀수단 출력 =====");
				for(int a=1; a<20; a++) {
					for(int b=1; b<20; b++) {
						if(a%2==1) {   // or a%2!=0(홀수)
							System.out.print(a+"*"+b+"="+a*b);
							System.out.print("\t");
						}
				}if(a%2==0) {System.out.println();}
				}
			}else if(nu==3) {
				System.out.println("===== 3. 3의 배수단 출력 =====");
				for(int a=1; a<20; a++) {
					for(int b=1; b<20; b++) {
						if(a%3==0) {
							System.out.print(a+"*"+b+"="+a*b);
							System.out.print("\t");
						}
					}if(a%3==0) {System.out.println();}
				}
			}else if(nu==4){
				break;
			}
			
			
		}while(run);   // 무한루프 
		System.out.println("프로그램을 종료합니다.");
		
	}
}