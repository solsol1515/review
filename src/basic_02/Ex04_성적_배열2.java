package basic_02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04_성적_배열2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int kor[] = new int[5];
		
		/*
		 * 5명의 국어점수를 입력하세요. (ex. 10/20/30)
		 */
		
		System.out.println(kor.length+"명의 국어점수를 입력하세요.(ex. 10/20/30)");
		String inputData = input.nextLine();		// 스캐너에서 입력받은 문자열을 (String)inputData로 저장
		StringTokenizer st = new StringTokenizer(inputData, "/");	// StringTokenizer를 사용해 "/"를 기준으로 문자열을 분리
		
		for(int i=0; st.hasMoreTokens(); i++){		// "/"가 있는 곳까지만 for문을 돌리고, 없는 경우 for문 탈출
			String str = st.nextToken();			// 자른 토큰을 String str에 저장
			kor[i] = Integer.parseInt(str);			// String → int 값으로 변환해서 kor[i]에 저장
		}
		
		for(int i=0; i<kor.length; i++) {
			System.out.println((i+1)+"번 학생의 점수: "+kor[i]);	// 스캐너에 입력한 값 출력 i번째 입력값(점수) 출력됨
		}
			
			// 위 학생들 점수의 총점과 평균 출력
			
			int sum = 0;									// 학생 5명 점수의 합
			for(int i=0; i<kor.length; i++) {				// 학생 수만큼 for문 작동
				sum+=kor[i];								// sum=sum+kor[i] / sum으로 학생들 점수 합산
			}
			System.out.println("학생들의 총점: "+sum);
			System.out.println("학생들의 평균: "+(double)sum/kor.length);
			
		

	}

}
