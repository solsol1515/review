package chapter04.EX04;

public class Using_For_01 {

	public static void main(String[] args) {
		/*
		 for: (초기값; 조건; 증가값){
		 		실행문1;   <- 조건이 참인동안 계속 반복, 거짓이면 for를 빠져나옴
		 	}
		 
		 */
		
		
		// for구문 기본형
		int a;
		for(a=0; a<3; a++) {   // (초기값; 조건; 증가값)
			System.out.println(a);   // 0 > 1 > 2 (모두 출력)
		}
		
		System.out.println("----------");
		
		// 초기값과 증가값에는 ","로 구분해서 여러개의 변수가 올 수 있음
		
		int b, c, d;
		for(b=0, c=10, d=20; b<5; b++, c+=2, d+=5) {   // 5번 반복 (0, 1, 2, 3, 4일 때까지)
			// b:1씩 증가, c:2씩 증가, d:5씩 증가
			System.out.println("b: " + b + ", c: " + c + ", d :" + d);
				// c+= 2;
				// d+= 5;
		}
		/*
		 int b, c, d;
		for(b=0, c=10, d=20; b<5; b++) {
			System.out.println("b: " + b + ", c: " + c + ", d :" + d);
				// c+= 2;
				// d+= 5;
		 */
		
		System.out.println("----- for 구문에서 무한루프 -----");   // 무한루프 > terminate로 멈추기
		
		// for 구문에서 무한루프 (조건이나 증가값을 잘못 처리한 경우)
		int e;
		for (e=0; e<10; e+=3) {   // 증가값: e-=3 > 무한루프 발생
			System.out.println(e);   // 조건이 true일 동안 반복
		}   // 0 3 6 9
		
		System.out.println("----- for구문없이 덧셈 -----");
		
		// 1 ~ 10 for구문을 사용하지 않고 덧셈
		
		int sum1;
		sum1 = 0;     // 0
		sum1 += 1;    // sum1 = sum1 + 1 = 0 + 1 = 1
		sum1 += 2;    // sum1 = sum1 + 2 = 1 + 2 = 3
		sum1 += 3;    // sum1 = sum1 + 3 = 3 + 3 = 6
		sum1 += 4;    // sum1 = sum1 + 4 = 6 + 4 = 10
		sum1 += 5;    // sum1 = sum1 + 5 = 10 + 5 = 15
		sum1 += 6;    // sum1 = sum1 + 6 = 15 + 6 = 21
		sum1 += 7;    // sum1 = sum1 + 7 = 21 + 7 = 28
		System.out.println(sum1);   // 28
		sum1 += 8;    // sum1 = sum1 + 8 = 28 + 8 = 36
		sum1 += 9;    // sum1 = sum1 + 9 = 36 + 9 = 45
		sum1 += 10;   // sum1 = sum1 + 10 = 45 + 10 = 55
		System.out.println("1~10까지의 합: " + sum1);
		
		System.out.println("----- for구문 사용해서 덧셈(1~10) -----");
		
		// for구문을 사용해서 1 ~ 10까지의 합계 구하기
		
		int sum2;
		
		int i;
		for(i=1, sum2=0; i<=10; i++) {
			sum2 += i; 
			System.out.println("sum2: "+ sum2 + ", i: " + i);
		}
		System.out.println("1~10까지의 합계: " + sum2);
		
		System.out.println("----- for구문 사용해서 7의 배수 합계 -----"); // ★ 복습할 때 꼭 해보기 ★(잘 몰라 ㅠㅠ)
		
		// for구문을 사용해서 0~1000까지 7의 배수의 합계
		
		int sum3;
		int s;
		for(s=0, sum3=0; s<=1000; s+=7) {
			sum3 += s;
		}
		System.out.printf("0~1000까지의 7의 배수의 합계: " + sum3);
		
		System.out.println("-----");
		
		// for문과 if문을 사용해서 1 ~ 10까지 더한 값을 출력하되 아래와 같이 출력하세요.
		//  결과: 1+2+3+4+5+6+7+8+9+10 =55 print로 출력하기
		
		
		System.out.println();
		System.out.println("-----1~10 합계-----");   // ★ 복습할 때 꼭 해보기 ★(잘 몰라 ㅠㅠ)
		int sum01;
		int o;
		
		for(o=1, sum01=0; o<=10; o++) {
			sum01+=o;
			if(o<10) {
				System.out.print(o+"+");
			}else {
				System.out.print(o+"="+sum01);
			}
		}
		
		/* [선생님 해설지]
		int sum4 = 0;
		for(int ii=1; ii<=10; ii++) {
			sum4+=ii;
			System.out.print(ii);   // 더하는 수 출력
			if(ii<=9) {
				System.out.print("+");   // 1~9까지는 + 출력
			}else {
				System.out.print("=");   // i가 10인 경우 = 출력 
				System.out.print(sum4);
			}
		}
		*/
		
		
		
	}
}
