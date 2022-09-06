package chapter04.EX04;

import java.util.Scanner;

public class Using_For_05 {

	public static void main(String[] args) {
		// 이중 For구문을 사용해서 1단 ~ 9단까지 출력
		/*	\n: enter, \t: tab
		 		1*1=1	1*2=2	1*3=3	... 1*9=9
		 		2*1=2	2*2=4	2*3=6	... 2*9=18
		 		...
		 		9*1=9 	9*2 =18 		... 9*9=81
		 */
		
		 for(int a=1; a<10; a++) {
			 for(int a1=1; a1<10; a1++) {
				 System.out.print(a+"*"+a1+"="+(a*a1)+"\t");
			 }	System.out.print("\n");
		 }
		 /* [선생님 해설지]
		 for(int i=1; i<10; i++) {
			 for(int j=1; j<10; j++) {
				 System.out.print(i+"*"+j+"="+(i*j));
			 }	System.out.print("\t");
		 	System.out.print();
		 }
		 */
		 
		 System.out.println("--------------- 구구단 끝 ---------------");
		 
		 // 1 ~ 19단까지 출력 3의 배수단만 출력
		 
		 for(int q=1; q<19; q++) {
			 for(int p=1; p<19; p++) {
				 if(q%3==0) {
					System.out.print(q+"*"+p+"="+(q*p));
					System.out.print("\t");
				 }
			 }
		 if(q%3==0) {
			 System.out.println();
		 }
		 }
		 
		// 스캐너에서 입력받은 단만 출력 (1~9단)
		// 출력할 단을 입력하세요 (1~9단) >>>
		// ======
		// 1*1=1
		// 1*2 =2
		// ...
		// 1*9=9
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 단을 입력하세요. (1~9단)");
		int hs = sc.nextInt();				
		
		for(int h=1; h<10; h++) {
			for(int s=1; s<10; s++) {
				if(hs==h) {
					System.out.println(hs + "*" + s + "=" + (hs*s));
				}
			}
		
		} 
		sc.close();
		

		/* [선생님 해설지]
		 Scanner sc = new Scanner(System.in);
		 
		System.out.println("출력할 단을 입력하세요. (1~9단) >>");
		int i = sc.nextInt();
		
		for (int j=1; j<10; j++) {
			System.out.println();
		}
		*/
}
}
