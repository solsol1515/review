package chapter05.EX_02;

public class Using_Rectangle_Array_01 {

	public static void main(String[] args) {
		
		// 1. 2차원 정방형(Rectangle) 배열 선언: 직사각형
		
		  // 1-1. 2차원 배열 선언 & 초기화 동시에 하기 [기본값이 모두 0으로 초기값 자동으로 생성] 
		int[][] arr1 = new int[3][4];   
				// [3] = 행의 개수, [4] = 열의 개수
				
		  // 1-2. 2차원 배열 선언과 초기화 분리하기 
		int[][] arr2;   		// 선언
		arr2 = new int[3][4];   // 초기화 (if, while, do while문에서 사용됨)
		
		// 2. 배열 변수 뒤에 [] 
		int arr3[][] = new int[3][4];
		
		int arr4[][];
		arr4 = new int[3][4];
		
		// 3. 자료형과 변수에 각각 [] 적용(잘안씀)
		int[] arr5[] = new int[3][4];
		 //행	  열
				
		int[] arr6[];
		arr6 = new int[3][4];
		
		// 4. 다양한 자료형의 배열 선언
		int[][] arr7 = new int[3][4];				// only 정수
		boolean[][] arr8 = new boolean[2][4];		// only true or false
		double[][] arr9 = new double[4][5];			// only 실수
		String[][] arr10 = new String[2][6];		// only 문자열
		
		
		
	}

}
