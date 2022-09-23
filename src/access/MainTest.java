package access;

import accother.Access;

public class MainTest extends Access{

	public static void main(String[] args) {
		
		MainTest acc = new MainTest();
		//acc.a = "프라이빗 변경";	// 해당 클래스에서만 접근 가능하기때문에 <오류발생>
		acc.b = "퍼블릭 변경";			
		acc.c = "프로텍티드 변경";	// 해당 패키지나 자식클래스일 경우만 접근 가능 <오류발생>
		/* 클래스를 받을 경우 자신의 클래스 이름으로 받아야 프로텍티드 접근 가능 
		Access acc = new Access();가 아닌 MainTest acc = new MainTest();로 받음*/
		// acc.d = "디폴트 변경";	// 같은 패키지만 접근 가능 <오류발생>
		acc.output();
		
		

	}

}
