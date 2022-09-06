package chapter04_study.EX04;

public class Using_For_01 {

	public static void main(String[] args) {

		// 1+2+3+4+5=15 출력하기 
		
		
		int sum = 0;
		for(int a=1; a<=5; a++) {
			sum+=a;
			System.out.print(a);
			if(a<=4) {
				System.out.print("+");
			}else {
				System.out.print("=");
				System.out.println(sum);
			}
		}
		
		int sum1 = 0;
		for(int b=1; b<=10; b++) {
			sum1+=b;
			System.out.print(b);
			if(b<=9) {
				System.out.print("+");
			} else {
				System.out.print("=");
				System.out.print(sum1);
			}
		}
		
		
		
		
		
		
	}

}
