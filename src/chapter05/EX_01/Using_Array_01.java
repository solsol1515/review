package chapter05.EX_01;

import java.util.Arrays;

public class Using_Array_01 {

	public static void main(String[] args) {
		// 기본 자료형의 경우: RAM의 Stack 영역에 변수와 값이 같이 저장됨
		// 참조 자료형의 경우: RAM의 Stack 영역에 변수명이 저장되고, Heap 영역에 변수의 값이 저장됨
		
		// 배열(Array): 하나의 [배열] 변수에 여러개의 값을 할당
		// 	- 1. 동일한 자료형의 값을 할당
		//  - 2. 배열의 방의 크기를 지정하면 수정이 불가능
		
		// 배열 변수 a를 선언
		int[] a = new int[5];   // a는 참조변수(참조 주소값을 가지고 있음)
		// 배열 a변수의 방의 크기 5개를 생성 후, 주소값을 a에 할당해라
		// 방 번호 [index] 0 ~ 4방까지 Heap 영역에 생성됨
		// new: Heap 영역의 배열 방 5개를 생성해서 Heap 영역의 번지를 a변수에 할당해라 
		
		// 배열 변수에 값을 할당
		a[0] = 10;   // Heap 영역의 index 0 방에 정수 10을 넣어라 
		a[1] = 20;   // Heap 영역의 index 1 방에 정수 20을 넣어라
		a[2] = 30;   // Heap 영역의 index 2 방에 정수 30을 넣어라
		a[3] = 40;   // Heap 영역의 index 3 방에 정수 40을 넣어라
		a[4] = 50;   // Heap 영역의 index 4 방에 정수 50을 넣어라
		
		
		System.out.println("----- 직접 배열 방의 값을 출력하기 -----");
		// 배열 방의 값을 출력
		System.out.println(a[0]);   // 10
		System.out.println(a[1]);   // 20
		System.out.println(a[2]);   // 30
		System.out.println(a[3]);   // 40
		System.out.println(a[4]);   // 50
		
		System.out.println("----- for문을 사용해서 배열 방의 값을 출력하기 -----");
		// for문을 사용해서 출력
		for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("배열변수 a의 방의 개수: " + a.length);   // 배열 방의 총 개수를 출력
		
		System.out.println("----- for문에서 *.length를 사용해서 출력 -----");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println(a);   // Heap RAM(메모리)의 주소를 나타냄
		
		System.out.println("----- 향상된 for문을 사용해서 출력하기 -----");
		// 향상된(enhanced) for문으로 배열의 모든 값을 출력
		// 		- 배열의 모든 방을 순환하며 출력
		// 		- 배열의 모든 값을 한꺼번에 출력
		for(int k : a) {
			System.out.println(k);   // 10 20 30 40 50
		}
		
		// Arrays.toString(a)으로 출력 
		System.out.println("----- Arrays.toString(a) -----");
		
		System.out.println(Arrays.toString(a));   // [10, 20, 30, 40, 50]
		
	}
}
