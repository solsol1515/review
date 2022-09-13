package chapter07.EX_04;

import java.util.Scanner;

class Converter{			// 환율을 계산하는 클래스
/*	// 1. 필드
	double rate;			// 환율을 저장하는 변수
	
	Converter(){}
	Converter(double rate){
	this.rate = rate;
	}
	
	// 2. 메소드 생성(달러를 인풋받아서 원화를 반환하는 메소드) 메소드 이름: toKWR()
	
	void show() {
		System.out.println(toKWR);
	}
	// 3. 메소드 생성(원화를 인풋받아서 달러를 출력하는 메소드) 메소드 이름: toUSD()	 
	
	void show() {
		System.out.println(toUSD);
	}
	
	
	// 4. setRate() 메소드 생성: setter를 사용해 rate 필드의 값 할당
}
*/
	//선생님 해설 
		// 1. 필드
		double rate;
		// 2. 메소드 생성 
		double toKRW(double dollar) {
			return dollar*rate;
		}
		// 3. 메소드 생성
		double toUSD(double won) {
			return won/rate;
		}
		// 4. setRate()
		void setRate(double rate) {
			this.rate = rate;
		}
	
}
public class Converter_Test_01 {

	public static void main(String[] args) {
		
		/*double toKWR = 1377.30;
		double toUSD = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("환율 입력: ");
		double w = sc.nextDouble();
		System.out.printf("100만원 → 달러: "+1000000/toKWR+"%.4f");
		System.out.printf("100달러 → 원화: "++"%.4f");
		
		Converter converter1 = new Converter();*/
		
		// 네이버 검색해서 오늘 환율 확인 후 2022. 09. 13. 기준 (1$ = 1,377.30원)
		
		// 객체 생성 후 스캐너로 환율 인풋 받아서 setRate() 메소드에 저장
		
		
		// 원화 1,000,000원 → 달러로 출력 
		
		
		
		// 달러 100$ → 원화로 출력

		
		
	// 선생님 해설 
		Scanner sc11 = new Scanner(System.in);
		
		System.out.println("1달러에 대한 오늘 환율을 입력하세요.");
		double rate = sc11.nextDouble();
		
		// 객체 생성
		Converter converter = new Converter();			// 기본 생성자 호출(생략됨)
		
		// 스캐너로 받은 rate 변수의 값을 setter주입
		converter.setRate(rate);
		
		// 메소드 호출(100만원 → 달러 변환 출력)
		System.out.println("원화 100만원 → 달러: "+ converter.toUSD(1000000)+"$");
		
		// 메소드 호출(100$ → 원화 변환 출력)
		System.out.println("100$ → 원화: "+converter.toKRW(100)+"원");
		
		
		System.out.println("----- 소수점 둘째자리까지만 출력 (printf()) -----");
		// 1. printf() 사용해서 출력
		System.out.printf("원화 100만원은 %.2f$입니다.", converter.toUSD(1000000));
		System.out.println();
		System.out.printf("100$는 %.2f원입니다.", converter.toKRW(100));
		
		// 2. 변수에 double값 할당 후 소수점 2번째자리까지 변환해서 출력 
		
		System.out.println();
		System.out.println("----- 예시 -----");
		double per2 = 3.141592123;
			// String으로 변환 후 per2의 변수의 값을 소수점 두번째자리까지 출력 후 다시 double형식으로 변환 
		double per1 = Double.parseDouble(String.format("%.2f", per2));
		System.out.println(per1);
		
		System.out.println("----- 실수를 변수에 할당 후 소수점 둘째자리까지 출력 후 다시 double로 저장 -----");
		
		double d2 = converter.toUSD(1000000);			// 실수를 리턴 받아서 d2변수에 할당
		double d1 = Double.parseDouble(String.format("%.2f", d2));
		System.out.println("원화 100만원: "+d1+"$");

		double d4 = converter.toKRW(100);
		double d3 = Double.parseDouble(String.format("%f", d4));
		System.out.println("100$: "+d3+"만원");
		
	}

}
