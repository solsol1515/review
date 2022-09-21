package basic_02;

public class Ex03_구글입사문제 {

	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i=1; i<=10000; i++) {				// 1~10,000까지 for문 실행
			int su = i;								// i를 su로 입력함
			
			while(su!=0) {							// su가 0이 아닐 경우 true → while문 실행
				int na = su%10;						// su를 10으로 나눈 나머지를 na로 입력
				
				if(na==8) {							// na가 8일 경우 true → if문 실행
					count++;						// └ count의 값이 1씩 증가
				}
				su = su/10;							// while문을 빠져나가기 위한 장치 (10으로 나눠 su값을 0으로 만들어 while문을 탈출할 수 있다)
			}
			
		}
		System.out.println(count);
	}

}
