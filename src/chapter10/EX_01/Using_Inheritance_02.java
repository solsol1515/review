package chapter10.EX_01;

class Fruit{									// 과일(부모 클래스)
	String name;								// 과일 이름
	String color;								// 과일 색깔
	int large;									// 과일 크기
	
	void eat() {
		System.out.println("과일은 맛있습니다.");	
	}
	void print() {
		System.out.println("종류: "+name+"  색: "+color+"  크기: "+large);
	}
	
	
}

class Apple extends Fruit{									// 사과(자식 클래스)
	// 자식 클래스만 가지는 필드1, 메소드 1
	
	String other;											// 다른 종류
// 선생님 답안
	int appleCount;
	void wash() {
		System.out.println("세척이 필요합니다.");
	}
	
// 선생님 답안
	void show() {
		System.out.println("사과의 개수: "+ appleCount);
	}
}

class Orange extends Fruit{									// 오렌지(자식 클래스)
	// 자식 클래스만 가지는 필드1, 메소드 1
	
	String ad;												// 원산지
// 선생님 답안	
	int orangeCount;
	
	void ad1() {
		System.out.println("원산지는 미국입니다.");
	}
// 선생님 답안	
	void show() {
		System.out.println("오렌지의 개수: "+ orangeCount);
	}
	
}

class Banana extends Fruit{									// 바나나(자식 클래스)
	// 자식 클래스만 가지는 필드1, 메소드 1
	
	String ad2;												// 개수
// 선생님 답안
	int bananaCount;
	
	void ad22() {
		System.out.println("원산지는 필리핀입니다.");				// 원산지
	}
// 선생님 답안	
	void show() {
		System.out.println("바나나의 개수: "+ bananaCount);
	}
	
}

public class Using_Inheritance_02 {

	public static void main(String[] args) {
		System.out.println("--- 1. Fruit(부모) 객체 출력 ---");
		Fruit f = new Fruit();
		
		f.name = "과일";
		f.color = "과일색깔";
		f.large = 10;
		
		f.eat();
		f.print();
		
		System.out.println("--- 2. Apple(자식) 객체 출력 ---");
		// 사과
		Apple a = new Apple();

		a.name = "사과";
		a.color = "빨간색";
		a.large = 5;
		a.other = "초록색 사과";
		System.out.println(a.other);			
		a.appleCount = 25;						// 선생님 답안
		
		a.eat();
		a.print();
		a.wash();
		
		a.show();								// 선생님 답안
		
		System.out.println("--- 3. Orange(자식) 객체 출력 ---");
		// 오렌지
		Orange o = new Orange();
		
		o.name = "오렌지";
		o.color = "주황색";
		o.large = 10;
		o.ad = "미국";
		System.out.println(o.ad);
		o.orangeCount = 35;						// 선생님 답안
		
		o.eat();
		o.print();
		o.ad1();
		
		o.show();								// 선생님 답안
		
		// 바나나
		
		System.out.println("--- 4. Banana(자식) 객체 출력 ---");
		Banana b = new Banana();
		
		b.name = "바나나";
		b.color = "노란색";
		b.large = 3;
		b.ad2 = "여러개";
		System.out.println(b.ad2);
		b.bananaCount =  20;					// 선생님 답안
		
		b.eat();
		b.print();
		b.ad22();
		
		b.show();								// 선생님 답안
		
		
		
	}

}
