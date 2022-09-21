package basic_03;

public class Ex09_Factorial {

	public static void main(String[] args) {
		
		int fact = factorial(5);
		System.out.println("!="+fact);
		
	}
	
	static int factorial(int i) {
		if(i==1) return 1;
		return i* factorial(i-1);
	}
}
/*
 * 5! = 5*4*3*2*1
 */
 