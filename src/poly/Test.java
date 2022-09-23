package poly;

public class Test {

	public static void main(String[] args) {

		Book b = new Book("001", "Do it! JAVA", "김동형","이지스퍼블리싱");
		b.output();
		System.out.println("----------");
		
		Dvd dvd = new Dvd();
		dvd.output();
		System.out.println("----------");
		
		Cd cd = new Cd();
		cd.output();
		// 인자 없는 클래스 호출
		//Book b = new Book();
		//b.output();
	}
	
}
