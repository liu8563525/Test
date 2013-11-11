package ocjp5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		for(int i=1;i<=8;i++){
			String aString=i+"";
			arrayList.add(aString);
			//System.out.println(aString);
		}
		Comparator<String> c = Collections.reverseOrder();
		Collections.sort(arrayList, c);
		int result=Collections.binarySearch(arrayList, "6",c);//杩斿洖2锛孋ollections.binarySearch(arrayList, "6")杩斿洖-9
		//Collections.sort(arrayList);
		//int result=Collections.binarySearch(arrayList, "6");//杩斿洖5
		System.out.println(result);
		List<Integer> list;//list<int>是编译不通过的
	}

}
