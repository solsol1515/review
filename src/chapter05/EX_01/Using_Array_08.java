package chapter05.EX_01;

import java.util.Arrays;
import java.util.Scanner;

public class Using_Array_08 {

	public static void main(String[] args) {
		// 스캐너로 인풋받아 임의의 정수 10개를 등록 후,
		// 정수 배열 방 10개 생성하고, 
		// 임의의 값을 10개 방에 저장 
		// 그 중 최댓값을 뽑아서 출력하는 프로그램을 생성해 보세요.
		// 출력: 배열방 10개에서 최댓값은: 000
		
		/*
		 System.out.println("----- 1번째 예제 -----");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 숫자 10개를 입력하세요.");
		
		int arr[] = new int[10];
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr [i] = sc.nextInt();
			if(arr[i]>max) 
				max = arr[i];
		}
		

		System.out.println("최댓값은: "+max);
		
		*/
		
		// [선생님 해설]
		Scanner sc1 = new Scanner(System.in);
		
		
		int[] arr1 = new int[10]; 
		int max1 = 0;   // 최댓값을 저장하는 변수 선언
		int min1 = 0;   // 최솟값을 저장하는 변수 선언
		
		int i = 0;
		System.out.println("원하는 숫자 10개를 입력하세요.");   // 스캐너로 임의의 정수값 입력
		for(i=0; i<10; i++) {
			arr1[i] = sc1.nextInt();
		}
		// 최댓값을 뽑아서 max1 변수에 저장 후 출력
		for(i=0; i<10; i++) {
			if(arr1[i]>max1) {   // arr1의 i1번째방의 값이 max1의 변수의 값보다 크면
				max1 = arr1[i];   // max변수에 arr1[i1]번 방의 값을 max1 변수에 대입
			}
		}
		System.out.println("배열방 10개에서 최댓값은: " + max1);
		
		
		// 최솟값을 뽑아서 max 변수에 저장 후 출력
		for(i=0; i<10; i++) {
			if(arr1[i]<min1) {
				min1 = arr1[i];
			}
		}
		System.out.println("배열방 10개에서 최솟값은: "+min1);
		/*
		System.out.println("----- 2번째 방법: Arrays.sort() 메소드를 사용해서 출력 -----");
		Arrays.sort(arr1);   // 배열방의 값을 정렬한다. 0(최솟값), 1, 2, 3... arr.length-1(마지막 방)_최댓값
		System.out.println("최댓값: " +arr1[arr1.length-1]);   // 최댓값
		System.out.println("최솟값: "+arr1[0]);   // 최솟값
		
		System.out.println("----- 3번째 방법: Stream을 사용하는 경우 -----");
		System.out.println("최댓값: " + Arrays.stream(arr1).max().getAsInt());
		System.out.println("최솟값: "+ Arrays.stream(arr1).min().getAsInt());
		*/
		sc1.close();
		
	
		
		
	}

}
