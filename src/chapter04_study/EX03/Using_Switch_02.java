package chapter04_study.EX03;

import java.util.Scanner;

public class Using_Switch_02 {

	public static void main(String[] args) {
		// switch구문 사용
				// 스캐너 사용
				// 에스프레소, 카페라떼, 아포카토: 3,500원
				// 아메리카노: 2,500원
				// 그 외의 메뉴: 우리 매장에 없는 메뉴입니다.
				
				// 출력: 주문하신 <에스프레소>는 가격이 <3,500>원입니다.
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		System.out.println("주문하실 메뉴를 입력해주세요. >>>");
		
		int b = 0;
		
		switch(a){
		case "에스프레소": case "카페라떼": case "아포카토":  
			b = 3500;
			System.out.println("주문하신 " + a + "는 가격이 " + b + "원입니다.");
		case "아메리카노":
			b = 2500;
			System.out.println("주문하신 " + a + "는 가격이 " + b + "원입니다.");
		}
		
		
		
		}
}
