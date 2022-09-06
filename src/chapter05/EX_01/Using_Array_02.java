package chapter05.EX_01;

import java.util.Arrays;

public class Using_Array_02 {

	public static void main(String[] args) {
		// Array (배열)
		// 	- 참조 변수 선언 > 초기화 >> 값이 자동으로 등록됨.
		// 		- 정수: 0, 실수: 0.0, String: null, boolean: false
		// 		Heap 영역에는 값이 반드시 할당되어 있어야 한다
		
		//  1. 배열 선언 및 초기화
		double[] d = new double[6];   // index 0 ~ 5
			// Heap 영역에 double 방 6개를 생성 > 주소값을 d 변수에 할당해라 
		
		System.out.println(d[5]);   // 각 방에 기본값으로 0.0 출력
		
		// 2. 배열의 값을 할당 
		d[0] = 10.5;
		d[1] = 20.5;
		d[2] = 30.5;
		d[3] = 40.5;
		d[4] = 50.5;
		d[5] = 60.5;
		
		// 3. 배열 방의 값을 출력
		System.out.println("----- 직접 출력 -----");
		// 	- (1) 직접 출력
		System.out.println(d[1]);
		System.out.println(d.length);   // 배열 방의 개수: 6 출력
		
		System.out.println("----- for문을 사용해서 출력 -----");
		// 	- (2) for문을 사용해서 출력
		for(int i=0; i<d.length; i++) {
			System.out.println(d[i]);   // 10.5 20.5 30.5 40.5 50.5 60.5
		}
		
		System.out.println("-----");
		
		// for문을 사용하면 원하는 방의 값만 출력할 수 있다.
		
		for(int i=3; i<6; i++) {
			System.out.println(d[i]);   // 40.5 50.5 60.5 
		}
		
		System.out.println("----- 향상된 for문을 사용해서 출력 -----");
		// 	- (3) 향상된 for문을 사용해서 출력
		for(double k : d) {
			System.out.println(k);   // 10.5 20.5 30.5 40.5 50.5 60.5
		}
		
		System.out.println("----- Arrays.toString(d) -----");
		// 	- (4) Arrays.toString(*)을 사용해서 출력
		System.out.println(Arrays.toString(d));   // [10.5, 20.5, 30.5, 40.5, 50.5, 60.5]
		
	}
}
