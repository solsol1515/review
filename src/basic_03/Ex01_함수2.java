package basic_03;

public class Ex01_함수2 {

	public static void main(String[] args) {
		
		int sum = add();					// sum 값을 add에서 받아서 변수 sum에 저장(저장 안하면 데이터 날아감) 
		// 합을 여기서 출력
		System.out.println("합: "+sum);
	}

		static int add() {					// 반드시 void(반환 값 없을 때 사용) 앞에 static 붙이기
			int a = 10, b = 20;
			int sum = a + b;
			return sum;						// main으로 sum 보내주기
		}
}
