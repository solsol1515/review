package chapter10.EX_02;

class Animal{
	String name = "동물";
}

class Person extends Animal{
	String personName = "사람";
}

class Person_person extends Person{
	String pName = "사람_사람";
}

public class Using_Polymorphism_01_2 {

	public static void main(String[] args) {
		// 1. Animal 객체 생성
			// Animal 객체는 Animal 타입만 내포
		Animal a1 = new Animal();
		System.out.println(a1.name);
		
		// 2. Person 객체 생성
			// a2는 Animal 타입과 Person 타입을 내포, Animal 타입으로 지정
			// Animal 타입의 필드와 메소드만 접근 가능, Person 타입으로 다운 캐스팅 가능 
		Animal a2 = new Person();
		System.out.println(a2.name);
		
			// a2) Animal → Person 타입으로 다운 캐스팅(Animal, Person의 필드와 메소드 모두 접근)
		Person p1 = (Person)a2;
		System.out.println(p1.name);
		System.out.println(p1.personName);
		
		// 3. Person 객체를 Person 타입으로 생성(Animal, Person 필드와 메소드 모두 사용됨)
		
		Person p2 = new Person();
		System.out.println(p2.name);
		System.out.println(p2.personName);
		
			// 업 캐스팅
		Animal a3 = p2;			// a3는 Animal, Person을 내포하고 있고, Animal 타입으로 지정
		System.out.println(a3.name);
		
			// 다운 캐스팅
		Person p3 = (Person)a3;	// p3는 Animal, Person을 내포하고 있고, Person 타입으로 지정
		System.out.println(p3.name);
		System.out.println(p3.personName);
		
		// 4. Person_person 객체를 Animal 타입으로 생성
			// a4는 Animal, Person, Person_person 타입을 내포하고 있고, Animal 타입으로 지정
			// Animal 타입의 필드와 메소드만 접근
		Animal a4 = new Person_person();
		System.out.println(a4.name);
		
			// 다운 캐스팅
		Person_person pp1 = (Person_person)a4;
		System.out.println(pp1.name);
		System.out.println(pp1.personName);
		System.out.println(pp1.pName);
		
		// 5. Person_person 객체를 Person_person 타입으로 생성
			// pp2는 Animal, person, Person_person을 내포함, Person_person 타입으로 지정
		Person_person pp2 = new Person_person();
		System.out.println(pp2.name);
		System.out.println(pp2.personName);
		System.out.println(pp2.pName);
		
		// 6. Person_person 객체를 Person 타입으로 생성
			// p10은 Animal타입을 내포
		Person p10 = new Person_person();
		System.out.println(p10.name);
		System.out.println(p10.personName);
		
		
		
		
		
	}

}
