package chapter10.EX_07;

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
	
	int count;									// 호랑이의 수
	Tiger(int a){
		count =a;
	}
	
	/* 선생님 해설
	Tiger(int count){
		this.count = count;
	}
	*/
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
	
	int count;									// 독수리의 수
	Eagle(int a){
		count =a;
	}
	/* 선생님 해설
		Eagle(int count){
			this.count = count;
		}
	*/	
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
	
	int count; 									// 물고기의 수
	Fish(int a){
		count =a;
	}
	/* 선생님 해설
		Fish(int count){
			this.count = count;
		}
	*/
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
	
	int count;									// 강아지의 수
	Dog(int a){
		count =a;
	}
	/* 선생님 해설
		Dog(int count){
			this.count = count;
		}
	*/	
	@Override
	void run() {
		System.out.println("강아지가 공원을 산책합니다.");
	}
	@Override
	void eat() {
		System.out.println("강아지가 최애 간식을 먹습니다.");
	}
}

public class Using_Method_Overriding_04 {

	public static void main(String[] args) {
		// 1. 객체 생성(Animal 타입으로 생성)
			// 생성자를 통해서 각각의 필드에 값을 할당	
			
			Animal aa = new Tiger(100);
			Animal ee = new Eagle(12);
			Animal ff = new Fish(2);
			Animal dd = new Dog(101);
			Animal[] arr = new Animal[] {aa, ee, ff, dd};
				
			// 객체를 배열에 저장
			
				
			// For문을 사용해서 출력: ear(), run() 동물의 총 마릿수: XX
				
				System.out.println("--- For문을 사용해서 Animal 객체로 뽑기 ---");
				// 1. For문을 사용해서 객체를 Animal 객체로 뽑기
				
				// 동물의 총 합을 구하는 변수 선언
				int sum = 0;
				
				for(int i=0; i<arr.length; i++) {
					// 배열에 각 방에 저장된 객체를 Animal 객체에 저장
					Animal a11 = arr[i];
					a11.eat();			// Animal의 eat()메소드: 오버라이딩된 메소드 출력
					a11.run();
					
					arr[i].eat();
					arr[i].run();
					
					System.out.println("--- 다운 캐스팅 ---");
					
					if (arr[i] instanceof Tiger) {		// if(a11 instanceof Tiger)
						Tiger t1 = (Tiger) arr[i];
						sum+= t1.count;
						System.out.println("Tiger count: "+t1.count);
					}else if(arr[i] instanceof Eagle) {
						Eagle t1 = (Eagle) arr[i];
						sum+=t1.count;
					}else if(arr[i] instanceof Fish) {
						Fish t1 = (Fish) arr[i];
						sum+=t1.count;
					}else if(arr[i] instanceof Dog) {
						Dog t1 = (Dog)arr[i];
						sum+=t1.count;				// sum = sum + t1.count
					}
				}
				
				System.out.println("--- count 값 출력 ---");
				System.out.println("동물들의 총 합은: "+sum);
				// 2. 다운 캐스팅해서 자식 필드의 count 값을 읽어서 총 더한 값을 출력

	}

}
