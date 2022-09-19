package basic_01;

import java.util.Scanner;

public class Ex02_control_02 {

	public static void main(String[] args) {
		/* 우리대학의 학번은 총 10자리로 되어 있습니다.
			맨 앞의 4자리는 입학년도이고 다섯번째 문자는 단과대 번호입니다.

     		1 : 공대		2 : 사회대
     		
			그 뒤의 2자리는 각 학과번호입니다.

  		공과대학인 경우는

     	11 : 컴퓨터학과       12 : 소프트웨어학과          13 : 모바일학과
     	22 : 자바학과         33 : 서버학과

		사회대학인 경우는

 		11 : 사회학과         12 : 경영학과          13 : 경제학과

 		ex) 2017111001 는 2017년도에 입학한 공대 컴퓨터학과 학생입니다
 		ex) 2019211001 는 2019년도에 입학한 사회대 사회학과 학생입니다
 		ex) 2018133001 는 2018년도에 입학한 공대 서버학과 학생입니다   
		*/
		
		String student = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학번을 입력해주세요");
		
		student =sc.nextLine();
		
		
		String year = student.substring(0, 4);		// 입학년도 0~3번까지
		
		char dangwa = student.charAt(4);
		String dangwa1 = null;						// 단과대
		
		String hakgwa = student.substring(5,7);	
		String hakgwa1 = null;						// 학과
		
		if(dangwa=='1') {
			dangwa1 = "공대";
			if(hakgwa.equals("11")) {
				hakgwa1="컴퓨터학과";
			}else if(hakgwa.equals("12")) {
				hakgwa1="소프트웨어학과";
			}else if(hakgwa.equals("13")) {
				hakgwa="모바일학과";
			}else if(hakgwa.equals("22")) {
				hakgwa1="자바학과";
			}else if(hakgwa.equals("33")) {
				hakgwa1="서버학과";
			}
		}// if
		else if(dangwa=='2') {
				dangwa1="사회대";
			if(hakgwa.equals("11")) {
				hakgwa1="사회학과";
			}else if(hakgwa.equals("12")) {
				hakgwa1="경영학과";
			}else if(hakgwa.equals("13")) {
				hakgwa1="경제학과";
			}
		}// else if	
		System.out.println(student+"는 "+year+"년도에 입학한 "+dangwa1+" "+hakgwa1+" 학생입니다.");
		
		sc.close();
		
	}

}
