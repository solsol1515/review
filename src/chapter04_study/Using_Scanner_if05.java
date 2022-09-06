package chapter04_study;

import java.util.Scanner;

public class Using_Scanner_if05 {

	public static void main(String[] args) {
		/*
		 - 스캐너를 나이를 인풋 받아 출력
		 
		 나이(age)가 8세 미만: "취학 전 아동입니다."
		 				   "입장료는 <1000>원입니다."
		 				   
		 나이(age)가 14세 미만: "초등학생입니다."
		 					"입장료는 <2000>원입니다."
		 
		 나이(age)가 20세 미만: "중, 고등학생입니다."
		 					"입장료는 <2500>원입니다."
		 					
		 나이(age)가 20세 이상: "일반인입니다."
		 					"입장료는 <3000>원입니다."
		
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요. >>>");
		
		int a = sc.nextInt();
		
		if(a<7) {
			System.out.println("");
		}
		
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요. >>> ");
		

		int aa = sc.nextInt();
		int b = 1000;
		int c = 2000;
		int d = 2500;
		int e = 3000;
		
			if(aa<8) {
				System.out.printf("취학 전 아동입니다. 입장료는 %d입니다. \n", b);
			}else if(aa<14){
				System.out.printf("초등학생입니다. 입장료는 %d입니다.\n", c);
			} else if(aa<20){
				System.out.printf("학생입니다. 입장료는 %d입니다.\n", d);
			} else {
				System.out.printf("일반인입니다. 입장료는 %d입니다. \n", e);
			} 
			System.out.println("입장료는 %d입니다.\n",price);
			
		*/
		
		
		
		
		
	}

}
