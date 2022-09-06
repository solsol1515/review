package chapter05.EX_01;

public class Using_Array_06 {

	public static void main(String[] args) {
		
		// 배열 선언하는 방법 1 (자료형 뒤 []) <권장사항>
		int[]Array1 = new int[3];   // 배열 선언, 초기화 (강제로 초기값 할당됨)
		
		int[]array2;   // 배열 선언
		array2 = new int[3];   // 초기화 (강제로 초기값 할당됨)
		
		// 배열 선언하는 방법 2 (변수명 뒤 [])
		int array3[] = new int[3];   // 배열 선언과 동시에 초기화
		
		int array4[];   // 배열 선언
		array4 = new int[3];   // 초기화
		
		// 다양한 방법으로 배열 선언
		
			// 배열은 참조자료형_Stack: 변수명(Heap의 주소) / Heap: 값
				// Heap 영역의 방에는 반드시 값이 할당되어 있어야 한다.
				// 	- JVM이 초기값을 자동으로 할당한다
		
		boolean[]array5 = new boolean[3];   // boolean 초기값: false
		System.out.println(array5[0]);
		
		int[]array6 = new int[3];   // int 초기값: 0
		System.out.println(array6[0]);
		
		double[]array7 = new double[3];   // double 초기값: 0.0
		System.out.println(array7[0]);
		
		String[]array8 = new String[3];   // String 초기값: null
		System.out.println(array8[0]);
		
		
		
		
		

	}

}
