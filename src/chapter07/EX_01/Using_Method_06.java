package chapter07.EX_01;

public class Using_Method_06 {

	static int add (int[] a) {
		//  들어온 배열의 모든 값을 더해서 더한 값을 리턴
		int sum=0;														// 5. 각 배열의 방의 값을 가져와서 더한 뒤 저장
		for(int i=0; i<a.length; i++) {
			sum+=a[i];													// sum = sum + a[i] // 735
		}
		return sum;
	}
	
	static int div (int[] a) {
		//  들어온 배열의 모든 값을 빼서 뺀 값을 리턴
		int div = 7;
		for(int i=0; i<a.length; i++) {
			if(i==0) {continue;}										// i==0일 때는 아래의 내용을 실행하지 않고 for문 실행
			div-=a[i];													// div = div - a[i] // -721
		}
		return div;
	}
	
	static long mul (int[] a) {
		//  들어온 배열의 모든 값을 곱해서 곱한 값을 리턴
		long mul = 1;													// 곱할 때는 초기값을 0이 아닌 1로 설정(0으로 넣을 경우 모든 값이 0이됨)
		for(int i=0; i<a.length; i++) {
			mul*=a[i];													// *a[i] // mul = mul*a[i]
		}
		return mul;
	}
	
	static double avg (int[] a) {
		//  들어온 배열의 평균값을 리턴
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		double avg = sum /(double)a.length;
		return avg;
	}
	
	public static void main(String[] args) {
		// 1 ~ 100까지 7의 배수만 저장 후 각 메소드 호출
		// 배열의 7의 배수를 저장
		int[] arr1 = new int[100/7];									// 1. 배열의 방의 개수 지정 
				
		for(int i=0, j=7; i<arr1.length; i++, j+=7) {
			arr1[i] = j;												// 2. arr[0] = 7 ~ arr[13]
		}
		
		// 배열의 각 방의 내용을 출력											// 3.
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("----------------------------------------");
		
		// 메소드 호출: add(arr1)											// 4.
		int sum = add(arr1);											// 6.
		System.out.println("더한 값: "+sum);
		
		// 메소드 호출: div(arr1)
		int div = div(arr1);			// 변수명과 메소드명은 같아도 사용법이 다르기때문에 괜찮음.
		System.out.println("뺀 값: "+div);
		
		// 메소드 호출: mul(arr1)	int의 범위를 넘기때문에 long 사용
		long mul = mul(arr1);											// int: 1760012288 // long: 4513787149822699520
		System.out.println("곱한 값: "+mul);
		
		// 메소드 호출: avg(arr1)
		double avg = avg(arr1);
		System.out.println("평균값: "+avg);
		
		
		
	}

}
