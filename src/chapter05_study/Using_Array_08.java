package chapter05_study;

import java.util.Arrays;
import java.util.Scanner;

public class Using_Array_08 {

	public static void main(String[] args) {
		// 스캐너로 인풋받아 임의의 정수 10개를 등록 후,
				// 정수 배열 방 10개 생성하고, 
				// 임의의 값을 10개 방에 저장 
				// 그 중 최댓값을 뽑아서 출력하는 프로그램을 생성해 보세요.
				// 출력: 배열방 10개에서 최댓값은: 000
		
		Scanner sc = new Scanner(System.in);
		
		int[]arr = new int[10];
		int max = 0;   // 최댓값 변수 선언
		int min = 0;   // 최솟값 변수 선언
		
		int i = 0;
		System.out.println("정수를 10개 입력하세요. >>>");
		for(i=0; i<10; i++) {
			arr[i] = sc.nextInt();
		}
		for(i=0; i<10; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}System.out.println("정수 10개의 최댓값은: "+max);
		
		for(i=0; i<10; i++) {
			if(arr[i]<min){
			min = arr[i];
			}
		}
		System.out.println("정수 10개의 최솟값은: "+min);
		
		System.out.println("----- Arrays.sort()메소드 사용 -----");
		Arrays.sort(arr);
		System.out.println("최댓값은: "+arr[arr.length-1]);
		System.out.println("최솟값은: "+ arr[0]);
		
		System.out.println("----- Stream 사용 -----");
		System.out.println("최댓값: "+ Arrays.stream(arr).max().getAsInt());
		System.out.println("최솟값: "+ Arrays.stream(arr).min().getAsInt());
		
		sc.close();
		
		
		
		
		
		
		
		
	}
}