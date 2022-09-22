package basic_03;

import java.util.Scanner;

public class Ex_practice {

	public static void main(String[] args) {
/* (문제 1) 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 true을 반환 그렇지 않으면 false을 반환하는 메소드를 작성하시오. 
		
	함수명 : checkLower
	인자 : char
	리턴(반환) : boolean
*/
		// Scanner sc = new Scanner(System.in);		// 스캐너 생성
		// System.out.println("영문자를 입력하세요.");		// 입력받을 문자입력 요청 문구 출력
		// String sc_input = sc.nextLine();			// 입력받은 문자를 sc_input에 저장
		
		// String ch = sc_input;
		// ch = checkLower();
	}
	static boolean checkLower(char ch) {
		boolean b = false;
		if(Character.isLowerCase(ch)) {				// if(ch>='a' && ch<='z')
			b=true;
			System.out.println(b);
		}else if(Character.isUpperCase(ch)==false) {	// if(ch>='A' && ch<='Z')
			b=false;
			System.out.println(b);
		}
		return b;
	}
}