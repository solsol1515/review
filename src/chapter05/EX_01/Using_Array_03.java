package chapter05.EX_01;

import java.util.Arrays;

public class Using_Array_03 {

	public static void main(String[] args) {
		// 한국을 빛낸 5명의 위인들만 s String 배열에 저장 후 4가지 방법으로 출력하기!
		
		String[]s = new String[5];
		
		s[0] = "세종대왕";
		s[1] = "이순신";
		s[2] = "안창호";
		s[3] = "김연아";
		s[4] = "블랙핑크";
		
		System.out.println("----- 1. 직접 출력 -----");
		System.out.println(s[0]);   // 세종대왕
		System.out.println(s[1]);   // 이순신
		System.out.println(s[2]);   // 안창호
		System.out.println(s[3]);   // 김연아
		System.out.println(s[4]);   // 블랙핑크
		
		System.out.println("----- 2. for문을 사용해 출력 -----");
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);   // 세종대왕, 이순신, 안창호, 김연아, 블랙핑크
		}

		System.out.println("----- 3. 향상된 for문을 사용해 출력 -----");
		for(String i : s) {
			System.out.println(i);   // 세종대왕, 이순신, 안창호, 김연아, 블랙핑크
		}
		
		System.out.println("----- 4. Arrays.toString(*)을 사용해서 출력 -----");
		System.out.println(Arrays.toString(s));   // [세종대왕, 이순신, 안창호, 김연아, 블랙핑크]
		
	}
}
