package chapter10.EX_06;

class Animal{
	// 자식 클래스에서 2개의 메소드를 오버 라이딩
	// Animal 타입으로 정의, 배열에 저장 후 오버라이딩된 메소드 출력(for, Enhanced For)
	
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
	
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
}

class Tiger extends Animal{
	@Override
	void run() {
		System.out.println("호랑이가 빠르게 달립니다.");
	}
	@Override
	void eat() {
		System.out.println("호랑이가 사냥을 해서 먹습니다.");
	}
}

class Eagle extends Animal{
	@Override
	void run() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	@Override
	void eat() {
		System.out.println("독수리가 사냥을 해서 먹습니다.");
	}
}

class Fish extends Animal{
	@Override
	void run() {
		System.out.println("물고기가 물 위를 헤엄칩니다.");
	}
	@Override
	void eat() {
		System.out.println("물고기가 먹이를 먹습니다.");
	}
}

class Dog extends Animal{
	@Override
	void run() {
		System.out.println("강아지가 공원을 산책합니다.");
	}
	@Override
	void eat() {
		System.out.println("강아지가 최애 간식을 먹습니다.");
	}
}

public class Using_Method_Overriding_03 {

	public static void main(String[] args) {
		// 1. 객체 생성(Animal 타입으로 생성)
		Animal aa = new Animal();
		Tiger tt = new Tiger();
		Eagle ee = new Eagle();
		Fish ff = new Fish();
		Dog dd = new Dog();
		
		// Animal의 메소드 호출
		aa.run();
		aa.eat();
		
		tt.run();
		tt.eat();
		
		ee.run();
		ee.eat();
		
		ff.run();
		ff.eat();
		
		dd.run();
		dd.eat();
		
		// 배열에 객체를 저장: Animal 객체를 배열에 저장
		Animal[] arr1 = new Animal[] {aa, tt, ee, ff, dd};
		
		// For문을 사용해서 배열의 내용을 출력
		System.out.println("--- for문을 사용해서 출력 ---");
		for(int i=0; i<arr1.length; i++) {
			Animal aa1 = arr1[i];
			aa1.run();									// Animal의 메소드 호출
			aa1.eat();
			
			arr1[i].run();
			arr1[i].eat();
		}
		
		System.out.println("--- Enhanced for문을 사용해서 출력 ---");
		for(Animal k : arr1) {
			k.run();									// Animal의 메소드: 오버라이딩된 메소드 출력
			k.eat();									// Animal의 메소드: 오버라이딩된 메소드 출력
		}
		
	}

}
