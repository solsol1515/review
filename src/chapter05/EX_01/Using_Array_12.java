package chapter05.EX_01;

import java.util.Arrays;

public class Using_Array_12 {

	public static void main(String[] args) {
		
		// 1 ~ 1,000까지 배열(arr)에 저장 후,
		
		// 1. 배열 선언 
		
		int arr[] = new int[1000];
	
		// 2. [입력] for문 사용해서 arr 배열 변수에 값을 할당해주기 
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}
		
		System.out.println("3. for문 사용해서 출력");
		// 3. [출력] for문 사용해서 arr 배열 변수의 값을 출력하기 
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=i;
			System.out.print(arr[i]+1+" ");   // 1 ~ 1,000까지 출력
		}
		System.out.println();
		
		System.out.println("4. 향상된 for문 사용해서 출력");
		// 4. [출력] Enhanced For문 사용해서 값을 출력하기
		
			for(int k : arr) {
				System.out.print(k+1+" ");   // 1 ~ 1,000까지 출력
			}
			System.out.println();
			
		System.out.println("5. Arrays사용해서 출력");
		// 5. [출력] Arrays.toString(arr) 출력하기 
		
			System.out.println(Arrays.toString(arr));   // [0 ~ 999] 출력
			
		

	}

}
