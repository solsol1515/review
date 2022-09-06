package chapter04.EX04;

import java.util.Scanner;

public class Using_For_02 {

	public static void main(String[] args) {

		//for구문을 사용해서 스캐너로 5개의 값을 인풋받아 출력
		
		Scanner sc = new Scanner(System.in);
		
		String s;
		for(int i=0; i<5; i++) {   // 스캐너로 5번 인풋받음. 0 1 2 3 4 
			s = sc.next();
			System.out.println(s);		
		}
		
		// for구문 안에서 변수 선언 시, for구문 안에서만 사용 가능
		// 	- 같은 클래스에서 재사용이 가능함
		
		int a;   // 전역 변수: for구문 안, 밖 모두에서 사용 가능(for구문 밖에서 선언 시)
		a = 0;
		for (int i=0; i<3; i++) {   // 0 1 2, 총3번 돌아감 
			// ㄴint i: 지역변수 > for구문 안에서만 사용(for구문 안에서 선언 시)
			System.out.println(i);
			System.out.println(a);
		}
		System.out.println(a);
		
		sc.close();
		
	}

}
