package basic_02;

/* [문제]
 * 1부터 50까지 숫자 중에서 3, 6, 9 숫자가 포함되면
 * 그 개수만큼 '짝' 글자를 출력하고
 * 그렇지 않으면 숫자 출력
 * 
 * ex)  26				123
 * 		6 →				 3 →
 * 		2 →				 2 →
 * 						 1 →
 */

public class Ex03_369 {

	public static void main(String[] args) {
		
		for(int i=1; i<51; i++) {
			
			int su = i;			 						// for문이 입력하는 값을 su로 받음 
			boolean su369 = false;						// su369가 참이 될 때 비교하려고 false를 default로 넣음
			
			while(su!=0) {								// 1~50까지의 숫자가 0이 아니기때문에 while문으로 진행됨
				int na = su%10;							// 들어간 값을 10으로 나눴을 때 나머지 값: na
			
				if(na==3||na==6||na==9) 				// 10으로 나눴을 때 나머지 3, 6, 9
				{
					System.out.print("짝");				// 10으로 나눴을 때 나머지 3, 6, 9일 때 → '참'
					su369 = true;						// false → true
				}
				su = su/10;								// 다시 생각해보기 10으로 나눴을 때의 몫 값(su를 0이 될 때까지 만들어서 while문을 빠져나가게 만듦)
				// ex) 23일 때 na를 3으로 만들고 su값은 2가 됨 → su 값이 2가 되어 while문을 재작동 → su = 2/10이 되어 su의 값은 0이됨 → while문 탈출 
			}	
			if(su369) System.out.println();				// 나머지 값이 3, 6, 9인 경우 → 참 → 한 줄 띄고, 다시 for문 실행
			else System.out.println(i);					// 나머지 값이 3, 6, 9가 아닌 경우 → 숫자 i 출력
		}
		
		
	}

}
