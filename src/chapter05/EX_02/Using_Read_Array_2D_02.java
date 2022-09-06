package chapter05.EX_02;

import java.util.Arrays;

public class Using_Read_Array_2D_02 {

	public static void main(String[] args) {
		// 2차원 배열 출력 
		
		int[][] arr1 = new int[][] {{1, 2, 3, 4, 5}, {6, 7}, {8, 9, 10}, {11, 12}};
		
		System.out.println("----- 1. 직접 출력 -----");
		System.out.print(arr1[0][0]+" "+arr1[0][1]+" "+arr1[0][2]+" "+arr1[0][3]+" "+arr1[0][4]+"\n");			// 1 2 3 4 5 
		System.out.print(arr1[1][0]+" "+arr1[1][1]+"\n");														// 6 7
		System.out.print(arr1[2][0]+" "+arr1[2][1]+" "+arr1[2][2]+"\n");										// 8 9 10
		System.out.print(arr1[3][0]+" "+arr1[3][1]+"\n");														// 11 12
		System.out.println("-----");
		System.out.println(arr1.length);																		// 4(행의 개수)
		System.out.println(arr1[0].length);																		// 5(0번 행의 열의 개수)
		System.out.println(arr1[1].length);																		// 2(1번 행의 열의 개수)
		System.out.println(arr1[2].length);																		// 3(2번 행의 열의 개수)
		System.out.println(arr1[3].length);																		// 2(3번 행의 열의 개수)
		
		System.out.println("----- 2. for문을 사용해서 출력 -----");
		// 2. for문을 사용해서 출력
		for(int i=0; i<arr1.length; i++) {																		// i: 행의 index 번호 
			for(int j=0; j<arr1[i].length; j++) {																// j: 열의 index 번호
				System.out.print(arr1[i][j]+" ");
			}
		System.out.println();
		}
		
		System.out.println("----- 3. Enhanced for문을 사용해서 출력 ------");	
		// 3. Enhanced for문을 사용해서 출력		
		for(int[]a : arr1) {
			for(int b : a) {
				System.out.print(b+" ");
			}
		System.out.println();
		}
		
		System.out.println("----- 4. Arrays.toString을 사용해서 출력 -----");
		// 4. Arrays.toString()   ← 1차원 배열의 값을 출력
		for(int i=0; i<arr1.length; i++) {																		// 4번 루프
			System.out.println(Arrays.toString(arr1[i]));
		}
		
		
		
		
		
	} 

}
