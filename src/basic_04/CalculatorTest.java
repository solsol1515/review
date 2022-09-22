package basic_04;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.Content;

class CalculatorTest {								// 츌력 페이지

    public static void main( String [] args ) {
    	
    	CalculatorExpr cp = new CalculatorExpr();
    	Scanner input = new Scanner(System.in);	// 숫자 입력받을 스캐너 생성
    	int count = 0;
    	while(true) {
    	
		System.out.println("계산할 숫자를 정수로 입력해주세요.(1)");	// 첫번째 숫자 입력 문장 출력
		int a = input.nextInt();							// 첫번째 입력 받은 숫자를 변수 a에 저장
		System.out.println("계산할 숫자를 정수로 입력해주세요.(2)");	// 두번째 숫자 입력 문장 출력
		int b = input.nextInt();							// 두번째 입력 받은 숫자를 변수 b에 저장
		input.nextLine();						
		
		// 스캐너에 입력한 숫자 
		cp.setNum1(a);
		cp.setNum2(b);
		if(count != 0) {
			System.out.println("추출된 숫자: "+a+", "+b);
		}
		if(count == 100) count = 1;
		System.out.println(cp.getAddition());
		System.out.println(cp.getSubtraction());
		System.out.println(cp.getMultiplication());
		System.out.println(cp.getDivision());
		
		
		System.out.println("계속 진행하시겠습니까?");
		String i = input.nextLine();
		if(i.equalsIgnoreCase("Y")) {
			count++;
			System.out.println("덧셈: "+(a+b));
			System.out.println("뺄셈: "+(a-b));
			System.out.println("곱셈: "+(a*b));
			System.out.println("나눗셈 "+(a/b));
			continue;
		}else {
			break;
		 }
			//System.out.println("추출된 숫자: "+a+", "+b);
    	}
    	input.close();
		
    }

}