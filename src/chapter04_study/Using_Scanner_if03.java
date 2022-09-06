package chapter04_study;

import java.util.Scanner;

public class Using_Scanner_if03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("주문할 커피를 고르세요. >>>");
		
		String a = sc.next();

		if(a.equals("아메리카노")) {
			System.out.println("주문하신 커피는 " + a + "입니다.");
		}else if(a.equals("카페라테")) {
			System.out.println("주문하신 커피는 " + a + "입니다.");
		}else if(a.equals("바닐라라테")) {
			System.out.println("주문하신 커피는 " + a + "입니다.");
		} else {
			System.out.println("주문하신 메뉴가 없습니다.");
		}
		
		sc.close();

				
		
	}

}
