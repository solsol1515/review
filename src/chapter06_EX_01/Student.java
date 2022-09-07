package chapter06_EX_01;

public class Student {

	// 필드: 클래스 블락에 선언된 변수(Heap 영역에 저장, 강제 초기화됨)
	int kor;			// 국어 점수
	int eng;			// 영어 점수
	int math;			// 수학 점수
	String name;		// 학생 이름
	
	// 생성자
	Student () {}		// 기본 생성자(생략 가능)
	Student (int kor, int eng, int math, String name){									// 지역변수: kor, eng, math, name
		this.kor = kor;																	// this 키워드: 자신의 필드의 값을 뜻함
		this.eng = eng;
		this.math = math;
		this.name = name;
		
	}	
	
	// 메소드: 합과 평균을 계산해서 출력해주는 메소드
	void call () {
		int sum;
		sum = kor + eng + math;
		double avg;
		avg = sum/3.0;
		System.out.println(name+"의 총 점수: "+sum+"점이고, 평균: "+avg+"점입니다.");
	}
	
		
		
	
	
}
