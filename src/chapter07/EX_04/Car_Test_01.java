package chapter07.EX_04;

class Car{
	
	// 1. 필드
	String company;			// 제조회사
	String model;			// 모델
	String color;			// 색
	double maxSpeed;		// 최대 출력
	
	// 2. 생성자 
	Car(){}
	Car(String company, String model, String color, double maxSpeed){
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	// 3. 메소드(show(): 필드의 값 출력)
	void show(){
		System.out.println(company+", "+model+", "+color+", "+maxSpeed);
	}
	
	// 4. 메소드 (getter & setter)
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}

public class Car_Test_01 {

	public static void main(String[] args) {
		
		System.out.println("----- 1. 직접 입력 & 출력 -----");
		
		// 객체 생성
		Car car1 = new Car();
		
		// car1	/ 현대자동차 / 그랜저 <- 필드의 값을 직접 입력 & 직접 출력
		car1.company = "현대자동차";
		car1.model = "그랜저";
		car1.color = "검정색";
		car1.maxSpeed = 200;
		
		System.out.print(car1.company+", ");
		System.out.print(car1.model+", ");
		System.out.print(car1.color+", ");
		System.out.print(car1.maxSpeed);
		
		System.out.println();
		System.out.println("----- 2. 생성자 입력 & show() 출력 -----");
		
		// car2 / 쌍용자동차 / 체어맨 <- 생성자를 사용해 값 입력 & show() 사용해 출력
		
		Car car2 = new Car("쌍용자동차", "체어맨", "파란색", 190);
		
		car2.show();
		
		System.out.println("----- 3. getter & setter -----");
		
		// car3 / 기아자동차 / k9   <- setter를 통해서 값 입력 & getter 통해서 값 출력

		Car car3 = new Car();
		
		car3.setCompany("기아자동차");
		car3.setModel("K9");
		car3.setColor("회색");
		car3.setMaxSpeed(210);
		
		System.out.print(car3.getCompany()+", ");
		System.out.print(car3.getModel()+", ");
		System.out.print(car3.getColor()+", ");
		System.out.print(car3.getMaxSpeed());
		
	}

}
