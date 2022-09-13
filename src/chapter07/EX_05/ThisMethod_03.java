package chapter07.EX_05;

class Book{
	String bookName;			// 책 이름
	String author;				// 저자
	
	Book(){
		bookName = "없음";
		author = "작자미상";
	}
	Book(String bookName){
		this();
		this.bookName = bookName;
	}
	Book(String bookName, String author){
	this(bookName);						// this() 메소드: 생성자 호출
	this.author = author;				// this 키워드: 자신의 객체의 필드, 메소드 가리킬 때 사용
	}
	
	void print() {							// 메모리의 필드의 값을 출력해줌
		System.out.println("책의 이름: "+bookName);
		System.out.println("책의 저자: "+author);
	}
	
}


public class ThisMethod_03 {

	public static void main(String[] args) {
		// 스캐너를 통해서 2개의 값(책 이름, 저자)을 인풋받기
		
		System.out.println("--- 1. 기본 생성자 호출 ---");
		// 1. 기본 생성자 호출
		Book book1 = new Book();			// 기본 생성자 호출
		book1.print();
		
		System.out.println("--- 2. 매개변수 1개인 생성자 호출 ---");
		// 2. 매개변수 1개인 생성자 호출("심청전")
		Book book2 = new Book("심청전");
		book2.print();
		
		System.out.println("--- 3. 매개변수 2개인 생성자 호출 ---");
		// 3. 매개변수 2개인 생성자 호출("홍길동전", "허균")
		Book book3 = new Book("홍길동전", "허균");
		book3.print();
		
		System.out.println("--- 4. 매개변수 2개인 생성자 호출 ---");
		// 4. 매개변수 2개인 생성자 호출("어린왕자", "생택쥐페리")
		Book book4 = new Book("어린왕자", "생택쥐페리");
		book4.print();
		
		System.out.println("--- 5. 매개변수 1개인 생성자 호출 ---");
		// 5. 매개변수 1개인 생성자 호출("포청천뎐")
		Book book5 = new Book("포청천뎐");
		book5.print();
	
	}

}
