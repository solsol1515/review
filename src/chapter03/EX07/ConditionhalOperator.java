package chapter03.EX07;

public class ConditionhalOperator {

	public static void main(String[] args) {
		// 3항 연산자(! 자주사용)
		// (조건) ? 참:거짓;
		// 		조건: 참 > '참' 실행, 거짓 > '거짓' 실행
		
		// ':'은 깃발을 나타냄
		
		int value1 = (3>5) ? 6:9;   // 조건이 false(3>5)이므로 변수에 9 할당.
		System.out.println(value1);
		
		int value2 = (5>3) ? 10:20;
		System.out.println(value2);   // 조건이 true(5>3)이므로 변수에 10 할당.
		
		int value3 = 3;
		System.out.println((value3 % 2 == 0) ? "짝수":"홀수");   // %: 나머지 값만 출력 > 홀수
		
		// 5의 배수만 인지 3항 연산자 통해 확인
		
		int value4 = 10;
		System.out.println((value4 % 5 == 0) ? "5의 배수이다.":"5의 배수가 아니다.");
		
		// 나이가 20이상이면 성인이다. 성인이 아니다. 
		
		int value5 = 20;
		System.out.println((value5 >=20) ? "당신은 성인입니다.":"당신은 성인이 아닙니다.");
		System.out.println("======");
		
		// 3항 연산자는 if ~ else 문으로 변환 가능
		/*
		 if(조건) {
		 	실행문1; < 조건이 참: 실행문1 실행
		 }else {
		 	실행문2; < 조건이 거짓: 실행문2 실행
		 }
		 */
		// 변수 선언은 1번만 가능.
		value3 = 5;
		
		if(value3 % 2 == 0) {
			System.out.println("짝수");	// 조건이 참일 때 실행하는 블락
		}else {
			System.out.println("홀수");	// 조건이 거짓일 때 실행하는 블락
		}
		System.out.println("---------------");
		
		// 5의 배수 출력
		value4 = 7;
		if(value4 % 5 == 0) {
			System.out.println("5의 배수이다.");
		}else {
			System.out.println("5의 배수가 아니다.");
		}
		System.out.println("================");
		
		
		// 나이가 20살 이상이면 성인
		if(value5 >=20) {
			System.out.println("당신은 성인입니다.");
		} else{
			System.out.println("당신은 성인이 아닙니다.");
		}
	}
}
