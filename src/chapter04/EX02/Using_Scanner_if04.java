package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if04 {

	public static void main(String[] args) {
		// 에스프레소, 카페라떼, 아포카토: 3,500원
		// 아메리카노: 2,500원
		// 그 외의 메뉴: 우리 매장에 없는 메뉴입니다.
		
		// 출력: 주문하신 <에스프레소>는 가격이 <3,500>원입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주문하실 메뉴를 입력하세요. >>> ");
		String a = sc.next();
		int b = 3500;
		int c = 2500;
		
		if(a.equals("에스프레소")|a.equals("카페라떼")||a.equals("카페라떼")||a.equals("까페라떼")||a.equals("까페라테")||a.equals("아포카토")) {
			System.out.println("주문하신 " + a + "는 가격이 " + b + "원입니다.");
		}else if(a.equals("아메리카노")){
				System.out.println("주문하신 " + a + "는 가격이 " + c + "원입니다.");
		}else {
					System.out.println("우리 매장에 없는 메뉴입니다.");	
				}
		sc.close();
		
		System.out.println("-----선생님 해설-----");
		
		Scanner sc1 = new Scanner(System.in);
				
		 System.out.println("주문하실 메뉴를 입력하세요. >>> ");
		 System.out.println("========================");
		 System.out.println("에스프레소 카페라떼 아포카토 아메리카노");
		 System.out.println("========================"); 
		 String order = sc.next();
		 int price = 0;
		 
		 if(order.equals("에스프레소") ||order.equals("카페라떼") ||order.equals("아포카토")){ 
		 	price = 3500;
		}else if(order.equals("아메리카노")) {
			price = 2500;
		}
		 else {
		  	System.out.println("우리 매장에 없는 메뉴입니다."); 
		  }
		  System.out.printf("주문하신 %s는 가격이 %d원입니다.", order, price);
		  
		  sc.close();
		  
		
		/* [선생님 해설]
		 Scanner sc = new Scanner(System.in);
		 System.out.println("주문하실 메뉴를 입력하세요. >>> ");
		 System.out.println("========================");
		 System.out.println("에스프레소 카페라떼 아포카토 아메리카노");
		 System.out.println("========================"); 
		 String order = sc.next();
		 int price = 0;
		 
		 if(order.equals("에스프레소" ||order.equals("카페라떼" ||order.equals("아포카토")){ 
		 	price = 3500;
		}else {
		  	System.out.println("우리 매장에 없는 메뉴입니다."); 
		  }
		  System.out.printf("주문하신 %s는 가격이%d원입니다.", order, price); 
		 */
		
		}
	}


