package basic_04;

public class Student {
	
	private String hakbun;		// 접근 제어자 private으로 해당 class에서만 사용 가능
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
	// public Student() {} 기본 생성자 함수
	
	public Student() {
		//this.name = "홍홍이";
		//this.kor = 50;
		//this.eng = 50;
		//this.math = 50;
		this("이름없음", 50, 50, 50);	// 제일 첫번째 문장에 와야함
		System.out.println("기본생성자");
	}
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		System.out.println("인자 있는 생성자");
	}
	
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void calTotal() {
		total = kor + eng + math;
	}
	public void caㅣAvg() {
		avg = total / 3;
	}
	public void output() {
		System.out.println(name + "님 성적: " + total + "/" + avg);
	}

	/*
	 * 캡슐화
	 * 		- 멤버 변수 (field): private
	 * 		- 멤버 메소드: public
	 * 
	 * */
	
}
