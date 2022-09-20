package basic_01;

public class Ex03_for응용 {

	public static void main(String[] args) {
		
		System.out.println("----- 알파벳 1회 출력 -----");
		
		for(char ch='A'; ch<'Z'; ch++) {
			System.out.print(ch+" ");
		}
		System.out.println();
		System.out.println("----- 알파벳 26회 출력 -----");
		for(int i=0; i<26; i++) {
			for(char ch='A'; ch<'Z'; ch++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
		System.out.println("----- 예제 문제 -----");
		/* [문제1] 
		A
		AB
		ABC
		ABCD
		:
		ABCDEFGHIJKLMNOPQRSTUVW
		ABCDEFGHIJKLMNOPQRSTUVWX
		ABCDEFGHIJKLMNOPQRSTUVWXY
		ABCDEFGHIJKLMNOPQRSTUVWXYZ
				*/
		System.out.println("--- [문제1] ---");
		for(int i=0; i<26; i++) {
			for(char a='A'; a<='A'+i; a++) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		
		System.out.println("--- [문제2] ---");
		
		/* [문제2]
		ABCDEFGHIJKLMNOPQRSTUVWXYZ
		ABCDEFGHIJKLMNOPQRSTUVWXY
		ABCDEFGHIJKLMNOPQRSTUVWX
		ABCDEFGHIJKLMNOPQRSTUVW
		ABCDEFGHIJKLMNOPQRSTUV
		:
		ABC
		AB
		A 
		*/
		
		for(int i=0; i<26; i++) {
			for(char z='A'; z<='Z'-i; z++) {
				System.out.print(z+" ");
			}
			System.out.println();
		}

		System.out.println("--- [문제3] ---");
			 
		/* [문제3]
		ABCDEFGHIJKLMNOPQRSTUVWXYZ
		BCDEFGHIJKLMNOPQRSTUVWXYZ
		CDEFGHIJKLMNOPQRSTUVWXYZ
		DEFGHIJKLMNOPQRSTUVWXYZ
		:
		XYZ
		YZ
		Z
		*/
		
		for(int i=0; i<26; i++) {
			
			for(int a='A'+i; a<='Z'; a++) {
				System.out.print((char)a+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("--- [문제4] ---");
		
		/* [문제4]
		Z
		ZY
		ZYX
		:
		ZYXWVUTSRQPONMLKJIHGFEDC
		ZYXWVUTSRQPONMLKJIHGFEDCB
		ZYXWVUTSRQPONMLKJIHGFEDCBA
		 * */
		
		
		for(int i=0; i<26; i++) {
			
			for(char a = 'Z'; a>='Z'-i; a--) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		
		System.out.println("--- [문제5] ---");
		
		/* [문제5]
		ABCDEFGHIJKLMNOPQRSTUVWXYZ
  		 BCDEFGHIJKLMNOPQRSTUVWXYZ
    	  CDEFGHIJKLMNOPQRSTUVWXYZ
      	   DEFGHIJKLMNOPQRSTUVWXYZ
       				:
        					  WXYZ
        					   XYZ
        						YZ
        						 Z 
		*/
		
		
		/*for(int i=0; i<26; i++) {
			
			for(char a = 'Z'; a>='Z'-i; a--) {
				System.out.print(a+" ");
			}
			System.out.println();
		}*/
		
		for(int i=0; i<26; i++) {
			
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int a = 'A'+i; a<='Z'; a++) {
				System.out.print((char)a);
			}
			System.out.println();
		}
		
		
	}

}
