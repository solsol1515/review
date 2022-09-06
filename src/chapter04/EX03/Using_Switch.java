package chapter04.EX03;

public class Using_Switch {

	public static void main(String[] args) {
		// if는 자동으로 빠져 나오지만 switch는 break; 사용 반드시 필요함
		// switch: 반드시 break; 사용해 해당 case를 탈출
		
		
		// *1. switch 구문에서 break;를 사용하지 않는 경우
		// 해당 case로 점프 후 > 하위의 모든 case 실행
		// break;: 해당 실행문을 빠져 나옴. 
		
		int a = 2;
		
		switch(a) {   // (위치 변수)a: 정수, 문자, 문자열
			case 1:
				System.out.println("변수값을 출력 " + a);
			case 2:
				System.out.println("변수값을 출력 " + a);   // 변수값을 출력 2
			case 3:
				System.out.println("변수값을 출력 " + a);   // 변수값을 출력 2
			case 4:
				System.out.println("변수값을 출력 " + a);   // 변수값을 출력 2
			default:									// if구문의 else와 같이 case의 값이 없는 모든 경우
				System.out.println("변수값을 출력 " + a);   // 변수값을 출력 2 
		}
		System.out.println("---break; 사용---");
		
		
		// *2. switch 구문에서 break; 사용(일반적으로 사용)
		
		a = 5;
		
		switch(a) {   // (위치 변수)a: 정수, 문자, 문자열
			case 1:
				System.out.println("case1을 출력 " + a);
				break;
			case 2:
				System.out.println("case2을 출력 " + a);   // 변수값을 출력 2
				break;
			case 3:
				System.out.println("case3을 출력 " + a);   // 변수값을 출력 2
				break;
			case 4:
				System.out.println("case4를 출력 " + a);   // 변수값을 출력 2
				break;			
			default:									// if구문의 else와 같이 case의 값이 없는 모든 경우
				System.out.println("dafault를 출력 " + a);   // 변수값을 출력 2 
				break;   // default의 break;는 일반적으로 생략
		}
		System.out.println("---예제 01---");
		
		
		//  7점 이상인 경우: pass, 그렇지 않은 경우: fail
		
		int b = 8;
		switch(b) {
		 case 10:
			 System.out.println("Pass");
			 break;
		 case 9:
			 System.out.println("Pass");
			 break;
		 case 8:
			 System.out.println("Pass");
			 break;
		 case 7:
			 System.out.println("Pass");
			 break;
		 default:
			 System.out.println("Fail");   // Pass
			 break;
		}
		
		System.out.println("--- 축약 표현 ---");
		// 축약 표현
		
		b = 6;
		switch (b) {
		 case 10: case 9: case 8: case 7:
			 System.out.println("Pass");
			 break;
		default:
			System.out.println("Fail");   // Fail
			break;
		}
		System.out.println("--- switch & if 상호 변환---");
		
		// switch구문 <---> if ~ else if구문 (상호 변환 O)
		
		int c = 5; 
		switch (c) {
			case 10: case 9:
				System.out.println("A학점");
				break;
			case 8: 
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			default:
				System.out.println("D학점");   // default는 break; 생략 가능 
		}
		
			// 위의 구문을 if ~ else if 구문으로 변환 (if구문은 break; 없이도 멈춤)
		
		c = 7;
		
		if(c>=9) {
			System.out.println("A학점");
		} else if(c==8) {
			System.out.println("B학점");
		} else if(c==7) {
			System.out.println("C학점");   // 실행 후 if구문을 자동으로 빠져나옴(break; 사용 없이)
		} else {
			System.out.println("D학점");
		}
		
	
	}
}
