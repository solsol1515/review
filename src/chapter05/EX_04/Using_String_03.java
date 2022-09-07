package chapter05.EX_04;

import java.util.Arrays;

public class Using_String_03 {

	public static void main(String[] args) {
		// String vs 다른 참조 자료형(배열) 비교
		// String에 저장된 값은 수정 불가, 새로운 값이 Heap영역에 생성됨
		
		// 1. String(객체의 내용 변경 불가 → 새로운 객체 생성)
		String str1 = new String("안녕");
		String str2 = str1;															// Stack 영역의 객체의 주소를 복사(str1의 주소를 str2로 주소 복사) (str1==str2)
		
		System.out.println(str1==str2);												// true
		System.out.println(str1);													// 안녕
		System.out.println(str2);													// 안녕
		
		str1="안녕하세요";																// 별도의 메모리 공간에 새롭게 생성
		System.out.println(str1==str2);												// false	
		System.out.println(str1);													// 안녕하세요
		System.out.println(str2);													// 안녕
		
		System.out.println("----- 2.다른 참조 자료형인 경우: 수정 O -----");
		// 2. 다른 참조 자료형인 경우는 수정 가능 (배열)
		int[] arr1 = new int[] {3, 4, 5};
		
		System.out.println(Arrays.toString(arr1));									// [3, 4, 5]
		int[] arr2 = arr1;															// arr1 참조변수의 주소를 복사 → arr2에 저장 (arr1 Stack영역의 값 복사) 
		
		// 주소가 같은지 확인
		System.out.println(arr1==arr2);												// Stack영역의 주소 비교 // true
		System.out.println(Arrays.toString(arr2));									// [3, 4, 5]
		
		// 값 수정 시
		arr1[0] = 6;
		arr1[1] = 7;
		arr1[2] = 8;
		
		System.out.println(arr1==arr2);												// Stack영역의 주소 비교 // true
		System.out.println(Arrays.toString(arr2));									// [6, 7, 8]
		
		
	}

}
