package basic_02;

public class Ex05_로또 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		// 값 지정 
		for(int i=0; i<lotto.length; i++) {			// lotto 배열 수보다 적은 횟수 for문 돌리기
			lotto[i] = (int)(Math.random()*45)+1;	// 
		}
		
		// 번호 출력
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + "/");
		}
		
		// 버블정렬(오름차순)_ 두 개의 인접한 원소를 비교하여 정렬
		for(int i=lotto.length-1; i>0; i--) {	
			// lotto배열의 수보다 1씩 줄어들면서 for문 작동(가장 큰 수가 제일 먼저 제 자리를 찾아 자리를 지키기때문에 -1)
			for(int j=0; j<i; j++) {			// j는 증가 & i는 감소 → 서로 인접해질 때까지 for문 작동
				if(lotto[j]>lotto[j+1]) {		// 인접한 값과 비교
					int temp = lotto[j];		// lotto[j]값 → temp로
					lotto[j] = lotto[j+1];		// lotto[j+1]값 → lotto[j]로
					lotto[j+1] = temp;			// temp값 → lotto[j+1]로
				}
			}
		}
		
		
		
		
	}

}

/* 변수값 서로 바꿀 때 중간 매개체 필요해서 temp 사용(삼각형 모양으로) a → temp, b
 	int a = 5; b = 10;
 	
 	int temp;
 	
 	temp = a;
 	a = b;
 	b = temp;
 
  */


/*
 * Math.random(): 0.0 ← 실수 < 1.0
 * 
 *  	ex) 0.1234
 *  		0.0215
 *  		0.5678
 *  		0.9999
 * 
 * Math.random()*10
 *   	
 *  	ex) 0.1234 *10 → 1.234
 *  		0.0215 *10 → 0.215 
 *  		0.5678 *10 → 5.678
 *  		0.9999 *10 → 9.999
 * 
 * (int)Math.random()*10
 *   	
 *  	ex) 0.1234 *10 → 1.234 ▶ 1
 *  		0.0215 *10 → 0.215 ▶ 0
 *  		0.5678 *10 → 5.678 ▶ 5
 *  		0.9999 *10 → 9.999 ▶ 9
 * 
 * 
 * */

