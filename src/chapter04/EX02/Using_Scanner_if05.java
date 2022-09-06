package chapter04.EX02;

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
			 
			 System.out.println("나이를 입력하세요. >>>");
			 
			 int age = sc.nextInt();
			 int price = 0;
			 
			 if(age<8) {
				 price=1000;
				 System.out.printf("취학 전 아동입니다. 입장료는 %d입니다. \n", price);
			 } 	else if(age<14){
				 price=2000;
				 System.out.printf("초등학생입니다. 입장료는 %d입니다. \n", price);
			 	} else if(age<20) {
			 		price=2500;
			 		System.out.printf("중, 고등학생입니다. 입장료는 %d입니다. \n", price);
			 		} else if(age>=20) {
			 			price=3000;
			 			System.out.printf("일반인입니다. 입장료는 %d입니다. \n", price);
			 			
			 		} else {
			 			
			 				}
			 
			 //	sc.close();
			 	
		
	
			 	Scanner sc1 = new Scanner(System.in);
			 	System.out.println("나이를 입력하세요(0~100) >>>");
			 	int age1 = sc.nextInt();
			 	int price1 = 0;
			 	System.out.println("입장료는" + price + "입니다.");
			 	
			 	if(age1<8) {
			 		System.out.println("취학 전 아동입니다.");
			 		price1=1000;
			 	}else if(age1<14) {
			 		System.out.println("초등학생입니다.");
			 		price1=2000;
			 	}else if(age1<20) {
			 		System.out.println("중, 고등학생입니다.");
			 		price1=2500;
			 	}else {
			 		System.out.println("일반인입니다.");
			 		price1=3000;
			 	}
			 	
			 	sc.close();
		
	}
}
