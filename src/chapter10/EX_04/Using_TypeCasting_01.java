package chapter10.EX_04;

// 업 캐스팅(컴파일러가 자동으로 변환)
	// 기본 자료형: 좁은 범위(int) → 넓은 범위(double)
	// 상속: 자식 타입 → 부모 타입
// 다운 캐스팅(수동으로 직접 변환 필요)
	// 기본 자료형: 넓은 범위(double) → 좁은 범위(int) (자료가 소실)
	// 상속: 부모 타입 → 자식 타입 (실행 시 오류 발생 가능 O)

class A{}
class B extends A{}
class C extends B{}
class D extends B{}


public class Using_TypeCasting_01 {

	public static void main(String[] args) {
		// 1. 업 캐스팅(자동 변환): 생략 시 컴파일러가 자동으로 추가
		A ac = (A) new C();			// C → A 업캐스팅
		B bc = (B) new C();			// C → B 업캐스팅
		
		// bb는 A, B 포함, B타입으로 지정(A, B 모두 사용됨) 
		B bb = new B();
		A a = bb;					// bb(B → A 업캐스팅_A필드, 메소드)
		
		// 2. 다운 캐스팅(수동 변환): 캐스팅이 불가능한 경우, 실행 시 오류 발생
			// 다운 캐스팅이 불가한 경우
		
		A aa= new A();				// aa는 A 타입만 내포
		// B b = (B)aa;				// <실행 시 오류 발생>
			// aa는 B타입을 내포하고 있지 않으므로 다운 캐스팅 불가
			// 구문에는 문제 X, 실행 시 문제(예외) 발생
		// C c = (C)aa;				// <실행 시 오류 발생>
			// aa는 C타입을 내포하고 있지 않아 다운 캐스팅 불가
			// 구문에는 문제 X, 실행 시 오류 발생
		
		// 3. 다운 캐스팅 가능한 경우
		A ab = new B();				// ab는 A, B을 모두 내포, A타입 지정
		B b = (B) ab;				// A(부모) → B(자식) 다운 캐스팅 
		// C c = (C) ab;			// ab는 C타입을 내포하지 않으므로 캐스팅 불가
									// 구문 문제 X, 실행 시 오류 발생
		B bd = new D();				// bd는 A, B, D를 내포, B타입으로 지정
									// bd 는 A, B의 필드와 메소드를 접근
		D d = (D) bd;				// bd는 D를 내포하므로 B → D 다운 캐스팅
									// d는 A, B, D의 모든 필드와 메소드 사용 가능
		// C c = (C)bd;				// bd는 C를 내포하고 있지 않아 캐스팅 불가
									// 구문에는 문제 X, 실행 시 오류
		A ad = new D();				// ad는 A, B, D를 포함, A타입으로 지정
		B b1 = (B) ad;				// A → B (다운 캐스팅)
		D d1 = (D) ad;				// A → D (다운 캐스팅)
		// C c5 = (C) ad;			// ad는 C를 내포하고 있지 않아 캐스팅 불가 
									// 구문에는 문제 X, 실행 시 오류
	}

}
