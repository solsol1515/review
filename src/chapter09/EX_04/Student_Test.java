package chapter09.EX_04;

class Student{
	
	static int serialNum = 1000;		// 모든 객체에서 "공유하는 필드", 객체를 생성할 때마다 1씩 증가
	int StudentID;						// 학생 ID
	String studentName;					// 학생 이름
	int grade = 4;						// 학년: 기본값(4학년)
	String address = "서울";				// 주소: 기본값("서울")

	Student(){
		serialNum++;					// 객체 생성 시 1씩 증가, 모든 객체에서 공유해서 사용
		StudentID = serialNum;
		grade = 4;
		address = "서울";
	}
	Student(String studentName){
		this();							// 기본 생성자 호출 후 아래 내용 실행
		this.studentName = studentName;
	}
	
	void print() {
		System.out.println("학번: "+StudentID);
		System.out.println("이름: "+studentName);
		System.out.println("학년: "+grade+"학년");
		System.out.println("주소: "+address);
		System.out.println();
	}
}

public class Student_Test {

	public static void main(String[] args) {
		
		// 객체 생성 시 자동으로 학번이 1000번부터 1씩 증가 
		// studentID: 1000번부터 학생 객체를 생성할 때마다 고유한 값으로 적용되어 있어야한다.
		
		Student lee = new Student("이지원");			// 1001번 이지원
		// lee.studentName = "이지원";
		lee.print();
		
		Student hong = new Student("홍지원");			// 1002번
		// hong.studentName = "홍지원";
		hong.print();
		
		Student jung = new Student("정지원");			// 1003번
		// jung.studentName = "정지원";
		jung.print();
		
		Student park = new Student("박지원");			// 1004번
		// park.studentName = "박지원";
		park.print();
	}

}
