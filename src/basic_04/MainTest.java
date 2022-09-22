package basic_04;

public class MainTest {

	public static void main(String[] args) {
		
		Student s0 = new Student();
		
		// 값 지정 1 - setter
		/*
		s.setName("홍길동");	// setter&getter 권한 줄여서 보안성 높임
		s.setKor(100);
		s.setEng(30);
		s.setMath(55);
		*/
		
		// 값 지정 2 - 생성자
		Student s = new Student("홍길자", 100, 85, 75);
		
		s.calTotal();
		s.caㅣAvg();
		// s.total = 0; // total 값 0으로 바꿈(오류 발생)ㄴ
		s.output();
	
	}

}
