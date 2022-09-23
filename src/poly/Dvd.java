package poly;

public class Dvd extends Item{

	private String actor;
	private String director;
	
	public Dvd() {
		this("010", "비긴어게인", "키이라 나이틀리", "존 카니");
		System.out.println("Dvd 기본 생성자");
	}
	public Dvd(String num, String title, String actor, String director) {
		this.num = num;
		this.title = title;
		this.actor = actor;
		this.director = director;
	}
	
	@Override
	public void output() {
		System.out.println("dvd 번호: "+num);
		System.out.println("dvd 제목: "+title);
		System.out.println("dvd 배우: "+actor);
		System.out.println("dvd 감독: "+director);
	}
	
}	
