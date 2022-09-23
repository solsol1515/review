package inherit;

public class MainTest {

	public static void main(String[] args) {
		
	/*Umma u = new Umma();
	u.job();
	u.gene();
	
	Ddal d = new Ddal(); 
	d.study();
	d.job();		// 엄마의 메소드를 상속받아 출력하기때문에 수정 필요
	d.gene();
	*/

	// Ddal d = new Umma(); <오류발생>
		
	// * 부모 변수에 자식 객체 생성 가능: overriding된 자식객체만 호출 가능
	/*Umma u = new Ddal();
	u.gene();
	u.job();
	*/
		
	// u.study();   오버라이딩 안 됨 (딸 객체 고유의 메소드)
	
	// * 형 변환: (casting)
	// 1. 기본형끼리만 가능
	// 2. 참조형에서 "상속 관계"에 있는 경우만 가능
	
	// String s = new String("~");
	// StringBuffer sb = (StringBuffer)s; → 불가 
	
	//Umma u = new Umma();
	//Ddal d = (Ddal)u;
	
	Ddal d = new Ddal();
	Umma u = (Umma) d;		// upcasting
	Ddal d2 = (Ddal)u;		//downcasting
		
		
	}

}

