package basic_05;

public class MainTest {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		System.out.println("총 개수: "+b1.getCount());
		
		Book b2 = new Book();
		System.out.println("총 개수: "+b2.getCount());
		/*
		Book b3 = new Book();
		System.out.println("총 개수: "+b3.count);
		
		System.out.println("총 개수: "+Book.getCount());
		*/
	}

}
// static은 클래스명 접근 가능 > 만약 카운트가 적용되지 않은 결과값을 출력하고 싶다면 클래스명을 입력할 것