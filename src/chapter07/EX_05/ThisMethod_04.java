package chapter07.EX_05;

class Car{
	
	String companyName;			// 현대자동차
	String color;				// 검은색
	double maxSpeed;			// 200.0km/h
	
	// 생성자
	Car(){
		companyName = "현대자동차";
		color = "검은색";
		maxSpeed = 200.0;
	}
	Car(String companyName){
		this();
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
		
		// 1. 매개변수 0개일 때, 기본 필드의 값 출력
		Car car1 = new Car();
		car1.print();

		// 2. 매개변수 1개일 때, companyName만 출력, 나머지는 기본값 출력
		Car car2 = new Car("기아");
		car2.print();
		
		// 3. 매개변수 2개일 때, companyName, color 출력
		Car car3 = new Car("포르쉐", "회색");
		car3.print();
		
		// 4. 매개변수 3개일 때, 전부 출력
		Car car4 = new Car("벤츠", "파란색", 250.0);
		car4.print();
	}

}
