package basic_02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex05_성적관리 {

	public static void main(String[] args) {
		
		/*
		입력할 학생수를 입력하세요. 4
		
		4명의 국어, 영어, 수학 점수를 받아 결과 출력하기

		1째 학생의 성적을 입력 -> 88/77/66
		2째 학생의 성적을 입력 -> 50/40/70
		3째 학생의 성적을 입력 -> 44/33/22
		4째 학생의 성적을 입력 -> 55/50/70

		[결과]

		1째 학생의 총점 xxx 이고 평균은 ooo 입니다
		2째 학생의 총점 xxx 이고 평균은 ooo 입니다
		3째 학생의 총점 xxx 이고 평균은 ooo 입니다
		4째 학생의 총점 xxx 이고 평균은 ooo 입니다
------------------------------------------------------------
		국어과목  총점 xxx 이고 평균은 ooo 입니다
		영어과목  총점 xxx 이고 평균은 ooo 입니다
		수학과목  총점 xxx 이고 평균은 ooo 입니다
		*/
		
		int student = 0;										// student 초기화
		String score = null;									// score 초기화
		
		int [][] studentScore = new int[student][3];			
		// 행: 콘솔에서 입력한 학생의 수를 저장, 열: 과목수인 3을 입력해줌 > studentScore에 저장
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("성적을 입력할 학생의 수를 입력해주세요.(4)");
		student = input.nextInt();								// 콘솔에 입력한 숫자를 student로 저장	(학생 수)_int
		
		System.out.println("학생의 성적을 입력해주세요.(ex. 88/77/66)");
		for(int i=0; i<=student; i++) {
			score = input.nextLine();								// 콘솔에 입력한 숫자를 score로 저장	(과목별 점수)_String
		}
		
		StringTokenizer st = new StringTokenizer(score, "/");	// st은 StringTokenizer를 이용해서 "/"를 기준으로 데이터를 분리함
		
		int score1=0;											// score1 초기화(점수)
		for(int i=0; st.hasMoreTokens(); i++) {
			String str = st.nextToken();						// st에서 분리한 토큰을 str에 String 형태로 저장함 
			score1 = Integer.parseInt(str);						// score1으로 str을 받으면서 정수로 변환 (점수)
		}
		
		// 출력하기 
		int sum = 0;											// 총점
		int avg = 0;											// 평균
		for(int i=1; i<student+1; i++) {
			sum+=score1;
			
			System.out.println(i+"째 학생의 촘점은 "+sum+"이고, 평균은 "+avg+" 입니다.");
			
		}
			
		
		
	}

}
