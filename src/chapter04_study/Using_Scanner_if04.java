package chapter04_study;

import java.util.Scanner;

public class Using_Scanner_if04 {

	public static void main(String[] args) {
		/* 에스프레소: 1,500원
		   아메리카노: 2,500원
		   카페라떼, 바닐라라떼: 3,500원
				 그 외의 메뉴: 우리 매장에 없는 메뉴입니다.
				
				 출력: 주문하신 <에스프레소>는 가격이 <1,500>원입니다.
				*/
		System.out.println("주문하실 메뉴를 선택해주세요. >>>");
			Scanner sc = new Scanner(System.in);
			String a = sc.next();
			int b = 1500;
			int c = 2500;
			int d = 3500;
			
			if(a.equals("에스프레소")) {
				System.out.println("주문하신 " + a + "는 " + b + "원 입니다.");
			}else if(a.equals("아메리카노")) {
				System.out.println("주문하신 " + a + "는 " + c + "원 입니다.");
			}else if(a.equals("카페라떼") || (a.equals("바닐라라떼"))){
				System.out.println("주문하신" + a + "는 " + d + "원 입니다.");
			} else {
				System.out.println("우리 매장에 없는 메뉴입니다.");
			}
		
		sc.close();
		
		
	}
}
