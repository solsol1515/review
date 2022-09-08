package chapter07.EX_03;

class BB{
	
	// 필드
	int kor;
	int eng;
	int math;
	String name;
	
	// 기본생성자
	BB(){}
	// 객체 생성 시 필드의 값을 초기화
	BB(int a, int b, int c, String name){
		kor = a;
		eng = b;
		math = c;
		this.name = name;
	}
	
	// getter & setter를 사용한 필드의 값 초기화 ← ★ 중요 ★ 필드의 초기값 할당
	// Setter: 필드의 초기값을 할당
	// Getter: 필드의 값을 출력
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	void show() {			// 메모리의 정보를 출력하는 메소드
		System.out.println(kor+", "+eng+", "+math+", "+name);
	}
	
	
	
}

public class Using_Constructor_03 {

	public static void main(String[] args) {
		// 필드의 값을 할당하는 3가지 방법
		
		BB bb1 = new BB();
		
		// 1. 필드의 값을 직접 할당
		bb1.kor = 80;
		bb1.eng = 90;
		bb1.math = 70;
		bb1.name = "홍길동";
		bb1.show();
		

		// 2. 생성자를 사용해서 필드의 초기 값을 할당
		
		BB bb2 = new BB(70, 80, 90, "김유신");
		bb2.show();
		
		// 3.Setter를 사용해서 값을 입력 ← 가장 多 사용
		
		BB bb3 = new BB();
		bb3.setEng(70);
		bb3.setKor(80);
		bb3.setMath(90);
		bb3.setName("강감찬");
		bb3.show();
		
		
		
		
		
	}

}
