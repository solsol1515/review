package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner {

	public static void main(String[] args) {
		
		// Scanner: 첫 글자가 대문자로 시작 > 클래스: 객체를 생성하는 틀
		/*
		 	- 콘솔을 통해서 값(정수_int, 문자열_next(),_nextln(), 실수_nextDouble(), 문자)을 받아 처리 
		 	- 객체를 임포트해서 사용해야 함 (import java.util.Scanner)
		 	- 공백이나 엔터를 사용해서 여러개의 값을 넣을 수 있다.
		 	- Scanner sc를 사용한 후에는 sc.close()를 사용해서 객체를 메모리에서 제거해줘야함
		 */
		
		Scanner sc = new Scanner(System.in);   // ★외우기★
			// Scanner 클래스로부터 sc라는 객체를 생성함 (콘솔을 통해서 인풋받음)
			// control + shift + o: 외부 클래스 자동 import 
		
			// sc: 객체
			// sc.nextint(): 객체의 메소드(함수)
		
		System.out.println("반드시 정수를 입력하세요>>>");
		
		
		int a = sc.nextInt();   // 콘솔에서 정수값을 받아서 변수 a에 할당(문자열 넣으면 오류)
		
		System.out.println("변수 a를 출력: " + a);
		
		System.out.println("반드시 문자열을 입력하세요>>>");
		String b = sc.next();   // 콘솔에서 문자열을 받아서 변수 b에 할당
		System.out.println("변수 b를 출력: " + b);
		
		System.out.println("반드시 실수값을 입력하세요>>>");
		double c = sc.nextDouble();
		System.out.println("변수 c를 출력: " + c);
		
		// 스캐너에서 char 문자열 처리 
		// 한문자를 처리할 때, String 변수 선언
		System.out.println("반드시 한 문자만 입력하세요>>>");
		String s = sc.next();   // 문자열 변수 선언
		char d = s.charAt(0);   // 문자열 + enter
		System.out.println("변수 d를 출력: " + d);  
		
		
		// 콘솔에서 한 칸씩 띄워서 한꺼번에 입력 가능 or 콘솔에 나오는 차례대로 입력 가능
		
		sc.close();   // 메모리에서 객체 삭제
		
		
		
		
		
		
		
		
	}

}
