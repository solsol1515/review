package chapter05.EX_02;

public class Using_NonRectangle_Array_01 {

	public static void main(String[] args) {
		// 비정방형 배열: 각 행에 대해서 열의 개수가 다를 때
		
		System.out.println("----- 1 -----");
		// 1. 방법1) 비정방형 배열 선언 > 방의 크기 생성 > 값 할당
		int[][] arr1 = new int[2][];			// 행의 개수만 2개 지정, 열의 개수는 나중에 지정
		arr1[0] = new int[2];					// 0번째 행의 열의 개수 2개로 지정
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		
		arr1[1] = new int[3];					// 1번째 행의 열의 개수 3개로 지정 
		arr1[1][0] = 3;
		arr1[1][1] = 4;
		arr1[1][2] = 5;
		System.out.print(arr1[0][0]+" "+arr1[0][1]);
		System.out.println();
		System.out.print(arr1[1][0]+" "+arr1[1][1]+" "+arr1[1][2]);
		System.out.println();
		
		System.out.println("----- 2 -----");
		
		//    방법2) 비정방형 배열 선언 시 값 할당 
		int[][] arr2 = new int[2][];			// 비정방형 배열 선언: 행의 개수만 먼저 선언 > 열은 선언 X 
		arr2[0]= new int[] {1, 2};				// 0행의 값을 바로 할당 (주의★ 방의 크기 선언 X_ 지정할 경우 오류남)
		arr2[1]= new int[] {3, 4, 5};			// 1행의 값을 바로 할당 (주의★ 방의 크기 선언 X)
				
		System.out.print(arr2[0][0]+" "+arr2[0][1]);
		System.out.println();
		System.out.print(arr2[1][0]+" "+arr2[1][1]+" "+arr2[1][2]);
		System.out.println();
		
		System.out.println("----- 3 -----");
		
		//    방법3) 비정방형 배열 선언 시 값 할당 	
				// 선언과 초기화 값 할당
		int[][] arr3 = new int[][] {{6, 7}, {8, 9, 10}};
		
		System.out.print(arr3[0][0]+" "+arr3[0][1]);
		System.out.println();
		System.out.print(arr3[1][0]+" "+arr3[1][1]+" "+arr3[1][2]);
		System.out.println();
		
		System.out.println("----- 4 -----");
		
		// 선언, 초기화 값 할당 분리 
		int[][] arr4;
		arr4 = new int[][] {{6, 7}, {8, 9, 10}};
		
		System.out.print(arr4[0][0]+" "+arr4[0][1]);
		System.out.println();
		System.out.print(arr4[1][0]+" "+arr4[1][1]+" "+arr4[1][2]);
		System.out.println();
		
		System.out.println("----- 5 -----");
		
		//    방법4) 비정방형 배열 선언 시 값 할당 (선언과 초기화 분리 불가능)
		int[][] arr5 = {{6, 7}, {8, 9, 10}};
		
		System.out.print(arr5[0][0]+" "+arr5[0][1]);
		System.out.println();
		System.out.print(arr5[1][0]+" "+arr5[1][1]+" "+arr5[1][2]);
		System.out.println();
		
		// 오류 발생: 선언과 초기화 분리 시 오류 발생(방법 4 분리)
		int[][] arr6;
		// arr6 = {{6, 7}, {8, 9, 10}};			// 오류 발생
	}

}
