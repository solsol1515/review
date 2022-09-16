package chapter10.EX_04;

class Aa{
	int a = 10;
	void a() {
		System.out.println("A class 출력");
	}
}

class Bb extends Aa{						// 자식 클래스 객체 생성 시 부모 클래스의 기본 생성자를 호출해서 부모클래스가 먼저  

	int b = 20;
	void b() {
		System.out.println("B class 출력");
	}
}		
class Cc extends Bb{
	int c = 30;
	void c() {
		System.out.println("C class 출력");
	}
}
public class Using_TypeCasting_02 {

	public static void main(String[] args) {
		// 다형성: 상속 관계일 때 하나의 객체가 여러 타입으로 정의해서 사용 가능
		
		// 1. Aa 객체 Aa 타입을 생성
			// aa1은 Aa 타입만 내포, Aa 타입으로 지정
			// aa1은 Aa의 필드나 메소드만 사용 가능
		System.out.println("--- 1. Aa 객체를 Aa타입으로 생성 ---");
		Aa aa1 = new Aa();
		System.out.println(aa1.a);
		aa1.a();
		
		// 2. Bb객체를 Bb 타입으로 생성
			// bb1은 Aa, Bb를 내포하고 있다. Bb 타입으로 지정
			// bb1은 Aa, Bb의 필드와 메소드를 모두 사용 가능
		System.out.println("--- 2. Bb 객체를 Bb타입으로 생성 ---");
		Bb bb1 = new Bb();
		
			// Aa 타입의 필드와 메소드 출력
				System.out.println(bb1.a);
				bb1.a();
			// Bb 타입의 필드와 메소드 출력
				System.out.println(bb1.b);
				bb1.b();
			
			// bb1을 Aa 타입으로 업 캐스팅
				Aa aa2 = bb1;							// 자동으로 업 캐스팅
					// aa2는 Aa의 필드와 메소드만 접근
				System.out.println(aa2.a);
				aa2.a();
				
			// aa2를 Bb 타입으로 다운 캐스팅 
				Bb bb2 = (Bb)aa2;
				System.out.println(bb2.a);
				System.out.println(bb2.b);
				bb2.a();
				bb2.b();
				
			// 업 캐스팅은 구문에서 오류가 바로 발생됨
			// 다운 캐스팅은 구문에서 오류 발생되지 않음. 실행 시 오류 발생
				// instance of를 사용해서 오류가 발생하지 않도록 처리 필요 ← 
				// bb1은 Cc 타입을 내포하고 있지 않기때문에 캐스팅하면 오류 발생
				if(bb1 instanceof Cc) {							// bb1 객체에 Cc 타입을 내포하고 있을 때 true가 리턴
				Cc cc1 = (Cc)bb1;
				} else {
					System.out.println("bb1은 Cc 타입을 내포하고 있지 않습니다.");
				}
				
				if(bb1 instanceof Aa) {							// bb1은 Aa 타입을 내포하면 true, 아닐 경우 false
					Aa aa10 = (Aa)bb1;
					System.out.println("Aa 타입을 내포하고 있습니다.");
				}else {
					System.out.println("Aa 타입을 내포하고 있지 않습니다.");
				}
				
				System.out.println("----------");
				
				// 3. Cc 객체를 Aa 타입으로 생성
					// aa20은 Aa, Bb, Cc를 내포하고 있고, Aa 타입으로 지정
					// aa20은 Aa의 필드와 메소드만 사용 가능
				Aa aa20 = new Cc();
					System.out.println(aa20.a);
					aa20.a();
					
				// 다운 캐스팅을 할 때는 instanceof를 사용해야한다.
				// (aa20): Aa → Bb 타입으로 다운 캐스팅
					if (aa20 instanceof Bb) {
						Bb bb30 = (Bb)aa20;
						System.out.println(bb30.a);
						System.out.println(bb30.b);
						bb30.a();
						bb30.b();
					}
					if(aa20 instanceof Cc) {
						Cc cc30 = (Cc)aa20;
						System.out.println(cc30.a);
						System.out.println(cc30.b);
						System.out.println(cc30.c);
					}
					
					cc30.a();
					cc30.b();
					cc30.c();
					
					
	}

}
