package inherit;

public class Ddal extends Umma{

	public Ddal() {
		System.out.println("딸 생성");
	}
	
	public void study() {				// 딸 객체 고유의 메소드
		System.out.println("딸은 공부 중");
	}	
	public void job() {
		System.out.println("직업 없음");
	}
	public void gene() {
		System.out.println("엄마 딸");
	}
		
	
}
