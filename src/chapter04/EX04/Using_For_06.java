package chapter04.EX04;

public class Using_For_06 {

	public static void main(String[] args) {
		// for구문에서 무한루프 발생 시 (조건을 생략한 경우)
		
		/*
		  for(int i=0; i<100; i++) {
			System.out.println(i);   // 조건 생략 > 무한루프
			
		}
		System.out.println("문자열 출력");   // 도달할 수 없는 코드 > 오류 발생 
		 */
		
		// 무한루프를 탈출하는 방법: break; 사용
		// if구문 내에 break;
		
		for(int i=0; ; i++) {
			System.out.println(i);   // 조건 생략 > 무한루프
			if(i==100) break;   // {} 생략 (원래: {break;})
		}
		System.out.println("문자열 출력");   // 도달할 수 없는 코드 > 오류 발생 
		
	}
}
