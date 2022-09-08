package chapter07.EX_01;

import java.util.Arrays;

public class Using_Method_08 {

	// 가변 길이 배열 입력 매개변수
	static void method1(int...values) {						// 가변 길이 배열 입력 매개변수
		/*
		 [for문]
		for(int i=0; i<values.length; i++) {
			System.out.print(values[i]+" ");
		}
		System.out.println();
		*/
		
		/*
		 [Enhanced for문]
		for(int k:values) {
			System.out.print(k+" ");
		}
		System.out.println();
		 */
		
		/*
		 [Arrays.toString]
		System.out.println(Arrays.toString(values));
		*/
	
	
	}
		
	static void method2(String...values) {
		// 임의의 문자열을 입력받아 출력
		
		for(int i=0; i<values.length; i++) {
			System.out.print(values[i]+" ");
		}
		
		System.out.println();
		System.out.println("----- Enhanced for -----");
		
		for(String k:values) {
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println("----- Arrays.toString -----");
		
		System.out.println(Arrays.toString(values));
		}
		
	
	
		
	
	
	
	public static void main(String[] args) {
		// 가변 길이 배열 메소드 (FlexableSizeArray Argument)
		
		method1(1, 2);
		method1(1, 2, 3, 4, 5);
		method1(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		System.out.println("----- method2 -----");
		
		method2("강감찬", "이순신", "홍길동");
		method2("호랑이", "토끼");
		method2("금붕어", "가물치", "잉어", "악어", "붕어");
		
	}

}