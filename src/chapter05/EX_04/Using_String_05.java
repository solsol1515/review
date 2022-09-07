package chapter05.EX_04;

import java.util.Arrays;

public class Using_String_05 {

	public static void main(String[] args) {
		// String의 주요한 특징: 다른 클래스에는 없는 특별한 기능
			// 1. 수정 불가 → 새로운 값을 Heap영역에 생성
			// 2. 리터럴로 변수의 값을 넣을 경우: 동일한 문자열 → 주소 공유
			// 3. 객체 자체를 출력할 때, 객체의 주소가 출력되지 않고 값이 출력
			// 	toString()메소드가 재정의 되어있음
			// 4. 다양한 메소드가 정의되어 있음
				
				System.out.println("----- 1. 문자열의 길이(.length()) -----");
				// 1) 문자열의 길이(.length())			//length:글자의 수 
				String str1 = "Hello Java!";
				String str2 = "안녕하세요! 반갑습니다.";
				
				System.out.println(str1.length());												// 11 출력(11자)
				System.out.println(str2.length());												// 13 출력(13자) ← 글자수 
				
				System.out.println("----- 2-1. 문자열 검색(charAt(), indexOf(), lastIndexOf() -----");
				
				// 2) 문자열 검색(charAt(), indexOf(), lastIndexOf())
					// 2-1) charAt(): 해당 index(방번호)의 문자를 가져옴
				System.out.println(str1.charAt(0));												// H출력 (Hello Java! 중 0번째인 H)
				System.out.println(str1.charAt(4));												// o출력 (Hello Java! 중 4번째인 o)
				System.out.println(str1.charAt(6));												// J출력 (Hello Java! 중 6번째인 J)
				System.out.println(str1.charAt(10));											// !출력 (Hello Java! 중 9번째인 !)
				
				System.out.println(str2.charAt(3));												// 세 출력 (안녕하세요! 반갑습니다. 중 3번째인 세)
				System.out.println(str2.charAt(3));												// ! 출력 (안녕하세요! 반갑습니다. 중 5번째인 !)
				
				System.out.println("----- 2-2. indexOf(): 해당 글자에 대한 방번호를 출력, 왼쪽(처음) → 오른쪽(끝) -----");
				
					// 2-2) indexOf(): 해당 글자에 대한 방번호를 출력, 왼쪽(처음) → 오른쪽(끝)
					// 		lastIndexOf(): 해당 글자에 대한 방번호를 출력, 왼쪽(처음) ← 오른쪽(끝)
				
				System.out.println(str1.indexOf('a'));											// 7출력 (a문자의 방 번호)
				System.out.println(str1.lastIndexOf('a'));										// 9출력 (뒤에서 앞으로 올 때의 a를 찾음_방번호는 그대로 왼쪽 → 오른쪽 순번)
				
				// str1에서 a 문자를 8번방 이후에서부터 검색
				System.out.println(str1.indexOf('a', 8));										// 9출력 (Java의 두 번째 a 방 번호)
				System.out.println(str1.lastIndexOf('a', 8));									// 7출력 (8번방의 왼쪽으로 a를 찾은 뒤 출력)
				
				// "Java" 문자열의 방번호를 찾음
				System.out.println(str1.indexOf("Java"));										// 6출력 (6번방부터 "Java" 문자열 시작)
				System.out.println(str1.lastIndexOf("Java"));									// 6출력 
				
				System.out.println(str2.indexOf("하세요"));										// 2출력 
				
				// 없는 내용을 검색 시: -1 출력(-1: 존재하지 않는 경우)
				System.out.println(str2.indexOf("bye"));										// -1출력 
				
				System.out.println(str2.indexOf("반갑습니다"));										// 7출력
				
				System.out.println(str2.indexOf("고맙습니다"));										// -1출력
				
					// 3) 문자열 변환 및 연결(String.valueOf(), contact())
				String str3 = String.valueOf(2.3);											  	// double → String
				String str4 = String.valueOf(false);											// boolean → String
					
				System.out.println(str3);
				System.out.println(str4);
					
				String str5 = str3.concat(str4);									            // +와 같움
				System.out.println(str5);														// false
				
				// 4. 문자열 → byte[](getBytes()), 문자열 → char[](toCharArray())
				
				String str8 = "Hello Java!";
				String str9 = "안녕하세요";
				
				byte[]arr1= str8.getBytes();													// 영문인 경우: 아스키코드로 배열에 저장
				byte[]arr2= str9.getBytes();													// 영문인 경우: 아스키코드로 배열에 저장
				
				System.out.println(Arrays.toString(arr1));										// [72, 101, 108, 108, 111, 32, 74, 97, 118, 97, 33] 출력
				System.out.println(Arrays.toString(arr2));										// [-20, -107, -120...] 출력 // 문자 → 숫자 코드로 변환
				
				System.out.println("----- 문자열을 char[] 배열에 저장 -----");	
				
				// 문자열을 char[] 배열에 저장
				
				char[] arr3 = str8.toCharArray();
				char[] arr4 = str9.toCharArray();
				
				System.out.println(Arrays.toString(arr3));										// [H, e, l, l, o,  , J, a, v, a, !]
				System.out.println(Arrays.toString(arr4));										// [안, 녕, 하, 세, 요]
				
	}

}
