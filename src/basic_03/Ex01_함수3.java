package basic_03;

public class Ex01_함수3 {

	public static void main(String[] args) {

		int [] result = add();					// 배열(arr)로 보낸 값 배열(resault)로 받음 
		// a와 b의 값을 받아서 합산한 결과를
		// 여기서 출력
		int sum = 0;							// (a, b의 합) 초기화
		for(int i=0; i<result.length; i++) {
			sum+=result[i];
		}
		System.out.println("합: "+sum);
	}

		static int[] add() {
			int a = 10, b = 22;
			int [] arr = {a, b};				// java는 return값이 하나이기때문에 배열로 값을 하나로 만들어 보내줌 (배열로 보내지 않을 경우, a나 b 둘 중 하나만 보낼 수 있음)
			
			return arr;
		}
}
