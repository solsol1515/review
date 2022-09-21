package basic_03;

public class Ex03_CallByString {

	public static void main(String[] args) {
		
		String a = new String("안녕");
		String b = new String("하이");
		
		add(a, b);
		System.out.println("(main)A = "+a+", B = "+b);		// 2 안녕, 하이
		// 
	}
	static void add(String a, String b) {
		
		a += b;												// a+=b
		System.out.println("(static)A = "+a+", B = "+b);	// 1 안녕하이, 하이
		// heap 영역에 새롭게 구역을 만들어 값을 따로 저장함
	}
	

}
