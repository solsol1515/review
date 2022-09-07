package chapter05.EX_04;

import java.util.Arrays;

public class Using_String_06 {

	public static void main(String[] args) {
		// String의 다양한 메소드
		// 5. 문자열 수정(toLoerCase(), toUpperCase())
		//			   : 소문자로 변환	 : 대문자로 변환 
		
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase());										// 소문자로 출력
		System.out.println(str1.toUpperCase());										// 대문자로 출력
		
		System.out.println("----- replace -----");
		// replace(원본, 수정)															// 원본을 수정으로 변환 
		String str2 = str1.replace("Study", "공부");
		
		System.out.println(str1.replace("Study", "공부"));							// Java 공부
		System.out.println(str1);													// Java Study
		System.out.println(str2);													// Java 공부
		
		System.out.println("----- substring -----");
		// substring(): 글자를 잘라서 출력 (예) (0, 5)인 경우: 0은 포함, 5는 미포함)
		System.out.println(str1.substring(0, 5));									// index 0(포함) ~ index 5(미포함) 앞까지 자름 // Java 출력
		System.out.println(str1.substring(3, 8));									// index 3(포함) ~ index 8(미포함) 앞까지 자름 // a Stu 출력
		System.out.println(str1.substring(5));										// index 5 방부터 뒤로 모두 자름 // Study 출력
		
		System.out.println("----- split -----");
		// split(): 특정 문자를 기준으로 잘라서 배열에 저장(★배열 선언 필요★)
			// /, -, 공백을 기준으로 잘라서 strArr1 배열 변수에 저장함 
		String[]strArr1 = "abc/def-ghi jkl".split("/|-| ");
		// 해결해보자
		
		System.out.println("----- for문 -----");
		for(int i=0; i<strArr1.length; i++) {
			System.out.print(strArr1[i]+" ");										// abc def ghi jkl 출력
		}
		
		System.out.println();
		System.out.println("----- Enhanced for문 -----");
		for(String k : strArr1) {
			System.out.print(k+" ");												// abc def ghi jkl 출력
		}
		
		System.out.println();
		System.out.println("----- Arrays for문 -----");
		System.out.println(Arrays.toString(strArr1));								// [abc, def, ghi, jkl] 출력
		
		// 공백을 기준으로 모두 잘라서 배열에 저장 후 출력
		
		String a = "오늘은 날씨가 매우 맑습니다. 참 화창한 날씨 입니다.";
		String[] arr2 = a.split(" ");
		
		
		System.out.println("----- 예제) for문 사용 -----");		
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		System.out.println();
		System.out.println("----- 예제) Enhanced for문 사용 -----");		
		for(String k1 : arr2) {
			System.out.print(k1+" ");
		}
		
		System.out.println();
		System.out.println("----- 예제) Arrays.toString 사용 -----");		
		System.out.println(Arrays.toString(arr2));
		
		// trim(): 좌우의 공백을 제거
		System.out.println("   abc   ".trim());
		
		// 6. 문자열 비교
		System.out.println("----- == -----");
		// (==): 참조 자료형일 때, Stack의 주소를 비교
		String str3 = new String("Java");
		String str4 = new String("Java");
		String str5 = new String("java");
		
		System.out.println(str3 == str4);										// false (주소 비교)
		System.out.println(str4 == str5);										// false (주소 비교)
		System.out.println(str3 == str5);										// false (주소 비교)
		
		System.out.println("----- equals -----");
		// equals(): Heap의 값을 비교
		
		System.out.println(str3.equals(str4));									// true (값 비교)
		System.out.println(str4.equals(str5));									// false (값 비교)
			//equalsIgnoreCase(): 대소문자를 구분하지 말고 값 비교 
		System.out.println(str4.equalsIgnoreCase(str5));						// true (대소문자 비교 X → 값 비교)
		
		
	}

}
