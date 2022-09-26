package c_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class aArrayListEx3 {

	public static void main(String[] args) {
		ArrayList<Student> result = method();	// result에 method()에서 받은 데이터 저장
		System.out.println("--- Enhanced for문 사용 ---");
		for(Student s : result) {				// 향상된 for문 result값을 s에 저장
			System.out.println(s);				
		}
		// [참고] 전체 요소를 순서대로 검색
		// Enumeration → Iterator
		System.out.println("----------");
		Iterator<Student> it = result.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

	static ArrayList<Student> method() {
		ArrayList<Student> list = new ArrayList<Student>();		// 생성자?????
		list.add(new Student("홍길동", 33));		// 변수 선언 생략(딱 1번만 사용할 때)
		list.add(new Student("차은우", 25));
		list.add(new Student("홍홍이", 22));
		return list;			// list에 담겨있는 데이터 반환
	}
}

//----------------------------------------------------------
class Student extends Object{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name +"학생은 " +  age + "세 입니다.";
	}
}
