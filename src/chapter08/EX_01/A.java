package chapter08.EX_01;

// 접근 제어자: 캡슐화, 객체를 보호하기 위해서 필요(보안)

	// 클래스 이름 앞: public, default(생략)
	// 필드, 메소드 앞에 접근 제어자가 반드시 붙음: public, protected, default(생략), private

	// * 클래스명, 필드명, 생성자, 메소드명 앞: 반드시 접근 제어자가 할당되어 있음(default 생략)

	// 1. public: 같은 패키지의 모든 클래스에서 접근 가능(다른 패키지에서도 접근 가능_import)
	// 2. protected: 같은 패키지의 모든 클래스에서 접근 가능 
	//				 다른 패키지에서 상속 관계에 있을 때만 접근 가능
	// 3. default: 같은 패키지 내에서 접근 가능 BUT, 다른 패키지에서 접근 불가
	// 4. private: 같은 파일에서만 접근 가능
	//			   같은 패키지에서 접근 불가, 다른 패키지에서 접근 불가 

public class A {					// (public) 자신의 패키지, 다른 패키지에서 접근할 수 있도록 허용 
	public int m = 3;
	public int n = 4;
	
	public void print() {
		System.out.println("A클래스 접근");
	}
	
}
