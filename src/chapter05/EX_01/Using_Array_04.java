package chapter05.EX_01;

import java.util.Arrays;

public class Using_Array_04 {

	public static void main(String[] args) {
		// 배열(Array): [배열]변수 1개에 여러개의 값을 넣음
		// 		- 참조자료형: 변수는 Stack에 저장, 값은 Heap영역에 저장
		// 			변수의 Heap영역에 주소값이 들어있음
		// 		- 기본자료형: 변수와 값 모두 Stack에 저장
		// 			ㄴ boolean, byte, short, int, long, float, double, char
		// - 기본자료형 배열변수: "
		// - 참조자료형 배열변수: String
		
		// 1. 동일한 자료형의 값을 담고 있다.
		// 2. 방의 개수를 변경할 수 없다. (정적임) != 컬렉션은 변경할 수 있음?
		
			// Heap 공간에는 반드시 값이 들어있어야한다
			// 	- 초기값을 넣지 않은 경우 JVM이 자동으로 넣음.
			// 		- 정수: 0, 실수: 0.0, boolean: false
			// 		- 참조자료형일 경우: null(비어있는 값) null!=0
		
		
		
		
		// 1. 배열 선언과 초기화
		int[]a = new int[5];
			// int (배열변수[]) a를 생성
			// new: Heap 공간에 int 배열방 5개를 생성해서 Heap의 주소를 a변수에 할당
		
		// 2. 직접 방의 값을 입력
			// index(방) 직접 값을 대입
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		// 출력(직접 출력)
		System.out.println("----- 직접 출력 -----");
		System.out.println(a[0]);   // index (방번호 0) 10
		System.out.println(a[1]);   // 20
		System.out.println(a[2]);   // 30
		System.out.println(a[3]);   // 40
		System.out.println(a[4]);   // 50
		
		System.out.println("----- for문을 사용해서 값을 입력, 출력 -----");
		
			// 입력
		for(int i=0, j=100; i<5; i++, j+=100) {   // i: index를 뜻함(0번부터 ~) 0 1 2 3 4
			a[i] = j;   // a[0] = 100, a[1] = 200, a[2] = 300, a[3] = 400, a[4] = 500
		}   
			// 출력
		for(int i=0; i<5; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
		
		
		System.out.println("----- a.length를 사용해서 입력과 출력 -----");   
		
		System.out.println(a.length);   // 배열 방의 개수를 표현 >>> "5"출력
		
		System.out.println("-----");
		// 각 방의 값을 입력
		for(int i=0, j=1000; i<a.length; i++, j+=100) {   
			a[i] = j;   // 인풋
		}
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);   // 1000 1100 1200 1300 1400 출력
		}
		
		
		// 3. 배열 방의 정보를 출력 (Enhanced for: 배열의 저장된 모든 값을 출력)
		System.out.println("----- 향상된 for문을 사용해서 출력 -----");
		for(int k : a) {
			System.out.println(k);   // 1000 1100 1200 1300 1400 출력
		}
		
		// 4. 출력: Arrays.toString(a): Arrays 객체의 toString(*) 메소드(함수)
		System.out.println(Arrays.toString(a));   // [1000, 1100, 1200, 1300, 1400] 출력
		
		
	}

}
