package chapter03.EX05;

public class LogicalOperator {

	public static void main(String[] args) {
		// 논리 연산자: &&(AND), ||(OR), ^(XOR), !(NOT)
		// 	-- 연산자 좌측과 우측에는 true or false
		
		// AND 연산: && (좌, 우 모두 true > true)
		System.out.println(true && true);   // true
		System.out.println(true && false);   // false
		System.out.println(true && (5<3));   // fasle
		System.out.println((5<=5) && (7>2));   // true
		System.out.println("==========================");
		
		// OR 연산: || (좌, 우 둘중 하나 true > true)
		System.out.println(true || true);   // true
		System.out.println(true || false);   // true
		System.out.println(false || (5<3));   // false
		System.out.println((5<=5) || (7>2));   // true
		System.out.println("==========================");
		
		// XOR연산: ^ (좌, 우가 동일할 경우: false, 다를 경우: true)
		System.out.println(true ^ true);   // false
		System.out.println(true ^ false);   // true
		System.out.println(false ^ (5<3));   // false
		System.out.println((5<=5) ^ (7>2));   // false
		System.out.println("==========================");
		
		// NOT: ! (반대로 출력, false > true / true > false)
		System.out.println(!true);   // false
		System.out.println(!false);   // true
		System.out.println(false || ! (5<3));   // true
		System.out.println((5<=5) || ! (7>2));   // true
		System.out.println("==========================");
		
		// 비트 연산자로 논리 연산을 수행
		System.out.println(true & true);   // true
		System.out.println(true & false);   // false
		System.out.println(true | (5<3));   // true
		System.out.println((5<=5) | (7>2));   // true
		System.out.println("==========================");
		
		// 숏 서킷(short circuit):
		//  - 왼쪽의 결과 값만으로 유추가 가능할 때, 오른쪽에 나오는 값을 실행X
		//  - 논리 연산자에서만 작동O: &&, ||, ^, !
		//  - 비트 연산자에서는 작동X: &, |, ^, ~
		
		// @ AND 연산에서 숏 서킷이 발생되는 예제
		// * 논리 연산에서는 short circuit이 발생 O
		int value1 = 3;
		System.out.println(false && ++value1 > 6);   // short circuit 작동
		// _false만으로도 AND 연산이 true가 될 수 없으므로 (false && ++value1 > 6)은 계산X
		System.out.println(value1);   // 3
		
		System.out.println(true && ++value1 > 6);
		System.out.println(value1);   // 4
		
		// * 비트 연산은 short circuit이 발생 X
		int value2 = 3;
		System.out.println(false & ++value2 > 6);   // false, *모두 확인해야함!
		System.out.println(value2);   // 4
		System.out.println("=====================");
		
		// @ OR연산에서 숏 서킷이 발생되는 예제 
		int value3 = 3;
		System.out.println(true || ++value3 > 6);   // true
		System.out.println(value3);   // 3 (숏 서킷 발생)
		
		int value4 = 3;
		System.out.println(true | ++value4 > 6);  // true
		System.out.println(value4);   // 4
		
	}

}