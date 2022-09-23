package poly;

abstract public class Item {
	
	// 자식클래스에게만 접근 권한 주기위해서 접근 지정자를 protected로 저장
	protected String num;		// 번호
	protected String title;		// 제목
	
	public Item() {}
	public Item(String num, String title) {
		this.num = num;
		this.title = title;
	}
	
	abstract public void output();		// 미완성 상태 <오류발생> class의 앞에도 abstract를 붙여줘야함
}

