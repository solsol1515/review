package basic_05;

public class Book {
	
	private static int count;			//static > 공유됨 static을 입력해놓지 않으면 "총 개수:1"
	
	public Book() {
		count++;
		
	}
	
	public static int getCount(){
		return count;
	}
}
/*
 * static 
 * 	- 객체의 공유(객체에서 사용 시)
 * 	- 객체 생성보다 먼저 실행하기때문에 클래스명 접근(변수에서 사용 시)
 */
 