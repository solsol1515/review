package chapter06_EX_01;

public class Student_Test_01 {

	public static void main(String[] args) {
		// 객체 생성은 반드시 main method에서 생성해야한다.
		
		// 같은 패키지에 내부에 있는 클래스는 import없이 바로 호출 가능
		
		// 생성자: 객체 생성 시 필드의 초기값을 할당할 때 사용
		Student Lee = new Student(80, 99, 70, "Lee");
		Lee.call();																		// Lee의 총 점수: 249점이고, 평균: 83.0점입니다.
		
		Student Hong = new Student(88, 99, 77, "Hong");
		Hong.call();																	// Hong의 총 점수: 264점이고, 평균: 88.0점입니다.
		
		Student Song = new Student(80, 60, 99, "Song");
		Song.call();																	// Song의 총 점수: 239점이고, 평균: 79.66666666666667점입니다.
		
		Student Jung = new Student();
		Jung.call();																	// null의 총 점수: 0점이고, 평균: 0.0점입니다.
			

	}

}
