package chapter04.EX07;

public class Using_Continue {

	public static void main(String[] args) {
		// Continue: continue를 만나면 continue 아래의 코드를 실행하지 않고 반복
		//	- if문과 같이 사용
		
		// 1. 단일 loop에서 continue
		
		for(int i=0; i<10; i++) {
			System.out.println("A");   // 0 ~ 9: A 10번 출력
			continue;   // 구문을 빠져나가지 않고
			// System.out.println("B");   // 도달할 수 없는 코드 
			// ㄴ unreachable code(도달할 수 없음)
		}
			
		for(int i=0; i<10; i++) {
			System.out.println("A");   // 0 ~ 9: A 10번 출력
			if(i%2==0) {continue;}   // 짝수: continue 실행 > A출력 & 위의 실행문으로 이동 | 홀수: continue 실행 X > A & B 출력 & 위의 실행문으로 이동
			System.out.println("B");   // continue;를 만나면 B 출력 X > "다시" 위의 실행문 실행(break;는 실행문을 탈출) 
			// ㄴ unreachable code(도달할 수 없음)
		}
		
		System.out.println("---------- 예제 ----------");
		for(int i=0; i<10; i++) {
			if(i==5 || i==7) {continue;}
			System.out.print(i + " ");
		}
		
		// 1. for문을 사용해서 1에서 1000까지 1씩 증가하고, continue를 사용해서 
		// 	  3의 배수만 출력하세요.
		
		
		// 2. for문을 사용해서 1에서 1000까지 1씩 증가하고, continue를 사용해서 
		// 	  5의 배수만 출력하세요.
		
		// 3. for문을 사용해서 1에서 1000까지 1씩 증가하고, continue를 사용해서 
		// 	  3, 5, 7의 배수를 출력하세요.
		System.out.println();
		System.out.println("----- 예제 1 -----");
		
		for(int i=1; i<1001; i++) {
			if(i%3==0 && i!=0 && i!=1 && i!=2) {
				System.out.print(i+" ");
			}
		}
		
		
		System.out.println();
		System.out.println("----- 예제 2 -----");
		
		for(int i=1; i<1001; i++) {
			if(i%5==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("----- 예제 3 -----");
		
		for(int i =1; i<1001; i++) {
			if(i%3==0 || i%5==0 || i%7==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		System.out.println("===== [선생님 해설지] =====");
		System.out.println("----- 3의 배수만 출력하기 -----");  
		for(int i=1; i<1000; i++) {
			if(i%3!=0) {continue;}
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("----- 5의 배수만 출력하기 -----");
		for(int i=1; i<1000; i++) {
			if(i%5!=0) {continue;}
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("----- 3, 5, 7의 배수만 출력하기 -----");
		for(int i=1; i<1000; i++) {
			if((i%3==0)||(i%5==0)||(i%7==0))
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("----- 다중 loop에서 continue -----");
		
		// 2. 다중 loop에서 continue
		for(int i=0; i<5; i++) {   // loop 5번
			for(int k=0; k<5; k++) {   // loop 5번
				if(k==3){continue;}
				System.out.println(i + ", "+ k);   // 총 25번 출력
			}
		}  
		
		System.out.println("----- label 사용해서 점프하기 -----");
		
		out: for(int i=0; i<5; i++) {   // loop 5번
			for(int k=0; k<5; k++) {   // loop 5번
				if(k==3){continue out;}
				System.out.println(i + ", "+ k);   // 총 25번 출력
			}
		}  
		
		System.out.println("----- 값을 증대시켜 false로 만들어 탈출 -----");
		
		
		out: for(int i=0; i<5; i++) {   // loop 5번
			for(int k=0; k<5; k++) {   // loop 5번
				if(k==3){
					i = 6;   // 바깥쪽 for문의 변수값을 증대시켜 false값으로 만들어 탈출
					continue out;}
				System.out.println(i + ", "+ k);   // 총 25번 출력
			}
		}  
		
	}
}
