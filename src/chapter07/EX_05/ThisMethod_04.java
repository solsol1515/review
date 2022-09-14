package chapter07.EX_05;

class Car{

	// this 키워드: 필드나 메소드 선언 시 사용 불가 
		// 생성자, 메소드 내부에서 필드나 다른 메소드를 사용할 때 자신의 객체 필드나 메소드를 지칭할 때 사용
		// 자신의 객체의 필드, 메소드를 가리킨다. (기본적으로 생략해서 많이 사용)
		// 반드시 사용해야할 경우: 메소드, 생성자에서 입력 매개변수 이름, 필드 이름이 동일할 경우 
	// this(): 생성자 내부에서만 사용, 반드시 첫번째 라인에 위치해야함
		// 자신의 객체의 다른 생성자 호출 시 사용 
		// 생성을 오버라이딩할 때, 코드를 간략하게 사용
	
	String companyName;			// 현대자동차
	String color;				// 검은색
	double maxSpeed;			// 200.0km/h
	
	// 생성자
	Car(){							// 리턴 타입이 없고, 클래스 이름과 동일
		companyName = "현대자동차";		// 앞에 "this."이 생략됨 (this.companyName)_this 키 생략 시 자동으로 컴파일러가 할당
		color = "검은색";
		maxSpeed = 200.0;
	}
	Car(String companyName){		// 매개변수 이름과 필드의 이름이 같을 때, this 키워드 사용 필요 
		this();						// this() 메소드, 기본 생성자 호출 > 필드의 기본값 입력
		this.companyName = companyName;
	}
	
	Car(String companyName, String color){
		this(companyName);
		this.color = color;
	}	
	Car(String companyName, String color, double maxSpeed){
		this(companyName, color);
		this.maxSpeed = maxSpeed;
	}
	// 필드의 모든 값 출력 메소드 (print())
		
	void print(){
		System.out.println(companyName+" "+color+" "+maxSpeed+"km/h");
	}
	
}


public class ThisMethod_04 {

	public static void main(String[] args) {
		// this keyword, this Method 사용해서 처리
		
		System.out.println("--- 매개변수 0 ---");
		// 1. 매개변수 0개일 때, 기본 필드의 값 출력
		Car car0 = new Car();
		car0.print();

		System.out.println("--- 매개변수 1 ---");
		// 2. 매개변수 1개일 때, companyName만 출력, 나머지는 기본값 출력
		Car car1 = new Car("기아");
		car1.print();
		
		System.out.println("--- 매개변수 2 ---");
		// 3. 매개변수 2개일 때, companyName, color 출력
		Car car2 = new Car("포르쉐", "회색");
		car2.print();
		
		System.out.println("--- 매개변수 3 ---");
		// 4. 매개변수 3개일 때, 전부 출력
		Car car3 = new Car("벤츠", "파란색", 250.0);
		car3.print();
	}

}
