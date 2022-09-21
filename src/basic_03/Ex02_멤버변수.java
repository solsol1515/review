package basic_03;

public class Ex02_멤버변수 {
	
	static int a = 10, b = 20;					// 멤버변수
	static int sum = 0;							// 멤버변수 (지역변수가 아니기때문에 static void와 main에서 모두 인식 가능)
		
	public static void main(String[] args) {
		add();
		// 두 수를 더한 결과를 출력
		System.out.println("합: "+sum);
	}
	
	static void add(){
		// 두 수를 더하기
		sum = a+b;
	}
}
