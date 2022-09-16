package chapter10.EX_05;

class Animal{
	void cry() {
		System.out.println("동물이 웁니다.");
	}
}

class Bird extends Animal{
	@Override
	void cry() {
		System.out.println("짹짹");
	}
}

class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal{
	@Override
	void cry() {
		System.out.println("멍멍");
	}
}

public class Using_Method_Overriding_02 {

	public static void main(String[] args) {
		// 1. 각각의 타입으로 선언 + 각각의 타입으로 생성
		Animal aa = new Animal();
		Bird bb  = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		aa.cry();						// aa.cry(): Animal의 cry()를 호출
		bb.cry();						// bb.cry(): Bird의 cry()를 호출
		cc.cry();						// cc.cry(): Cat의 cry()를 호출
		dd.cry();						// dd.cry(): Dog의 cry()를 호출
		
		System.out.println("--- ---");
		
		// 2. Animal 타입으로 선언 + 자식 클래스로 객체 생성
			// 자식의 객체를 생성할 때, 부모 타입으로 정의 후 부모의 메소드를 호출 → 오버라이딩된 메소드 출력
			// 오버라이딩을 사용해서 하나의 타입으로 정의, 배열이나 컬렉션에 저장해서 관리를 쉽게 할 수 있음
		
		Animal aa1 = new Animal();
		Animal bb1 = new Bird();
		Animal cc1 = new Cat();
		Animal dd1 = new Dog();
		
		aa1.cry();						// aa1.cry(): Animal의 cry()를 호출
		bb1.cry();						// bb1.cry(): Animal의 cry()를 호출 (오버라이딩된 메소드가 출력)
		cc1.cry();						// cc1.cry(): Animal의 cry()를 호출 (오버라이딩된 메소드가 출력)
		dd1.cry();						// dd1.cry(): Animal의 cry()를 호출 (오버라이딩된 메소드가 출력)
		
		// Animal 타입으로 선언이 되어 있으므로 배열이나 컬렉션에 넣어서 아주 쉽게 관리 가능 
		// 배열의 특징: 1. 동일한 타입 저장 2. 방의 크기가 선언되면 바꿀 수 없음
		
		int[] arr1 = new int[5];					// 배열의 방 크기 지정 → 값 할당
		int[] arr2 = new int [] {1, 2, 3, 4};		// 배열 선언과 동시에 값 할당
		//타입[] 배열변수 =
		
		System.out.println("----- 객체를 배열에 저장 -----");
		
		// 객체를 배열에 저장: Animal 객체를 배열에 저장 
		Animal[] arr3 = new Animal[] {aa1, bb1, cc1, dd1};
		
		System.out.println("--- for문 사용해서 출력 ---");
		// for문을 사용해서 출력
		for(int i=0; i<arr3.length; i++) {
			arr3[i].cry();						// Animal의 cry() 호출 시 객체에서 오버라이딩된 메소드 출력
		}
		
		System.out.println("--- 향상된 for문 사용해서 출력 ---");
		// 향상된 for문을 사용해서 출력
		for(Animal k : arr3) {
			k.cry();
		}
		
		
		 
		
		
		

	}

}
