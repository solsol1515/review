package basic_02;

public class Ex03_회사B {

	public static void main(String[] args) {
		
		int count=0;								// 손뼉친 횟수 합계 선언 및 초기화
		
		for(int i=1; i<100001; i++) {				// 1부터 10000까지 돌릴 for문
			
			int su = i;								// su가 i값을 받음
			boolean su369 = false;					// 369에 해당할 경우 true로 값 변경
			
			while(su!=0) {
				int na = su%10;						// su를 10으로 나눴을 때의 나머지값을 na로 받음
					if(na==3||na==6||na==9) {			// 나머지(na)가 3, 6, 9일 때 true
						System.out.println("짝!"+"("+i+")");
						count++;					// na가 3,6,9 해당 → 
						su369 = true;
					}
					su = su/10;
			}
			if(su369)System.out.println();
			else System.out.println(i);;
		}
		
		

	}

}
