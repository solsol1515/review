package chapter07.EX_03;

class AA {
	
	// 필드
	int a;
	int b;
	int c;
	int d;
	String name;
	
	// 생성자
	// 1. 기본 생성자 
	AA(){
		System.out.println("기본생성자 호출");
	}
	
	AA(int a){
		this.a = a;
	}
	
	AA(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	AA(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	AA(int a, int b, int c, int d){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	AA(int a, int b, int c, int d, String e){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		name = e;
	}
	
	void show() {
		System.out.println("a: "+a+"b: "+b+"c: "+c+"d: "+d);
		System.out.println("name: "+name);
	}
	
}

public class Using_Constructor_02 {

	public static void main(String[] args) {
		// Constructor(생성자) 오버로딩
		
		// 객체 생성
		AA aa1 = new AA();						// 기본생성자 호출
		aa1.show();
		System.out.println("----- 매개변수 1개인 기본생성자 호출 -----");
		
		// 매개변수 1개인 기본생성자 호출
		
		AA aa2 = new AA(10);
		aa2.show();
		
		System.out.println("----- 매개변수 2개인 기본생성자 호출 -----");
		
		// 매개변수 2개인 생성자 호출
		AA aa3 = new AA(10, 20);
		aa3.show();
		
		System.out.println("----- 매개변수 3개인 기본생성자 호출 -----");
		
		// 매개변수 3개인 기본생성자 호출
		
		AA aa4 = new AA(10, 20, 30);
		aa4.show();
		
		System.out.println("----- 매개변수 4개인 기본생성자 호출 -----");
		
		// 매개변수 4개인 기본생성자 호출 

		AA aa5 = new AA(10, 20, 30, 40);
		aa5.show();
		
		System.out.println("----- 매개변수 5개인 기본생성자 호출 -----");
		
		// 매개변수 5개인 기본생성자 호출
		AA aa6 = new AA(10, 20, 30, 40, "홍길동");
		aa6.show();
	}

}
