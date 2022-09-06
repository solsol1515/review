package chapter02.EX06;

public class PrimaryDataType_1 {

	public static void main(String[] args) {
		
		// byte < short < int < long < float < double
		
		// 업캐스팅: 자동으로 적용, 작은 데이터 타입 > 큰 데이터 변환 
		// 다운캐스팅: 수동으로 적용 필요, 큰 데이터 > 작은 데이터 변환
		
		// 자바에서 '=' 왼쪽과 오른쪽은 반드시 데이터 타입이 같아야 한다. 
			// 예외) byte, short
		
		int a = 10;
		float b = 10.11F;
		float c = a + b;   //  정수a는 자동으로 float으로 업캐스팅됨
		System.out.println(c);
		
		// int d = a + b;   오류 발생 > b를 다운캐스팅(수동) 해줘야함
		int d = a + (int)b;   // 20_ float b를 int b로 다운캐스팅 
		System.out.println(d);

		// boolean: true or false
		boolean boo1 = true;
		boolean boo2 = false;
		System.out.println(boo1);
		System.out.println(boo2);
		
		// 정수: byte, short, int, long
		// 기본 값은 int 값으로 정의
		
		byte value1 = 10; 
		short value2 = -10;
		int value3 = 100;
		long value4 = -100;   // int 값이 long 데이터 타입으로 업캐스팅 되어서 들어감
	}

}
