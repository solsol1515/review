package chapter04;

public class If_01 {

	public static void main(String[] args) {

		/*
		 	제어문: 프로그램의 순서를 바꾸는 구문
		 		- 선택 제어문: if, switch
		 		- 반복 제어문: form while, do while
		 		
		 	if: 조건을 만족하는 실행문 실행 후, if문을 빠져나옴 (break를 사용하지 않더라도 if문을 빠져나옴.) (switch문은 break를 사용해서 구문을 빠져나옴.)
		 	
		 			- 1) if (조건) {실행문1};   // 조건이 참일 때, 실행문1을 실행
		 		
		 			- 2) if (조건) {
		 				실행문1;   // 실행문1: 조건이 참
		 				} else{
		 				실행문2;   // 실행문2: 조건이 거짓
		 				}
		 				
		 			- 3) if (조건1) {   // 조건1이 참 > 실행문1 실행
		 		 			실행문1;
		 				} else if (조건2){   // 조건2가 참 > 실행문2 실행
		 					실행문2;
		 				} else if (조건3){   // 조건3이 참 > 실행문3 실행
		 					실행문3;
		 				} 
		 				... 
		 				} else{   // 위의 모든 조건을 만족하지 않을 때, 실행문 10을 실행
		 					실행문10;
		 				}
		 */
		
		// 1. if (조건) {실행문1}
		System.out.println("----- 조건이 false -----");
		
		if (3>5) {   // 조건이 false이기때문에 실행문 실행 X > 내용 출력 X
			System.out.println("안녕");
			System.out.println("방가");
		}
System.out.println("----- 조건이 true -----");
		if (3<5) {
			System.out.println("안녕");
			System.out.println("방가");
		}
		
		// if 조건에서 실행문이 1개일 경우: 중괄호 생략 가능 (주의요함)
			// 권장사항: 중괄호 명시 후, 사용
		
		System.out.println("-------------------");
		
		if (5<3) 
			System.out.println("오늘은 비가 옵니다.");   // 중괄호 생략(false > 출력 X)
			System.out.println("비가 보슬보슬 옵니다.");   // 중괄호 밖의 실행문 > 출력 O
		System.out.println("---------------------");
			
		/* 2. if (조건){ 
				실행문1;   // 조건 참 > 실행문1 실행
			} else{
				실행문2;   // 조건 거짓 > 실행문2 실행
			}
			
		*/
		
		if (5 < 3) {   // 조건은 반드시 true or false 
			System.out.println("실행1 (참)");   // 조건이 참일 때 실행
		} else{
			System.out.println("실행2 (거짓)");   // 조건이 거짓일 때 실행
		}
		
		// 변수 선언: 동일한 변수를 여러번 선언 시 ","로 구분
		// 		- 기본 자료형(8가지): 초기값 할당 (하지 않을 경우 > 오류)
		//			boolean, byte, short, int, long, float, double, char
		//		- 참조 자료형(무한대): 초기값 할당 X > 컴파일러가 자동으로 넣어줌 
		// String은 기본자료형 X 참조 자료형  
		
		int a, b;   // 변수 선언만 한 경우
		
		// System.out.println(a);   // 변수의 값을 넣지 않고 출력 > 오류 
		a = 5; b = 0;   // 변수에 초기값 할당
		System.out.println("----- if else 출력 -----");
		if (a>5) {
			b = 10;
		}else {
			b = 20;
		}
		
		System.out.println(b);   // 20 ('a>5' 조건이 거짓 > 'b=20' 조건이 적용됨)
		System.out.println("----- 3항 연산자 출력 -----");
		
		// if (조건) ~ else 구문을 3항 연산자로 변환: 3항 연산자는 한 라인으로 처리
		
		System.out.println((a>5) ? 10:20);   // 20
		System.out.println("----- 조건 여러개일 경우 -----");
		
		/* 3. 조건이 여러개인 경우: if (조건) ~ else if (조건) ~ else 구문 
		 		ㄴ 해당 조건을 만족하는 실행문을 실행 후 if문 탈출
		 */
		
		int c;
		c = 85;
		
		if (c>=90) {
			System.out.println("A학점입니다.");   // false > 실행 X
		} else if(c>=80){
			System.out.println("B학점입니다.");   // true > 실행 (실행문 실행 후 if문을 빠져 나옴)
		} else if(c>=70){
			System.out.println("C학점입니다.");   // 조건을 만족하나 위의 실행문에서 실행 후 빠져나갔으므로 실행 X
		} else if(c>=60){
			System.out.println("D학점입니다.");
		} else {
			System.out.println("학점 미달입니다.");
		}
		
		System.out.println("if문 탈출");
		
		
		
		
		
		
		
		
		}
		
		
		
	}


