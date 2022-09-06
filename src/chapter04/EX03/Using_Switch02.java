package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch02 {

	public static void main(String[] args) {

		// switch구문 사용
		// 스캐너 사용
		// 에스프레소, 카페라떼, 아포카토: 3,500원
		// 아메리카노: 2,500원
		// 그 외의 메뉴: 우리 매장에 없는 메뉴입니다.
		
		// 출력: 주문하신 <에스프레소>는 가격이 <3,500>원입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주문하실 메뉴를 입력해주세요. >>>");
		String a = sc.next();
		
		int b = 0; 
		
		switch(a) {
		 case "에스프레소": case "카페라떼": case "아포카토":
			 b = 3500;
			 System.out.printf("주문하신 %s는 가격이 %d원입니다. \n", a, b);
			 break;
		 case "아메리카노" :
			 b = 2500;
			 System.out.printf("주문하신 %s는 가격이 %d원입니다. \n", a, b);
			 break;
		 default:
			System.out.println("우리 매장에 없는 메뉴입니다.");
		}
		
		sc.close();
	
		/* 선생님 해설지
		Scanner sc = new Scanner(System.in);
		System.out.println("커피를 주문해주세요 >>>");
		String order = sc.next();
		int price = 0;
		
		switch(order) {
			case "에스프레소": case "카페라떼": case "아포카토":
				price = 3500;
				break;
			case "아메리카노":
				price = 2500;
				break;
			default:
				System.out.println("우리 매장에 없는 메뉴입니다.");
		}
		
		System.out.printf("주문하신 커피는 %s이고, 가격은 %d원입니다.", order, price);
		
		sc.close();
		*/
		
	}

}
