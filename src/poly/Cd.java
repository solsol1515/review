package poly;

public class Cd extends Item{

	private String singer;
	
	public Cd() {
		this("100", "forever1", "소녀시대");
		System.out.println("Cd 기본생성자");
	}
	public Cd(String num, String title, String singer) {
		this.num = num;
		this.title = title;
		this.singer = singer;
	}
	
	@Override
	public void output() {
		System.out.println("Cd 번호: "+num);
		System.out.println("Cd 제목: "+title);
		System.out.println("Cd 가수: "+singer);
	
	}
	
	
}
