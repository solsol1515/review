package chapter07.EX_01;

class Circle{
	int radius;
	String name;
	
	Circle(int radius, String name){
		this.radius = radius;
		this.name = name;
	}
	
	void call() {
		double area = 3.14 * radius * radius;
		System.out.println(name + "의 넓이는 " + area + "입니다.");
	}
}
public class Using_Method_02 {

	public static void main(String[] args) {
		// 원의 지름을 넣었을 때 전체 넓이를 구하는 객체 생성 후 출력
		// 	피자: 반지름 10
		// 	도넛: 반지름 5
		
		// <피자>의 넓이는 <00>입니다. 
		// <도넛>의 넓이는 <00>입니다.
	
		Circle pizza = new Circle(10, "피자");
		pizza.call();
		
		Circle donut = new Circle(5, "도넛");
		donut.call();
		
		
	}

}
