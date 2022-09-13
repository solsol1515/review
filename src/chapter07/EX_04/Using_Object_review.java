package chapter07.EX_04;

class Person{
	// class: 객체를 생성하기 위한 템플릿(틀), 붕어빵기계 or 설계도
	// Object(객체, 인스턴스): 붕어빵, 설계도에 따라 만들어진 건축물 ←  인스턴스화
	
	// ★필드 - 지역변수 구분 필요★
	// 1. 필드: 클래스 블락에서 선언된 변수(Heap에 저장), 지역변수: 메소드 블락에서 선언된 변수(Stack에 저장)
	String name;	// 이름		 : null
	float height;	// 키(실수)	 : 0.0
	float weight;	// 몸무게(실수)	 : 0.0
	int age;		// 나이		 : 0
	
	
	// 4. getter & setter
		// getter: 필드의 내용을 출력 
		// setter: 필드에 내용을 입력
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// 2. 생성자(Constructor): 1. 리턴 타입이 없음 2. 클래스 이름과 동일(메소드)
		// 필드의 기본값을 초기화
		// 생성자 오버로딩: 생성자 이름은 동일, 식별자(인풋 매개변수 타입, 개수)
	Person(){		// 기본생성자: 인풋 값이 비어있는 생성자, 생략 가능(클래스 내의 생성자가 1개일 때만)
	}
	Person(String s){							// this 키워드없이 필드에 값 할당. 변수명이 다름
		name = s;
	}
	Person (String name, float height){			// 인풋 매개변수명, 값을 받는 변수, 필드명 동일한 경우 "this"키워드 사용 필요 // "String"으로 입력 시 식별자 충돌 → 오류 발생 
		this.name = name;
		this.height = height;
	}
	Person(String name, float height, float weigth, int age){
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	
	// 3. 메소드(함수): 기능을 실행하는 코드가 저장. 호출 시 작동(메소드명();과 인풋매개변수 반드시 넣어서 호출하기)
	
	void show() {			// 필드의 내용을 출력하는 메소드
		System.out.println(name+", "+height+", "+weight+", "+age);
	}
	
	
	
	
}


public class Using_Object_review {

	public static void main(String[] args) {
		// 객체 생성: main method에서 생성!
		
		System.out.println("----- 기본생성자 호출 -----");
		
		// 1) 기본 생성자 호출
		Person person = new Person();			// 객체 생성
			// 필드 내용 출력 (1. 객체명으로 출력)
		System.out.println(person.name);		// null
		System.out.println(person.height);		// 0.0
		System.out.println(person.weight);		// 0.0
		System.out.println(person.age);			// 0	
		
		System.out.println("----- getter 사용해서 출력 -----");
		
			// getter를 사용해서 필드 내용 출력 (필드의 값을 리턴)
		System.out.println(person.getName());	// 메소드 호출
		System.out.println(person.getHeight());	// 
		System.out.println(person.getWeight());	// 
		System.out.println(person.getAge());	// 
		
		System.out.println("----- show() 메소드 호출 -----");
		
			// show(): 필드의 내용을 출력
		person.show();
		
		System.out.println("----- 매개변수 1개인 생성자 호출 -----");
		// 2) 매개변수가 1개인 생성자 호출 
		
		Person Lee = new Person("이순신");
		
		// 필드 내용 출력(1. 객체명으로 출력)
		System.out.println(Lee.name);			// 이순신
		System.out.println(Lee.height);			// 0.0
		System.out.println(Lee.weight);			// 0.0
		System.out.println(Lee.age);			// 0
		
		Lee.show();
		
		System.out.println("-----매개변수 4개인 생성자 호출 -----");
		
		// 3) 매개변수가 4개인 생성자 호출
		Person hong = new Person("홍길동", 185.5F, 80.3F, 35);
		
		System.out.println(hong.name);			// 
		System.out.println(hong.height);		// 
		System.out.println(hong.weight);		// 
		System.out.println(hong.age);
		
		hong.show();
		
		System.out.println("----- Setter & Getter -----");
		// Setter를 사용해서 필드의 값 할당, Getter를 사용해서 필드의 값 출력
		
		Person jung = new Person();
		
		// setter를 사용해서 필드에 값 할당
		jung.setName("정도령");
		jung.setHeight(183.3f);
		jung.setWeight(70.1f);
		jung.setAge(25);
		
		// getter를 사용해서 필드의 값을 호출
		
		jung.getName();
		jung.getHeight();
		jung.getWeight();
		jung.getAge();
		
		System.out.println(jung.getName());
		System.out.println(jung.getHeight());
		System.out.println(jung.getWeight());
		System.out.println(jung.getAge());
		
		jung.show();
		
		
	}

}
