package poly;

public class Book extends Item{

	private String author;			// 접근 제한자 private
	private String publisher;
	
	public Book() {
		this("001", "제목없음","무명","출판사");	// this 함수 사용
		System.out.println("Book 기본 생성자");
	}
	
	public Book(String num, String title, String author, String publisher) {
		super(num, title);			// 부모 클래스의 번호, 제목을 가져옴
		//super.num = num;			// 부모 클래스의 이름 가져오기
		//super.title = title;
		this.author = author;
		this.publisher = publisher;
		System.out.println("Book 인자 생성자");
	}
	
	//@Override
	public void output() {
		System.out.println("책 번호: "+num);
		System.out.println("책 제목: "+title);
		System.out.println("책 저자: "+author);
		System.out.println("책 출판사: "+publisher);
	}
	
	
}