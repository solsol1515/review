package chapter07.EX_05;

// 반드시 this keyword를 사용해야 하는 경우
	// 생성자, 메소드의 매개변수이름, 필드이름이 동일한 경우 필드이름에 this를 명시해야한다.

// this 키를 명시하지 않은 경우
class AA{
	int m;						// 0 
	int n;						// 0
	
	void init(int m, int n) {
		m = m;					// 3개의 m 모두 지역변수 
		n = n;
	}
}

// this 키를 명시한 경우 
class BB{
	int m;
	int n;
	
	void init(int m, int n) {
		this.m = m;				// this.m: 필드, m: 지역변수
		this.n = n;
	}
	
}



public class ThisKeyword_02 {

	public static void main(String[] args) {
		AA aa = new AA();				// 기본 생성자 호출
		aa.init(10, 20);
		System.out.println(aa.m);		// 0
		System.out.println(aa.n);		// 0
		
		BB bb = new BB();
		bb.init(10, 20);
		System.out.println(bb.m);		// 10
		System.out.println(bb.n);		// 20
		

	}

}
