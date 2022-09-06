package chapter05.EX_01;

import java.util.Arrays;

public class Using_Array_05 {

	public static void main(String[] args) {
		// 1~500까지 3의 배수를 배열에 저장 
		// 출력: 직접 출력, for문 써서 출력, Enhanced for, toString()
		// 합계:		평균:
		
		// 1. 배열 선언과 초기화
		int[]a = new int[166];
		int count = 0;   // 3의 배수의 개수
		for(int i=0, j=3; i<a.length; i++, j+=3) {
			if(j<=500) {
				a[i] = j;
				count++;
			}
		}
		
		System.out.println("----- 직접 출력 -----");
		// 직접 출력
		a[0] = 3;
		a[1] = 6;
		a[2] = 9;
		a[3] = 12;
		a[4] = 15;
		System.out.println(a[0]);
		
		System.out.println("----- for문 사용해서 출력하기 -----");
		// for문을 사용해서 출력
		for(int i=0; i<a.length; i++) {
			
			System.out.print(a[i]+" ");
		}
		
		System.out.println("");
		System.out.println("----- Enhanced for 사용해서 출력하기 -----");
		for(int k : a) {
			System.out.print(k+" ");
		}
		
		System.out.println("----- toSring()사용해서 출력하기 -----");
		System.out.println(Arrays.toString(a));

		System.out.println("----- 합계 -----");
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		System.out.println("1~500까지의 정수 중 3의 배수의 합계: "+sum);
		
		System.out.println("----- 평균 -----");
		System.out.println("평균: "+ sum/(double)count);
				
			
		
		
	}

}
