package chapter05.EX_01;

import java.util.Scanner;

public class Using_Array_10 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		// 국어 80 영어 50 수학 77 과학 88	전체 라인을 인풋 받아서 공백을 기준으로 잘라서 배열에 저장 
		
		System.out.println("각 과목과 점수를 공백을 구분해서 넣으세요. >> ");
		String s = sc.nextLine();
		
		System.out.println(s);
		
		// 공백을 기준으로 들어온 데이터를 잘라서 배열에 저장
		String[] arr;   // 배열 선언
		arr = s.split(" ");   // 공백을 기준으로 잘라서 arr 배열에 저장(??? 띄어쓰기한 기준으로 데이터를 쪼개서 사용할 수 있도록 각각의 데이터를 분리해놓음???)?
		// arr배열의 전체를 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);   // String
		}
		// 배열의 홀수 방의 값을 가지고 와서 (정수) 값을 가져와서 합과 평균을 구한다.
		int b;   // 각 과목의 점수를 담는 변수 
		int sum = 0;   // 합의 구하는 변수
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(i%2!=0) {  //홀수방의 값만 가져온다.
				b = Integer.parseInt(arr[i]);   // 홀수방의 값만 b변수에 저장
				sum += b;
				count++;
			}
		System.out.println("과목의 합: "+sum);
		System.out.println("과목의 평균: "+sum/(double)count);
		
		
		
		
		
		}
		
	}

}
