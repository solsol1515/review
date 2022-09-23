package zfinal;

class Parent{
	final String field = "부모님 것";	// 값 변경 불가하게 만드는 'final' 사용
	final public void jip() {
		System.out.println("부모님이 만드신 것");
	}
}
	
class Child extends Parent{
	//String field = "자식 것";
	//public void jip() {}
	Child(){
		// field = "내 것";			// 부모 클래스에서 final 사용으로 변경 불가해 <오류발생>
	}
	/*public void jip() {
		System.out.println("불속성: 내가 탕진");	// final 사용으로 오버라이딩 불가
	}
	*/
}

public class Test {

	public static void main(String[] args) {

		Parent p = new Child();
		System.out.println(p.field);
		p.jip();
		

	}

}
