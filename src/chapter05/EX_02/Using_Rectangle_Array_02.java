package chapter05.EX_02;

public class Using_Rectangle_Array_02 {

	public static void main(String[] args) {
		// 2차원 정방형 배열에 값을 넣고 출력
		
		// 1. 배열을 선언 후 값 할당
		
		// 선언과 동시에 초기화
		int[][] arr1 = new int[2][3];		
		
		// 각 2차원 배열에 값 할당 (방에 어떤 값이 들어올지 모를 때 사용)
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		arr1[1][0] = 4;
		arr1[1][1] = 5;
		arr1[1][2] = 6;
		
		// 각 방의 내용을 출력
		System.out.print(arr1[0][0]+" "+arr1[0][1]+" "+arr1[0][2]);
		System.out.println();
		System.out.print(arr1[1][0]+" "+arr1[1][1]+" "+arr1[1][2]);
		System.out.println();
		
		System.out.println("----- 1 -----");
		
		// 선언과 초기화 분리 
		int[][] arr2;			// 선언
		arr2 = new int[2][3];	// 초기화
		
		arr2[0][0] = 1;
		arr2[0][1] = 2;
		arr2[0][2] = 3;
		arr2[1][0] = 4;
		arr2[1][1] = 5;
		arr2[1][2] = 6;
		
		System.out.print(arr2[0][0]+" "+arr2[0][1]+" "+arr2[0][2]);
		System.out.println();
		System.out.print(arr2[1][0]+" "+arr2[1][1]+" "+arr2[1][2]);
		System.out.println();

		System.out.println("----- 2 -----");
		
		// 2. 배열을 선언 시 바로 값 할당
			// 선언 시 방 크기 지정하면 오류 발생!!!
			// 선언과 초기화 분리 가능 
		int[][] arr3 = new int[][] {{1, 2, 3}, {4, 5, 6}};
		
		System.out.print(arr3[0][0]+" "+arr3[0][1]+" "+arr3[0][2]);
		System.out.println();
		System.out.print(arr3[1][0]+" "+arr3[1][1]+" "+arr3[1][2]);
		System.out.println();
		
		System.out.println("----- 3 -----");
		
		// 선언과 초기화 분리 
		int[][] arr4;									// 선언
		arr4 = new int[][] {{1, 2, 3}, {4, 5, 6}};		// 초기화
		
		System.out.print(arr4[0][0]+" "+arr4[0][1]+" "+arr4[0][2]);
		System.out.println();
		System.out.print(arr4[1][0]+" "+arr4[1][1]+" "+arr4[1][2]);
		System.out.println();
		
		System.out.println("----- 4 -----");
		
		// 3. 배열 선언 시 값 할당
			// 주의) ★선언과 초기화 분리 불가능★ (new int 생략)
		int[][] arr5 = {{1, 2, 3}, {4, 5, 6}};
		
		System.out.print(arr5[0][0]+" "+arr5[0][1]+" "+arr5[0][2]);
		System.out.println();
		System.out.print(arr5[1][0]+" "+arr5[1][1]+" "+arr5[1][2]);
		System.out.println();
		
		System.out.println("----- 5 -----");
		
		// 오류 발생: 선언과 초기화 분리 불가능 (★new int 생략 시★ 오류 발생)
		
		int[][] arr6;
		// arr6 = {{1, 2, 3}, {4, 5, 6}};			// 오류 발생
		
		
		
		
	}

}
