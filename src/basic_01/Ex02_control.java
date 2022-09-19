package basic_01;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 제어문: 프로그램 흐름을 변경하기 위해서
 * 		1) if
 * 		2) switch
 * 		3) for
 * 		4) while / do_while
 * 
 * 		5) break / continue
 * */

public class Ex02_control {

	public static void main(String[] args) {
		
		
		String id = null;								// 초기화

		Scanner input = new Scanner(System.in);			// 스캐너 
		System.out.println("주민등록번호를 입력하세요 (예시: OOOOOO-OOOOOOO) →");
		id = input.nextLine();							// enter 치기 전까지 받은 문자를 입력받음.
		
		
		// String id = "940215-1545678";
		
		char sung = id.charAt(7);
		System.out.println(sung);
		
		// sung 변수에 문자가 1이거나 3이거나 9이면 남자 출력
		// 그렇지 않고 문자가 2이거나 4이거나 0이라면 여자 출력
		
		if(sung=='1'||sung=='3'||sung=='9') {
			System.out.println("남자");
		}else if (sung=='2'||sung=='4'||sung=='0'){
			System.out.println("여자");
		}
		
		// ★ 선생님 해설 ★  
		
		if(sung=='1'||sung=='3'||sung=='9') {
			System.out.println("남자");
		}else if(sung=='2'||sung=='4'||sung=='0'){
			System.out.println("여자");
		}
	
		char chul = id.charAt(8);
		System.out.println(chul);
		// chul 변수가 0이라면 '서울'
		// chul 변수가 1이라면 '인천/부산'
		// chul 변수가 2라면 '경기'
		
		// chul 변수가 9라면 '제주'
		String home = null;
		if (chul == '0') home = "서울";
		
		switch (chul) {								// 문자, 정수, 문자열
			case '0': home = "대한민국"; 
					break;
			case '1': home = "서울";
				  	break;
			case '2': home = "인천/부산";
					break;
			case '3': home = "경기";
					break;
			case '4': home = "충남";
					break;
			case '5': home = "대전";
					break;
			case '6': home = "세종";
					break;
			case '7': home = "광주";
					break;
			case '8': home = "경상도";
					break;
			case '9': home = "제주";
					break;								// 마지막에는 break 필수 아님
		}
		System.out.println(home+" 출신");
		
		// String id = "940215-2545678";
		String nai = id.substring(0, 2);				// 0~2 앞까지 nai = "94" (문자열)
		// 문자열 → 정수 변환 
			// <오류발생> int sunai = (int)nai;
		int sunai = Integer.parseInt(nai);				// sunai = 94 (정수)
		
		int age = 0;									// 초기화
		
		Calendar c = Calendar.getInstance();			 
		int year = c.get(Calendar.YEAR);				// PC Calendar 설정값을 기준으로 계산할 수 있게해줌
		
		age = year - (1900 + sunai) + 1;
		
		System.out.println(age);
		
		String i3 = "200215-4234567";
		
		char sung3 = i3.charAt(7);						// 성별: 여자
		
		String nai3 = i3.substring(0, 2);				// 출생연도
		int sunai3 = Integer.parseInt(nai3);
		
		if(sung3=='4'|sung3=='3') {						// 2000년대 이후 출생자 여자, 남자
			age = year - (2000 + sunai3)+1;
		} else if(sung3=='9'|sung3=='0') {				// 1800년대 출생자 여자, 남자
			age = year - (1800 + sunai3)+1;
		}
		System.out.println(age);
		
		input.close();
	}

}
