package c_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		// 1. 스택
		
		Stack s = new Stack();
		s.push("A");					// 데이터 입력 push
		s.push("B");
		s.push("C");
		
		System.out.println(s.pop());	// 출력 값 C(가장 마지막에 입력된 데이터 출력)_세로로 데이터 입력
		
		// 2. 큐_인터페이스
		
		Queue q = new LinkedList();
		q.offer("A");					// 데이터 입력 offer 
		q.offer("B");
		q.offer("C");
	
		System.out.println(q.poll());	// 출력 값 A(가장 먼저 입력된 데이터 출력)_가로로 데이터 입력	
	}

}
