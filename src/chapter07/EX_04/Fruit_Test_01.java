package chapter07.EX_04;

class Fruit{
	
	// 1. 필드
	String name;		// 과일 이름
	String color;		// 과일 색깔
	int count;			// 과일 개수
	int sugarContent;	// 과일 당도 
	
	// 2. 생성자
	Fruit(){}
	Fruit(String name, String color, int count, int sugarContent){
		this.name = name;
		this.color = color;
		this.count = count;
		this.sugarContent = sugarContent;
	}
	// 3. show(): 필드의 값을 모두 출력 
	void show(){
		System.out.println(name+", "+color+", "+count+", "+sugarContent);
		}
	
	// 4. Getter & Setter
	
	public String getName() {
	return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getSugarContent() {
		return sugarContent;
	}
	public void setSugarContent(int sugarContent) {
		this.sugarContent = sugarContent;
	}
		
}		

public class Fruit_Test_01 {

	public static void main(String[] args) {
		// 1. banana 객체 생성 후 필드에 기본값을 직접 입력 후 직접 출력
		
		Fruit fruit = new Fruit("바나나", "노란색", 10, 9);
		fruit.show();
		
		System.out.println("----- 1. banana 직접 출력 -----");
		// 선생님 해설 
		Fruit banana = new Fruit();
			// 필드의 값 세팅(직접)
		banana.name = "바나나";
		banana.color = "노란색";
		banana.count = 10;
		banana.sugarContent = 9;
		
			// 필드의 값 출력
		System.out.println(banana.name);
		System.out.println(banana.color);
		System.out.println(banana.count);
		System.out.println(banana.sugarContent);
		
		// 2. apple 객체 생성자 사용해 4개의 필드에 초기값 할당 show() 출력
		
		fruit.setName("사과");
		fruit.setColor("빨간색");
		fruit.setCount(20);
		fruit.setSugarContent(7);
		
		fruit.show();
		
		System.out.println("----- 2. apple show() 출력 -----");
		// 선생님 해설
			// 생성자를 사용해서 필드의 값 초기화
		Fruit apple = new Fruit("사과", "빨간색", 20, 7);
			// show() 메소드 호출해서 출력
		apple.show();
		
		// 3. strawberry setter 사용해서 4개의 필드에 값 할당 getter 사용해 출력 
		
		fruit.setName("딸기");
		fruit.setColor("빨간색");
		fruit.setCount(18);
		fruit.setSugarContent(15);
		
		fruit.getName();
		fruit.getColor();
		fruit.getCount();
		fruit.getSugarContent();
		
		fruit.show();
		
		System.out.println("----- 3. strawberry getter & setter -----");
		//선생님 해설
		Fruit strawberry = new Fruit();
			// setter를 사용해서 필드의 값 입력
		strawberry.setName("딸기");
		strawberry.setColor("빨간색");
		strawberry.setCount(18);
		strawberry.setSugarContent(15);
		
			// getter를 사용해서 필드의 값 출력
		System.out.println(strawberry.getName());
		System.out.println(strawberry.getColor());
		System.out.println(strawberry.getCount());
		System.out.println(strawberry.getSugarContent());
		
	}
}


