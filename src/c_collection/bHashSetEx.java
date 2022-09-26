package c_collection;
import java.util.HashSet;

public class bHashSetEx 
{
	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<String>();		// 순서 없음 → 중복되는 값인 elephant와 zebra가 몇 번째의 것이 출력된 것인지 알 수 없음. 
		set.add("rabbit");
		set.add("zebra");
		set.add("fox");
		set.add("zebra");
		set.add("elephant");
		set.add("elephant");	
		
		System.out.println( set );		
	}
}
