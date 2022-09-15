package chapter10.EX_01;

// 클래스 내부 구성 요소: 1. 필드 2.생성자 3. 메소드 4. 내부클래스

// 클래스 외부 구성 요소: 1. 패키지 2. 임포트 3. 외부클래스

// 상속(Inheritance): 객체 지향 언어의 꽃
	// 부모 클래스(Super Class)의 필드와 메소드, 이너클래스를 자식 클래스에 물려준다.
	// 자식 클래스(Child Class)는 부모 클래스의 코드(필드, 메소드, 이너클래스)를 
	// 중복 코드 방지
	// 코드를 간결하게 사용
	// 유지보수를 아주 쉽게 한다
	// 다형성 사용: 부모 클래스의 메소드를 자식 클래스에서 재정의해서 사용
		// 다양한 타입으로 사용 가능

// 부모 클래스(Super Class): 자식 클래스의 공통적인 특징을 가지는 클래스

class Human{			// 사람: 부모 클래스 > 자식 클래스의 공통적인 필드와 메소드를 선언
	// 필드
	String name;
	int age;
	
	// 메소드 정의
	void eat() {
		System.out.println("모든 사람은 먹는다.");
	}
	void sleep() {
		System.out.println("모든 사람은 잠을 잔다.");
	}
	void print() {
		System.out.println(name+", "+age);
	}
}

// 자식 클래스(Child Class): 부모 클래스의 필드와 메소드를 그대로 상속받음
	// 자식 클래스만의 특징이 적용된 필드와 메소드 선언 

class Student extends Human{			// 학생 → 사람(Student class는 Human class 상속받음)
	// 부모 클래스의 필드와 메소드가 그대로 내려옴
	// 자식 클래스의 특징을 가진 필드와 메소드를 선언
		int studentID;					// 자식 클래스(student)에만 선언된 필드
		void goToSchool() {				// 자식 클래스(student)에만 사용가능한 메소드
			System.out.println("학생이 학교에 갑니다.");
		}
}

class Worker extends Human{
	// 부모 클래스의 필드와 메소드가 그대로 내려옴
	// 자식 클래스의 특징을 가진 필드와 메소드를 선언
		int workerID;
		void goToWork() {
			System.out.println("직장인이 일하러 직장에 갑니다.");
	}
	
}

class Professor extends Human{
	// 부모 클래스의 필드와 메소드가 그대로 내려옴
	// 자식 클래스의 특징을 가진 필드와 메소드를 선언
		int professorID;
		void goToCollage() {
			System.out.println("교수님은 대학에 갑니다.");
		}
	
}
public class Using_Inheritance_01 {

	public static void main(String[] args) {
		System.out.println("--- Human(Super class) 객체 출력 ---");
		//1. Human 클래스 객체 생성(부모)
		Human h = new Human();
		
		h.name = "아이유";
		h.age = 30;
		
		h.eat();
		h.sleep();
		h.print();
		
		System.out.println("--- Student(Child class) 객체 출력 ---");
		// Student 클래스 객체 생성(자식)
		Student s = new Student();
		
		s.name = "안유진";			// 부모 클래스에서 상속된 필드
		s.age = 20;					// 부모 클래스에서 상속된 필드
		s.studentID = 20201;		// Student 클래스에 존재하는 필드
		
		s.eat();					// 부모 클래스에서 상속된 메소드
		s.sleep();					// 부모 클래스에서 상속된 메소드
		s.print();					// 부모 클래스에서 상속된 메소드
		s.goToSchool();				// Student 클래스에 존재하는 메소드
		
		System.out.println("--- Worker(Child class) 객체 출력 ---");
		// 3. Worker 클래스 객체 생성(자식)
		Worker w = new Worker();
		
		w.name = "이영지";			// 상속 필드
		w.age = 21;					// 상속 필드
		w.workerID = 21211;			// 자신의 필드
		
		w.eat();					// 상속 메소드
		w.sleep();					// 상속 메소드
		w.print();					// 상속 메소드
		w.goToWork();				// 자신의 메소드
		
		System.out.println("--- Professor(Child class) 객체 출력 ---");
		// 4. Professor 클래스의 객체 생성(자식)
		Professor p = new Professor();
		
		p.name = "미미";				// 상속 필드
		p.age = 35;					// 상속 필드
		p.professorID = 35351;		// 자신의 필드
		
		p.eat();					// 상속 메소드
		p.sleep();					// 상속 메소드
		p.print();					// 상속 메소드
		p.goToCollage();			// 자신의 메소드
		
	}

}
