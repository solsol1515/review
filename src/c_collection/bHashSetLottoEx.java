package c_collection;
import java.util.*;

public class bHashSetLottoEx 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> lottos = new HashSet<Integer>();
		
		//for(int i=0; i<6; i++) {
			while(lottos.size()<6) { 
				int num = (int)(Math.random()*45)+1;
				lottos.add(num);
					
		}
		System.out.println(lottos);
		
		ArrayList list = new ArrayList(lottos);		
		Collections.sort(list);
		System.out.println(list);					// 정렬해서 출력
		
	}
}
