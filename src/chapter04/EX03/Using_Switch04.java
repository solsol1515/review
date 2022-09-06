package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch04 {

	public static void main(String[] args) {
		/* 2번 문제
		 
	 	- 스캐너로 월을 인풋 받아서 해당 월의 총 날짜를 
	 		"<월>은 <며칠>일까지 있습니다."
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("확인하실 달을 입력해주세요. >>>");
		int b = sc.nextInt();
		int c = 0;
		
		if(b>12 || b<1) {
			System.out.println("존재하지 않는 달입니다. 다시 입력해주세요.");
		}else {
		switch(b) {
			case 2:
				c = 28;
				break;
		 	case 4: case 6: case 9: case 11:
		 		c = 30;
		 		break;
		 	default:
		 		c = 31;
		} 
			System.out.printf("%d월은 %d일까지 있습니다. \n", b, c);
		}
		
			sc.close();	
			
			/* [선생님 해설]
			Scanner sc = new Scanner(System.in);
			System.out.println("확인하실 달을 입력해주세요. >>>");
			int month = sc.nextInt();
			int day = 0;
			
			switch(month) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					day = 31;
					break;
				case 2:
					day = 28;
					break;
			 	case 4: case 6: case 9: case 11:
			 		day = 30;
			 		break;
			 	default:
			 		System.out.println("존재하지 않는 달입니다.");
			} 
				System.out.printf("%d월은 %d일까지 있습니다. \n", month, day);
			
				sc.close();	
				*/
		
	}

}
