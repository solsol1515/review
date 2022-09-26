
package c_collection;
import java.util.ArrayList;

class aArrayListEx1
{
	public static void main(String[] args) {
		dataSet();
		ArrayList result = dataSet();
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		for(int i=0; i<result.size(); i++) {
			System.out.println(result.get(i));
		}
	}

	static ArrayList dataSet()
	{
		String	name = "김태희";
		Integer age = 31; 			//int age = 31;
		double	height = 162.3;
		
		ArrayList list = new ArrayList();	// 배열의 개수가 명확하지 않을 때 list 사용
		list.add(name);
		list.add(age);
		list.add(height);
		
		return list;
		
	}
}
