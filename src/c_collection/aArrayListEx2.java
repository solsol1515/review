package c_collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) 
	{
		ArrayList<String>  list = new ArrayList<String>(4);
		list.add("rabbit");  
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		// 노란색 밑줄 없애려면 generics 지정 <String>_내가 넣고자 하는 자료형을 지정해주는 것(generics)
		
		list.set(3, "tiger");
		System.out.println(list);	// fox → tiger로 덮어씌움
		
		list.remove(1);		// zebra 삭제 
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		// System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			String data = (String)list.get(i);	// 형 변환 필요
			System.out.print(data+" ");
		}
		
		// 향상된 for문
		for(String data: list) {		// 출력할 변수 : 집합
			System.out.print(data+" ");	// generics가 있어야 형변환하는 코딩 생략 가능
		}
	}
}
