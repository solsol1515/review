package chapter05.EX_03;

import java.util.Arrays;

public class ArgumentOfMainMethod_02 {

	public static void main(String[] args) {
		// Main Method로 값 던져주기 
		
		System.out.println("----- args.length 내용 출력 -----");
		// args.length 내용 출력하기
		System.out.println(args.length);

		System.out.println("----- for문을 사용해서 Main Method args 출력 -----");
		// Main Method로 넘겨진 값을 자동으로 출력하기 
		for(int i=0; i<args.length; i++) {
			System.out.print(args[i]+" ");
		}
		
		System.out.println("\n"+"----- Enhanced for문을 사용해서 Main Method args 출력 -----");
		for(String k : args) {
			System.out.print(k+" ");
		}
		
		System.out.println("\n"+"----- Arrays.toString 출력 -----");
		System.out.println(Arrays.toString(args));
		
		
	}

}
