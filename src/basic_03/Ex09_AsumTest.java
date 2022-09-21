package basic_03;

public class Ex09_AsumTest {

	public static void main(String[] args) {
		
		int sum = sumFunc(3);
		System.out.println("합: "+sum);
	}

	static int sumFunc(int i) {
		// sum = 3 + 2 + 1
		if(i==1) return 1;
		
		return i + sumFunc(i-1);		// 재귀호출 / 인셉션
	}
}
