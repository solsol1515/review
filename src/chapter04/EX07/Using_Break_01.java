package chapter04.EX07;

public class Using_Break_01 {

	public static void main(String[] args) {
		// Break;: 해당 구문({})을 탈출할 때 사용, if조건과 같이 사용
		// 		- 1단계만 탈출(해당 블락만 탈출)
		// for, while, do while (반복문을 탈출할 때 사용)
		
		// #1. 단일 loop문에서 탈출
		for(int i = 0; i<10; i++) {
			System.out.println(i);
			// break;   // 한 단계 탈출
		}
		
		System.out.println("----------");
		
		
		// break는 for, while, do while내에서 if 조건과 같이 사용
		for(int i = 0; i<10; i++) {
			System.out.println(i);
			if(i==5) {break;}   // i가 5일 때 탈출 (실행문 1줄 > {} 생략 가능) 
		}
		System.out.println("----- 2. 다중 loop 탈출 -----");
		
		// 2. 다중 loop문에서 break; 사용
		// 		case 1. 하나의 loop문만 탈출
		for(int i=0; i<5; i++) {   // i가 0~4까지 5번 loop 돎
			for(int j=0; j<5; j++) {   // j가 0~4까지 5번 loop 돎
				if(j==2) {break;}   // 하나의 for문만 탈출 > j의 값이 2가 되면 빠져나가서 i++에서 다시 돎 
				
				System.out.println(i+","+j);
			}
		}
		System.out.println("----- 2-1. 변수값을 증가시켜 탈출하기(2중 for문 탈출) -----");
		
		// case 2-1. 한꺼번에 탈출 (바깥쪽 for문의 변수의 값을 조건이 false가 되도록 증가시켜 탈출)
		
		for(int i=0; i<5; i++) {   
			for(int j=0; j<5; j++) {   
				if(j==2) {  
				i = 100;   // 바깥쪽 for문의 변수값을 false로 만들어 한꺼번에 탈출
				break;}
				System.out.println(i+","+j);
			}
		}
		System.out.println("----- 2-2. lable 사용해서 탈출하기(2중 for문 탈출) -----");
		
		// case 2-2. 한꺼번에 탈출(lable 사용해서 탈출): break jump; 
		
		jump: for(int i=0; i<5; i++) {   
			for(int j=0; j<5; j++) {   
				if(j==2) {  
				
				break jump;}
				System.out.println(i+","+j);
			}
		}
		
	}
}
